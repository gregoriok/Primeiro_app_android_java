package com.example.aplicacao1.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacao1.DAO.RotaDAO;
import com.example.aplicacao1.R;
import com.example.aplicacao1.model.Rota;

public class primeiraactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiraactivity);

        final RotaDAO dao = new RotaDAO();

        final EditText campo_nome_rota = findViewById(R.id.activity_primeiraactivity_nome_rota);
        final EditText campo_consumo = findViewById(R.id.activity_primeiraactivity_consumo);
        final EditText campo_km_rodado = findViewById(R.id.activity_primeiraactivity_Km_rodado);

        Button botaocalcular = findViewById(R.id.activity_primeiraactivity_botao_calcular);
        botaocalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String consumo = campo_consumo.getText().toString();
                String km_rodado = campo_km_rodado.getText().toString();
                String nome_rota = campo_nome_rota.getText().toString();
                int gasto;
                gasto= (Integer.parseInt(km_rodado))/(Integer.parseInt(consumo));
                Rota rota_criada = new Rota(nome_rota,consumo,km_rodado, gasto);
               dao.salva(rota_criada);

               finish();
            }
        });


    }
}
