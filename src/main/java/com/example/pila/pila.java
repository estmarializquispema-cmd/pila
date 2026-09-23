package com.example.pila;

import java.util.ArrayList;
import java.util.List;

public class pila<T> {

    private List<T> elementos = new ArrayList<>();

    public void insertar(T elemento) {
        elementos.add(elemento);
    }

    public T eliminar() {
        if (elementos.isEmpty()) {
            return null;
        }

        return elementos.remove(elementos.size() - 1);
    }

    public List<T> ver() {
        return elementos;
    }

    public int tamanyo() {
        return elementos.size();
    }
}