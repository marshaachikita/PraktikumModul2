package org.d3ifcool.praktikummodul2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UserProfileActivity extends AppCompatActivity {

    ImageView picture;
    TextView name, email;
    FirebaseUser userGoogle = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        picture = (ImageView) findViewById(R.id.dp);
        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);

        if(userGoogle != null){
            // Name, email address, and profile photo Url
            String p_name = userGoogle.getDisplayName();
            String p_email = userGoogle.getEmail();
            final String photoUrl = userGoogle.getPhotoUrl().toString();

            String uid = userGoogle.getUid();

            name.setText(p_name);
            email.setText(p_email);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        URL url = new URL(photoUrl);
                        InputStream is = url.openConnection().getInputStream();
                        final Bitmap bmp = BitmapFactory.decodeStream(is);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                picture.setImageBitmap(bmp);
                            }
                        });

                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }else{
            Toast.makeText(UserProfileActivity.this, "No user loged-in", Toast.LENGTH_LONG).show();
        }

    }
}
