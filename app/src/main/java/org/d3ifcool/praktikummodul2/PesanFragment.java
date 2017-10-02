package org.d3ifcool.praktikummodul2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PesanFragment extends Fragment {


    public PesanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_pesan, container, false);

        final ArrayList<Kos> tampil = new ArrayList<>();
        tampil.add(new Kos(R.drawable.putri , "Pemesan Kos1"));
        tampil.add(new Kos(R.drawable.putra , "Pemesan Kos2"));
        tampil.add(new Kos(R.drawable.putra , "Pemesan Kos3"));
        tampil.add(new Kos(R.drawable.putri , "Pemesan Kos4"));
        tampil.add(new Kos(R.drawable.putri , "Pemesan Kos5"));


        ListView daftarTampil = (ListView) rootView.findViewById(R.id.list_pesan);
        AdapterPesan adapter = new AdapterPesan(getActivity(), tampil);
        daftarTampil.setAdapter(adapter);

        daftarTampil.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i = new Intent(getActivity().getApplicationContext(),ChatActivity.class);
                    startActivity(i);
                }else if(position==1){
                    Intent i = new Intent(getActivity().getApplicationContext(),ChatActivity.class);
                    startActivity(i);
                }else if(position==2){
                    Intent i = new Intent(getActivity().getApplicationContext(),ChatActivity.class);
                    startActivity(i);
                }else if(position==3){
                    Intent i = new Intent(getActivity().getApplicationContext(),ChatActivity.class);
                    startActivity(i);
                }
            }
        });

        return rootView;
    }

//    public void showData(){
//        Cursor c = getContentResolver().query(CarkosContract.CarkosTables.CONTENT_URI, null,null,null,null);
//
//        StringBuilder builder = new StringBuilder();
//
//        while(c.moveToNext()){
//            builder.append(c.getString(c.getColumnIndex(CarkosContract.CarkosTables.KOLOM_ID))).append(" - ")
//                    .append(c.getString(c.getColumnIndex(PetContract.PetTables.KOLOM_NAMA))).append(" - ")
//                    .append(c.getString(c.getColumnIndex(PetContract.PetTables.KOLOM_BREED))).append(" - ")
//                    .append(c.getString(c.getColumnIndex(PetContract.PetTables.KOLOM_GENDER))).append(" - ")
//                    .append(c.getString(c.getColumnIndex(PetContract.PetTables.KOLOM_WEIGHT))).append("\n");
//        }
//
//        TextView text = (TextView) findViewById(R.id.text_view_pet);
//        text.setText("Jumlah Mahasiswa: " + c.getCount() + "\n" + "\n" + builder.toString());
//    }


}
