package com.example.infonegara;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;

public class MainActivity extends Activity { 
    static final public Integer[] ID_BENDERA = {
        R.drawable.at_s,
        R.drawable.au_s,
        R.drawable.bt_s,
        R.drawable.ca_s,
        R.drawable.fr_s,
        R.drawable.gb_s,
        R.drawable.id_s,
        R.drawable.it_s,
        R.drawable.kr_s,
        R.drawable.nz_s,
        R.drawable.sg_s,
        R.drawable.us_s
    };

	ArrayList<RincianData> hasil; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.activity_main);
		
        ArrayList<RincianData> listData = perolehData();
	        
        final ListView listViewData = (ListView) findViewById(R.id.listViewData);
        AdapterDaftarItem adapter = new AdapterDaftarItem(this, listData);
        listViewData.setAdapter(adapter);
        listViewData.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) { 
                Object terpilih = listViewData.getItemAtPosition(position);
                RincianData rincian = (RincianData) terpilih;
                
                // Bentuk Intent untuk menampilkan detail negara
                Intent intent = new Intent(MainActivity.this, InfoDetail.class);

                Bundle data = new Bundle();
                data.putString("Negara", rincian.perolehNegara());
                data.putString("Ibukota", rincian.perolehIbukota());
                data.putString("Benua", rincian.perolehBenua());
                data.putString("Berdiri", rincian.perolehBerdiri());
                data.putString("Matauang", rincian.perolehMatauang());
                data.putDouble("Luas", rincian.perolehLuas());
                data.putInt("Bendera", rincian.perolehIdBendera());
                
                intent.putExtras(data);
                startActivityForResult(intent, 1);
         	}          	 
        });
    }
	
    private ArrayList<RincianData> perolehData(){
        hasil = new ArrayList<RincianData>(); 
    	
        RincianData data;
    	
        data = new RincianData("Austria", "Vienna", "Eropa", 
        		               "01-01-1156", "Euro (EUR)", 83856, 1);
        hasil.add(data);
  
        data = new RincianData("Australia", "Canberra", "Australia", 
        		              "01-01-1901", "Dollar (AUD)", 7741220, 2);
        hasil.add(data);

        data = new RincianData("Bhutan", "Thimphu", "Asia", 
	                           "08-08-1949", "Ngultrum (BTN)", 47000, 3);
        hasil.add(data);

        data = new RincianData("Kanada", "Ottawa", "Amerika", 
                               "08-089-1763", "Dollar (CAD)", 9976140, 4);
        hasil.add(data);

        data = new RincianData("Prancis", "Paris", "Eropa", 
                               "01-01-486", "Euro (EUR)", 551500, 5);
        hasil.add(data);

        data = new RincianData("Inggris", "London", "Eropa", 
                               "01-01-1701", "Pound (GBP)", 242900, 6);
        hasil.add(data);

        data = new RincianData("Indonesia", "Jakarta", "Asia", 
                               "17-08-1945", "Rupiah (IDR)", 1904570, 7);
        hasil.add(data);

        data = new RincianData("Italia", "Roma", "Eropa", 
                               "1861", "Euro (EUR)", 301270, 8);
        hasil.add(data);

        data = new RincianData("Korea Selatan", "Seoul", "Asia", 
                               "15-08-1945", "Won (KRW)", 99538, 9);
        hasil.add(data);

        data = new RincianData("Selandia Baru", "Wellington", "Austria", 
                               "26-09-1907", "Dollar (NZD)", 270534, 10);
        hasil.add(data);

        data = new RincianData("Singapura", "Singapura", "Asia", 
                               "09-08-1965", "Dollar (SGD)", 683, 11);
        hasil.add(data);

        data = new RincianData("Amerika Serikat", "Washington", "Amerika", 
                               "04-07-1776", "Dollar (USD)", 9629090, 12);
        hasil.add(data);

        return(hasil);
    }	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
