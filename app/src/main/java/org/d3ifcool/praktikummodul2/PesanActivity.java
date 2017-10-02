package org.d3ifcool.praktikummodul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PesanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

//        final ArrayList<Kos> tampil = new ArrayList<>();
//        tampil.add(new Kos(R.drawable.putri , "Sulastri"));
//        tampil.add(new Kos(R.drawable.putra , "Agus Sumadi"));
//        tampil.add(new Kos(R.drawable.putra , "Cahya Bagus"));
//        tampil.add(new Kos(R.drawable.putri , "Kartika Putri"));
//
//
//        ListView daftarTampil = (ListView) findViewById(R.id.list_kost);
//        AdapterKos adapter = new AdapterKos(this, tampil);
//        daftarTampil.setAdapter(adapter);
//
//        daftarTampil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });
    }
}
