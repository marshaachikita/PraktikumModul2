package org.d3ifcool.praktikummodul2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class EditorFragment extends Fragment {
//    private InputKos mInputKos;
//
//    private MenuItem item;

//    InputKosDBConnector input_kos = new InputKosDBConnector(this.getActivity());
    Button btnAdd;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_editor, container, false);


//        final ArrayList<String> tampil = new ArrayList<>();
//        tampil.add("Buah Batu Regency");
//        tampil.add("Batununggal");
//        tampil.add("Sukapura Mengger Hilir");
//        tampil.add("Perumahan PU Sapta Taruna Buah Batu");
//        tampil.add("Griya Bandung Asri Ciganitri");
//        tampil.add("Perumahan Permata Buah Batu");
//        tampil.add("Perumahan Palm 2 Residence Sukapura");
//        tampil.add("Sukapura");
//        tampil.add("Palasari");
//        tampil.add("Sukabirus");
//        tampil.add("Ciganitri");
//        tampil.add("Sukabirus PGA");
//        tampil.add("Sukabirus Citereup");
//        tampil.add("Perumahan Pesona Bali");
//        tampil.add("Bojongsoang");
//        tampil.add("Dayeuhkolot Citereup");
//
//        ListView daftarArea = (ListView) rootView.findViewById(R.id.list_area);
//        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, tampil);
//        daftarArea.setAdapter(adapter);
//
//        daftarArea.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

//        btnTambahKos(rootView);

        btnAdd = (Button) rootView.findViewById(R.id.btnTambah);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), InputDataKos.class);
                startActivity(intent);
            }
        });
//        initializeView(rootView);

        return rootView;
    }

    private void initializeView(View rootView){

    }

//    @Override
//    public void onClick(View v) {
//
//    }




//    public class InputKos extends AppCompatActivity{
//        private EditText mNama, mLokasi, mHarga, mKategori, mFasilitas;
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//
//
//            mNama = (EditText) findViewById(R.id.edit_nama);
//            mLokasi = (EditText) findViewById(R.id.edit_lokasi);
//            mHarga = (EditText) findViewById(R.id.edit_harga);
//            mKategori = (EditText) findViewById(R.id.edit_kategori);
//            mFasilitas = (EditText) findViewById(R.id.edit_fasilitas);
//
//        }
//
//        @Override
//        public boolean onCreateOptionsMenu(Menu menu) {
//            // Inflate the menu options from the res/menu/menu_editor.xml file.
//            // This adds menu items to the app bar.
//            getMenuInflater().inflate(R.menu.menu_editor, menu);
//            return true;
//        }
//
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item) {
//            // Users clicked on a menu option in the app bar overflow menu
//            switch (item.getItemId()) {
//                // Respond to a click on the "Save" menu option
//                case R.id.action_save:
//                    // Do nothing for now
//                    insertData();
//                    finish();
//                    return true;
//                // Respond to a click on the "Delete" menu option
//                case R.id.action_delete:
//                    // Do nothing for now
//                    int result = getContentResolver().delete(CarkosContract.CarkosTables.CONTENT_URI, null, null);
//                    if (result > 0)
//                        finish();
//                    else
//                        Toast.makeText(this, "Delete Failed", Toast.LENGTH_LONG).show();
//                    return true;
//                // Respond to a click on the "Up" arrow button in the app bar
//                case android.R.id.home:
//                    // Navigate back to parent activity (CatalogActivity)
//                    NavUtils.navigateUpFromSameTask(this);
//                    return true;
//            }
//            return super.onOptionsItemSelected(item);
//        }
//
//        public void btnTambahKos(View view) {
//            insertData();
//        }
//
//        public void insertData(){
//
//            String nama = mNama.getText().toString().trim();
//            String lokasi = mLokasi.getText().toString().trim();
//            String harga = mHarga.getText().toString().trim();
//            String kategori = mKategori.getText().toString().trim();
//            String fasilitas = mFasilitas.getText().toString().trim();
//
//            ContentValues values = new ContentValues();
//            values.put(CarkosContract.CarkosTables.KOLOM_NAMA, nama);
//            values.put(CarkosContract.CarkosTables.KOLOM_LOKASI, lokasi);
//            values.put(CarkosContract.CarkosTables.KOLOM_HARGA, harga);
//            values.put(CarkosContract.CarkosTables.KOLOM_KATEGORI, kategori);
//            values.put(CarkosContract.CarkosTables.KOLOM_FASILITAS, fasilitas);
//
//            getContentResolver().insert(CarkosContract.CarkosTables.CONTENT_URI,values);
//        }
//    }
}
































