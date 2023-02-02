package com.iesam.pizzas.presentation;

import com.iesam.pizzas.domain.models.Horno;

public class Main {
    public static void main (String[] args){
        Horno hornoA = new Horno();
        Horno hornoB = new Horno();
        Horno hornoC = new Horno();

        hornoA.setId("A");
        hornoA.setNombre("Horno tipo A");
        hornoA.setMarca("Siemens");
        hornoA.setTemperatura("500");

        hornoB.setId("B");
        hornoB.setNombre("Horno tipo B");
        hornoB.setMarca("marcaB");
        hornoB.setTemperatura("1000");

        hornoC.setId("C");
        hornoC.setNombre("Horno tipo C");
        hornoC.setMarca("marcaC");
        hornoC.setTemperatura("800");
    }
}
