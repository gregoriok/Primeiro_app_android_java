package com.example.aplicacao1.DAO;

import com.example.aplicacao1.model.Rota;

import java.util.ArrayList;
import java.util.List;

public class RotaDAO {

    private final static List<Rota> rotas = new ArrayList<>();

    public void salva(Rota rota) {
        rotas.add(rota);
    }

    public List<Rota> todos() {
        return new ArrayList<>(rotas);
    }
}
