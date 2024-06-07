package com.example.tala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btnSearch;
    TextView tvDetails;

    ImageView imageVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        btnSearch = (Button) findViewById(R.id.button);
        tvDetails = (TextView) findViewById(R.id.textView);
        imageVer = (ImageView)findViewById(R.id.imageView);

        tvDetails.setText("");

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Obtener el párrafo ingresado en el EditText
                String paragraph = editText.getText().toString();

                // Error de microfono
                if (paragraph.contains("Microfóno")
                        || paragraph.contains("micrófono")
                        || paragraph.contains("Micrófono")
                        || paragraph.contains("Problemas con el micrófono")
                        || paragraph.contains("problemas con el micrófono")
                        || paragraph.contains("Problemas en el micrófono")
                        || paragraph.contains("problemas en el micrófono")
                        || paragraph.contains("Microfono")
                        || paragraph.contains("Error de micrófono")
                        || paragraph.contains("error de micrófono")
                        || paragraph.contains("Error de microfono")
                        || paragraph.contains("error de microfono")

                        || paragraph.contains("no me escuchan cuando hablo")
                        || paragraph.contains("No me escuchan cuando hablo")
                ) {
                    tvDetails.setText(R.string.error_microfono);
                    editText.setText("");
                    imageVer.setImageResource(R.drawable.microfono);

                }
                //Error de pantalla
                else if (paragraph.contains("pantalla")
                        || paragraph.contains("Pantalla")
                        || paragraph.contains("Pantalla rota")
                        || paragraph.contains("Se escucha sonido")
                        || paragraph.contains("se escucha sonido")
                        || paragraph.contains("Se escucha sonido pero no se ve imagen")
                        || paragraph.contains("se escucha sonido pero no se ve imagen")
                        || paragraph.contains("No se ve imagen")
                        || paragraph.contains("no se ve imagen")
                        || paragraph.contains("No veo imagen")
                        || paragraph.contains("no veo imagen")
                        || paragraph.contains("Pantalla esta negra")
                        || paragraph.contains("pantalla esta negra")
                        || paragraph.contains("Lo hice caer")
                        || paragraph.contains("lo hice caer")
                        || paragraph.contains("Le di un golpe")
                        || paragraph.contains("le di un golpe")
                        || paragraph.contains("Se cayo y no muestra imagen")
                        || paragraph.contains("se cayo y no muestra imagen")
                        || paragraph.contains("Se cayo")
                        || paragraph.contains("se cayo")
                        || paragraph.contains("Pantalla oscura")
                        || paragraph.contains("Pantalla clisada")
                        || paragraph.contains("pantalla rota")
                        || paragraph.contains("pantalla oscura")
                        || paragraph.contains("pantalla clisada")) {
                    tvDetails.setText(R.string.error_pantalla);
                    editText.setText("");
                    imageVer.setImageResource(R.drawable.pantalla);

                }
                //Error de placa
                else if (paragraph.contains("placa")
                        || paragraph.contains("error de placa")
                        || paragraph.contains("Error de placa")
                        || paragraph.contains("lo hice caer al agua")
                        || paragraph.contains("Lo hice caer al agua")
                        || paragraph.contains("error en la placa")
                        || paragraph.contains("Error en la placa")
                        || paragraph.contains("placa quemada")
                        || paragraph.contains("Placa quemada")
                        || paragraph.contains("Placa dañada")
                        || paragraph.contains("placa dañada")
                        || paragraph.contains("Placa")) {
                    tvDetails.setText(R.string.error_placa);
                    editText.setText("");
                    imageVer.setImageResource(R.drawable.errorplaca);
                }
                //Error corto circuito, no sube bateria
                else if (paragraph.contains("Corto")
                        || paragraph.contains("corto")
                        || paragraph.contains("Corto circuito")
                        || paragraph.contains("corto circuito")
                        || paragraph.contains("Bateria")
                        || paragraph.contains("bateria")
                        || paragraph.contains("Bateria dañada")
                        || paragraph.contains("bateria dañada")

                        || paragraph.contains("Lo hice caer al agua ahora no carga")
                        || paragraph.contains("lo hice caer al agua ahora no carga")
                        || paragraph.contains("Lo hice caer al agua ahora no enciende")
                        || paragraph.contains("lo hice caer al agua ahora no enciende")
                        || paragraph.contains("No sube  nivel de bateria")
                        || paragraph.contains("no sube  nivel de bateria")
                        || paragraph.contains("Carga no sube")
                        || paragraph.contains("carga no sube")
                        || paragraph.contains("Bateria no sube")
                        || paragraph.contains("Bateria esta mal")
                        || paragraph.contains("bateria esta mal")
                        || paragraph.contains("bateria no sube")) {
                    tvDetails.setText(R.string.error_carga);
                    editText.setText("");
                    imageVer.setImageResource(R.drawable.cortocircuito);
                }

                //Error parlante - altavoz
                else if (paragraph.contains("Parlante")
                        || paragraph.contains("parlante")
                        || paragraph.contains("Altavoz")
                        || paragraph.contains("altavoz")
                        || paragraph.contains("No hay sonido")
                        || paragraph.contains("no hay sonido")
                        || paragraph.contains("Mi parlante esta dañado")
                        || paragraph.contains("mi parlante esta dañado")
                        || paragraph.contains("No se escucha el altavoz")
                        || paragraph.contains("no se escucha el altavoz")

                        || paragraph.contains("Mi altavoz esta dañado")
                        || paragraph.contains("mi altavoz esta dañado")
                        || paragraph.contains("No se escucha el parlante")
                        || paragraph.contains("no se escucha el parlante")

                        || paragraph.contains("La hice caer al agua ahora no se escucha el sonido")
                        || paragraph.contains("la hice caer al agua ahora no se escucha el sonido")

                ) {
                    tvDetails.setText(R.string.error_parlante);
                    editText.setText("");
                    imageVer.setImageResource(R.drawable.parlante);
                }
                //Error de carga
                else if (paragraph.contains("Mi celular no carga")
                        || paragraph.contains("mi celular no carga")
                        || paragraph.contains("Mi celular ya no carga")
                        || paragraph.contains("mi celular ya no carga")
                        || paragraph.contains("No carga")
                        || paragraph.contains("no carga")
                        || paragraph.contains("Ya no quiere cargar")
                        || paragraph.contains("ya no quiere cargar")
                        || paragraph.contains("No quiere cargar")
                        || paragraph.contains("no quiere cargar")
                        || paragraph.contains("Carga")
                        || paragraph.contains("carga")

                        || paragraph.contains("Lo hice caer al agua y ahora no carga")
                        || paragraph.contains("lo hice caer al agua y ahora no carga")

                        || paragraph.contains("Lo hice caer al agua ahora no puedo cargalo")
                        || paragraph.contains("lo hice caer al agua y ahora no puedo cargalo")
                ) {
                    tvDetails.setText(R.string.error_carga);
                    editText.setText("");
                    imageVer.setImageResource(R.drawable.carga);
                }
                //celular no carga

                else {
                    tvDetails.setText(R.string.por_favor);

                }
            }


        });

    }
}