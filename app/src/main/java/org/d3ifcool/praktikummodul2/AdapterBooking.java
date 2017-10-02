package org.d3ifcool.praktikummodul2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 5/4/2017.
 */
public class AdapterBooking extends ArrayAdapter {

    public AdapterBooking(Context konteks, List<Kos> object) {
        super(konteks, 0, object);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_booking, parent, false);
        }
        Kos current = (Kos) getItem(position);

        TextView nama_pemesan = (TextView) convertView.findViewById(R.id.nama_pemesan);
        nama_pemesan.setText(current.getNama_pemesan());

        TextView tgl_pesan = (TextView) convertView.findViewById(R.id.tgl_pesan);
        tgl_pesan.setText(current.getTgl_pesan());

        TextView total = (TextView) convertView.findViewById(R.id.total_harga);
        total.setText(current.getTotal());

        return convertView;
    }
}
