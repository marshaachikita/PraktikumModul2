package org.d3ifcool.praktikummodul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);


    }

    public void btnSend(View view) {
        Toast.makeText(this, "Maaf, fitur ini masih dalam tahap pengembangan", Toast.LENGTH_SHORT).show();
    }
}
