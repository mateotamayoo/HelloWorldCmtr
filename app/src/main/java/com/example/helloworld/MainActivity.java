package com.example.helloworld;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Mateo Tamayo
 * @version 1.0
 * Aplicacion que muestra el tipico ejemplo de Hola Mundo
 * <ol>
 *     <li>Hemos visto como se crean los recursos en XML</li>
 *     <li>Hemos instanciado en java un objeto TextView</li>
 *     <li>Hemos personalizado la imagen de la aplicación</li>
 * </ol>*/

public class MainActivity extends AppCompatActivity {

    private TextView tvMessageStart;
    private TextView tvMessageEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessageStart= findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.purple));
        tvMessageEnd.setText(R.string.messagePositiveText);
        tvMessageEnd = findViewById(R.id.tvMessageEnd);
    }
}