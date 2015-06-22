package com.example.infonegara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_detail);
        ImageView imageViewGambarBendera = (ImageView) findViewById(
        		R.id.imageViewGambarBendera);
        TextView textViewNamaNegara = (TextView) findViewById(
        		R.id.textViewNamaNegara);
        TextView textViewKeterangan = (TextView) findViewById(
        		R.id.textViewKeterangan);
     
        // Peroleh data
        Bundle data = getIntent().getExtras();
     	String negara = data.getString("Negara");
     	String ibukota = data.getString("Ibukota");
     	String benua = data.getString("Benua");
     	String berdiri = data.getString("Berdiri");
     	String matauang = data.getString("Matauang");
   
     	double luas = data.getDouble("Luas");
     	int idBendera = data.getInt("Bendera");
     	
     	imageViewGambarBendera.setImageResource(
     			MainActivity.ID_BENDERA[idBendera - 1]);
     	textViewNamaNegara.setText(negara);
     	String keterangan = "Beribukota di " + ibukota + "\n" +
     	                    "Terletak di benua " + benua + "\n" +
     	                    "dengan luas = " + luas + 
     	                    " kilometer persegi.\n" +
     	                    "Negara ini berdiri sejak " + 
     	                    berdiri + ".\n" +
     	                    "Matauang berupa " + matauang + ".\n\n";
     	                    
     	
     	textViewKeterangan.setText(keterangan);
     	
        Button tombolTutup = (Button) findViewById(R.id.buttonTutup);
        tombolTutup.setOnClickListener(new View.OnClickListener() {
			
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });
	}
}
