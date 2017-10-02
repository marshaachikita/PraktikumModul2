package org.d3ifcool.praktikummodul2;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuUtamaFragment extends Fragment {

//    CarkosDbConnector helper = new CarkosDbConnector(getActivity());
    public MenuUtamaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_menu_utama, container, false);

//        final ArrayList<Kos> tampil = new ArrayList<>();
//        tampil.add(new Kos(R.drawable.kosan , "Nama Kos 1", "Lokasi1", "Harga Kos1", "Putri", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan1, "Nama Kos 2", "Lokasi2", "Harga Kos2", "Putri", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan2, "Nama Kos 3", "Lokasi3", "Harga Kos3", "Putra", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan, "Nama Kos 4", "Lokasi4", "Harga Kos4", "Putra", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan1, "Nama Kos 5", "Lokasi5", "Harga Kos5", "Putra", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan2, "Nama Kos 6", "Lokasi6", "Harga Kos6", "Putri", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan, "Nama Kos 7", "Lokasi7", "Harga Kos7", "Putra", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan1, "Nama Kos 8", "Lokasi8", "Harga Kos8", "Putri", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan2, "Nama Kos 9", "Lokasi9", "Harga Kos9", "Putra", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan, "Nama Kos 10", "Lokasi10", "Harga Kos10", "Putri", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan1, "Nama Kos 11", "Lokasi11", "Harga Kos11", "Putri", "Kelola Data"));
//        tampil.add(new Kos(R.drawable.kosan2, "Nama Kos 12", "Lokasi12", "Harga Kos12", "Putra", "Kelola Data"));
//
//        ListView daftarTampil = (ListView) rootView.findViewById(R.id.list_kost);
//        AdapterKelolaKos adapter = new AdapterKelolaKos(getActivity(), tampil);
//        daftarTampil.setAdapter(adapter);
//
//        daftarTampil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if(position==0){
//                    Intent i = new Intent(getActivity().getApplicationContext(),KosanSatuActivity.class);
//                    startActivity(i);
//                }else if(position==1){
//                    Intent i = new Intent(getActivity().getApplicationContext(),KosanDuaActivity.class);
//                    startActivity(i);
//                }
//            }
//        });

        return rootView;
    }

//    public void TampilData(View view){
//
//        StringBuffer buffer = new StringBuffer();
//        Cursor dbTampil = helper.tampilDataKos();
//
//        String namakos, lokasi, harga, kategori;
//
//        while(dbTampil.moveToNext()){
//           // buffer.append(dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_NAMAKOS)));
////            buffer.append(dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_LOKASI)));
////            buffer.append(dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_HARGA)));
////            buffer.append(dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_KATEGORI)));
//            namakos = dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_NAMAKOS));
//            lokasi = dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_LOKASI));
//            harga = dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_HARGA));
//            kategori = dbTampil.getString(dbTampil.getColumnIndex(CarkosDbConnector.KOLOM_KATEGORI));
//
//        }
//
//        buffer.toString();
//    }

}
