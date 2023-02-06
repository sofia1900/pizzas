package com.iesam.pizzas.presentation;

import com.iesam.pizzas.domain.models.PizzaBarbacoa;
import com.iesam.pizzas.domain.models.PizzaCampera;
import com.iesam.pizzas.domain.models.PizzaCarbonara;

public class PrintCarta {
    public void printBarbacoa(PizzaBarbacoa pizza){
        System.out.println(pizza.getNombre() + ":");
        System.out.println("\t salsa: " + pizza.getSalsa());
        System.out.println("\t extras: " + pizza.getExtras());
        System.out.println("\t picante: " + pizza.getPicante());
    }

    public void printCarbonara(PizzaCarbonara pizza){
        System.out.println(pizza.getNombre() + ":");
        System.out.println("\t salsa: " + pizza.getSalsa());
        System.out.println("\t extras: " + pizza.getExtras());
        System.out.println("\t queso azul: " + pizza.getQuesoAzul());
        System.out.println("\t queso de cabra: " + pizza.getQuesoCabra());

    }

    public void printCampera(PizzaCampera pizza){
        System.out.println(pizza.getNombre() + ":");
        System.out.println("\t salsa: " + pizza.getSalsa());
        System.out.println("\t extras: " + pizza.getExtras());
        System.out.println("\t carne: " + pizza.getCarne());

    }
}
