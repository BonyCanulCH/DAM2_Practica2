package com.example.practica_estilos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ThemedSpinnerAdapter;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerEstilo;
    private static int temas;

    public final static int PRIMER_ESTILO = 0;
    public final static int SEGUNDO_ESTILO = 1;
    public final static int Default = 2;
    public static int currentPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerEstilo = (Spinner) findViewById(R.id.spin1);
        spinnerEstilo.setSelection(MainActivity.currentPosition);
        MainActivity.currentPosition = spinnerEstilo.getSelectedItemPosition();
        

        spinnerEstilo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(currentPosition != position) {
                    varswitch.changeToTheme(MainActivity.this, position);
                }
                MainActivity.currentPosition = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        /*public static void changeToTheme(Activity varswitch, int theme) {
            temas = theme;
            varswitch.finish();
            varswitch.startActivity(new Intent(varswitch, varswitch.getClass()));
        }*/

       /*public static void onActivityCreateSetTheme(Activity varswitch){
            switch(temas){
                default:
                case PRIMER_ESTILO:
                    varswitch.setTheme(R.style.PrimerEstilo);
                    break;
                case SEGUNDO_ESTILO:
                    varswitch.setTheme(R.style.SegundoEstilo);
                    break;
                case Default:
                    varswitch.setTheme(R.style.TercerEstilo);
            }
        }*/
    }
}