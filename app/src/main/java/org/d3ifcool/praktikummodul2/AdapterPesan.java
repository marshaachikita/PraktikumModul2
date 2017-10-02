package org.d3ifcool.praktikummodul2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 3/14/2017.
 */
public class AdapterPesan extends ArrayAdapter {

    public AdapterPesan(Context konteks, List<Kos> object) {
        super(konteks, 0, object);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_pesan, parent, false);
        }
        Kos current = (Kos) getItem(position);

        de.hdodenhof.circleimageview.CircleImageView gambar = (de.hdodenhof.circleimageview.CircleImageView) convertView.findViewById(R.id.circleView);
        gambar.setImageResource(current.getGambar());
        gambar.setVisibility(View.VISIBLE);

        TextView pemilik_kost = (TextView) convertView.findViewById(R.id.pemilik_kost);
        pemilik_kost.setText(current.getPemilikKos());

        return convertView;
    }
}
