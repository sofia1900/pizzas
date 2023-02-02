package com.iesam.pizzas.domain.models;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String id;
    private String nombre;
    private String salsa;
    private List<String> extras = new ArrayList<>();
    private Horno horno;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public List<String> getExtras() {
        return extras;
    }

    public void addExtra(String extra) {
        this.extras.add(extra);
    }

    public Horno getHorno() {
        return horno;
    }

    public void setHorno(Horno horno) {
        this.horno = horno;
    }
}
