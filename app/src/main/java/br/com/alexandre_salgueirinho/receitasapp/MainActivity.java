package br.com.alexandre_salgueirinho.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoBolo = (Button) findViewById(R.id.botao_bolo);
        botaoBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BoloActivity.class);
                startActivity(intent);
            }
        });

        Button botaoTorta = (Button) findViewById(R.id.botao_torta);
        botaoTorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TortaActivity.class);
                startActivity(intent);
            }
        });

        Button botaoCookie = (Button) findViewById(R.id.botao_cookie);
        botaoCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CookieActivity.class);
                startActivity(intent);
            }
        });

        Button botaoSorvete = (Button) findViewById(R.id.botao_sorvete);
        botaoSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SorveteActivity.class);
                startActivity(intent);
            }
        });
    }
}
