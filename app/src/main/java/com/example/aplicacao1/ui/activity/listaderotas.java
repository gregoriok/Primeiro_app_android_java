package com.example.aplicacao1.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacao1.DAO.RotaDAO;
import com.example.aplicacao1.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class listaderotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaderotas);
        RotaDAO dao = new RotaDAO();
        setTitle("Lista de rotas");
        FloatingActionButton adicionar = findViewById(R.id.activity_listaderotas_botao);
        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(listaderotas.this,primeiraactivity.class
                ));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        RotaDAO dao = new RotaDAO();
        ListView listaDeRotas = findViewById(R.id.activity_listaderotas_lista);
        listaDeRotas.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                dao.todos()
        ));
    }
}