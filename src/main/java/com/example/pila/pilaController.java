package com.example.pila;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class pilaController {

    private pila<String> pila = new pila<>();

    @GetMapping("/insertar")
    public String insertar(@RequestParam String elemento) {
        pila.insertar(elemento);

        return "Elemento insertado: " + elemento;
    }

    @GetMapping("/eliminar")
    public String eliminar() {

        String eliminado = pila.eliminar();

        if (eliminado == null) {
            return "La pila está vacía";
        }

        return "Elemento eliminado: " + eliminado;
    }

    @GetMapping("/ver")
    public List<String> ver() {
        return pila.ver();
    }

    @GetMapping("/tamanyo")
    public int tamanyo() {
        return pila.tamanyo();
    }
}
