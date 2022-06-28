package com.example.practica_estilos;

import android.app.Activity;
import android.content.Intent;

public class varswitch {

    private static int temas;
    private static int spinnerTheme;

    public final static int PRIMER_ESTILO = 0;
    public final static int SEGUNDO_ESTILO = 1;
    public final static int Default = 2;

    public static void changeToTheme(Activity activity, int theme) {
        spinnerTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }
    public static void onActivityCreateSetTheme(Activity activity) {
        switch (spinnerTheme) {
            default:
            case PRIMER_ESTILO:
                activity.setTheme(R.style.PrimerEstilo);
                break;
            case SEGUNDO_ESTILO:
                activity.setTheme(R.style.SegundoEstilo);
                break;
            case Default:
                activity.setTheme(R.style.TercerEstilo);
                break;
        }
    }
}
