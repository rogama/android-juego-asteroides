package com.rogama.asteroides;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Asteroides extends Activity {

	private Button bAcercaDe;//Declaramos un boton con el nombre bAcercaDe
	private Button bSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        bAcercaDe = (Button) findViewById(R.id.button3);//al boton arriba declarado le asignamos el de la vista, el correspondiente al texto acerca de
        bAcercaDe.setOnClickListener(new OnClickListener() {//Le asignamos un listener al evento Onclick
        	
			public void onClick(View view) {//al hacer click vendra aqui y ejecutara lo que contiene este procedimiento
				lanzarAcercaDe(null);//saltamos a la funcion abajo declarada
				
			}
		});
        bSalir = (Button) findViewById(R.id.button4);
        bSalir.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				salir(null);	
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.asteroides, menu);
        return true;
    }
    
    public void lanzarAcercaDe(View view) {
		Intent i = new Intent(this,AcercaDe.class);
		startActivity(i);
	}
    
    public void salir(View view) {
		finish();
	}
}
