package org.d3ifcool.praktikummodul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuUtamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

//        final ArrayList<Kos> tampil = new ArrayList<>();
//        tampil.add(new Kos(R.drawable.kosan , "Nama Kos 1", "Lokasi1", "Harga Kos1", "Cewek"));
//        tampil.add(new Kos(R.drawable.kosan1, "Nama Kos 2", "Lokasi2", "Harga Kos2", "Cewek"));
//        tampil.add(new Kos(R.drawable.kosan2, "Nama Kos 3", "Lokasi3", "Harga Kos3", "Cowok"));
//
//        ListView daftarTampil = (ListView) findViewById(R.id.list_kost);
//        AdapterKos adapter = new AdapterKos(this, tampil);
//        daftarTampil.setAdapter(adapter);
//
//        daftarTampil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if(position==0){
//                    Intent i = new Intent(getApplicationContext(),KosanSatuActivity.class);
//                    startActivity(i);
//                }
//
//            }
//        });
    }
}
