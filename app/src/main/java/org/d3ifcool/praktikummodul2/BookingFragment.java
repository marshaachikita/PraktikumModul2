package org.d3ifcool.praktikummodul2;


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
public class BookingFragment extends Fragment {


    public BookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_booking, container, false);

        final ArrayList<Kos> tampil = new ArrayList<>();
        tampil.add(new Kos("Nama Pemesan 1", "Tgl Pesan", "5000000"));
        tampil.add(new Kos("Nama Pemesan 2", "Tgl Pesan", "4500000"));
        tampil.add(new Kos("Nama Pemesan 3", "Tgl Pesan", "6500000"));
        tampil.add(new Kos("Nama Pemesan 4", "Tgl Pesan", "12000000"));
        tampil.add(new Kos("Nama Pemesan 5", "Tgl Pesan", "6250000"));
        tampil.add(new Kos("Nama Pemesan 6", "Tgl Pesan", "5500000"));
        tampil.add(new Kos("Nama Pemesan 7", "Tgl Pesan", "6700000"));
        tampil.add(new Kos("Nama Pemesan 8", "Tgl Pesan", "8000000"));
        tampil.add(new Kos("Nama Pemesan 9", "Tgl Pesan", "9250000"));
        tampil.add(new Kos("Nama Pemesan 10", "Tgl Pesan", "10000000"));

        ListView daftarTampil = (ListView) rootView.findViewById(R.id.list_databooking);
        AdapterBooking adapter = new AdapterBooking(getActivity(), tampil);
        daftarTampil.setAdapter(adapter);

        daftarTampil.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return rootView;
    }

}
