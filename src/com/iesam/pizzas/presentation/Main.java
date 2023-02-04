package com.iesam.pizzas.presentation;

import com.iesam.pizzas.data.HornoDataStore;
import com.iesam.pizzas.domain.models.*;
import com.iesam.pizzas.domain.useCases.CogerHornoUseCase;
import com.iesam.pizzas.domain.useCases.GuardarHornoUseCase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        Main main = new Main(); //Al ser estático, no se puede acceder a los métodos de la propia clase.
        main.crearHornos(); //Crear los hornos y almacenarlos en el dataStore para que puedan ser "cogidos" por las pizzas
        main.carta(); //Crear e imprimir las pizzas.

        /*
        Si se diera otra utilidad para las pizzas, como modificar los ingredientes, habría que crear también el
        dataStore de las pizzas, ya que se crean en un método fuera de este y no se guardan en el ningún
        momento, y los casos de uso correspondientes.
        */

        /*
        La impresión de la carta se ha realizado en el método "CARTA()". Se puede ver como que no cumple el primer
        principio SOLID, es decir, que no realiza una única cosa porque crea e imprime las pizzas, pero yo lo he
        hecho por el motivo de que es el método que hace la carta al completo y para no crear el dataStore y los
        casos de uso de las pizzas.
         */


        //OPCION SENCILLA DE RESOLVER EL EJERCICIO (solo haciendo lo que se pide):
        /*
        No haría falta crear ni dataStore ni casos de uso ni lo creado anteriormente. Este public static void main
        contendría lo siguiente:

            //Creación de hornos:

            Horno hornoA = new Horno();
            Horno hornoB = new Horno();
            Horno hornoC = new Horno();

            hornoA.setId("A");
            hornoA.setNombre("Horno tipo A");
            hornoA.setMarca("Siemens");
            hornoA.setTemperatura("500");
            guardar.execute(hornoA);

            hornoB.setId("B");
            hornoB.setNombre("Horno tipo B");
            hornoB.setMarca("marcaB");
            hornoB.setTemperatura("1000");
            guardar.execute(hornoB);

            hornoC.setId("C");
            hornoC.setNombre("Horno tipo C");
            hornoC.setMarca("marcaC");
            hornoC.setTemperatura("800");
            guardar.execute(hornoC);

            //Creación de pizzas:

            PizzaCampera campera = new PizzaCampera();
            PizzaBarbacoa barbacoa = new PizzaBarbacoa();
            PizzaCarbonara carbonara = new PizzaCarbonara();

            campera.setId("1");
            campera.setNombre("Campera");
            campera.setSalsa("Tomate");
            campera.addExtra("Atun");
            campera.setCarne(false);
            campera.setHorno(hornoA);

            barbacoa.setId("2");
            barbacoa.setNombre("Barbacoa");
            barbacoa.setSalsa("barbacoa-miel");
            barbacoa.addExtra("Carne picada");
            barbacoa.addExtra("salsa barbacoa");
            barbacoa.setPicante(true);
            barbacoa.setHorno(hornoB);

            carbonara.setId("3");
            carbonara.setNombre("Carbonara");
            carbonara.setSalsa("Queso chedar");
            carbonara.addExtra("Champiñon");
            carbonara.setQuesoAzul(true);
            carbonara.setQuesoCabra(false);
            barbacoa.setHorno(hornoC);



         */

    }

    private void crearHornos (){
        GuardarHornoUseCase guardar = new GuardarHornoUseCase();

        Horno hornoA = new Horno();
        Horno hornoB = new Horno();
        Horno hornoC = new Horno();

        hornoA.setId("A");
        hornoA.setNombre("Horno tipo A");
        hornoA.setMarca("Siemens");
        hornoA.setTemperatura("500");
        guardar.execute(hornoA);

        hornoB.setId("B");
        hornoB.setNombre("Horno tipo B");
        hornoB.setMarca("marcaB");
        hornoB.setTemperatura("1000");
        guardar.execute(hornoB);

        hornoC.setId("C");
        hornoC.setNombre("Horno tipo C");
        hornoC.setMarca("marcaC");
        hornoC.setTemperatura("800");
        guardar.execute(hornoC);
    }

    public void carta(){

        CogerHornoUseCase cogerHorno = new CogerHornoUseCase();

        PizzaCampera campera = new PizzaCampera();
        PizzaBarbacoa barbacoa = new PizzaBarbacoa();
        PizzaCarbonara carbonara = new PizzaCarbonara();

        campera.setId("1");
        campera.setNombre("Campera");
        campera.setSalsa("Tomate");
        campera.addExtra("Atun");
        campera.setCarne(false);
        campera.setHorno(cogerHorno.execute("A"));

        barbacoa.setId("2");
        barbacoa.setNombre("Barbacoa");
        barbacoa.setSalsa("barbacoa-miel");
        barbacoa.addExtra("Carne picada");
        barbacoa.addExtra("salsa barbacoa");
        barbacoa.setPicante(true);
        barbacoa.setHorno(cogerHorno.execute("B"));

        carbonara.setId("3");
        carbonara.setNombre("Carbonara");
        carbonara.setSalsa("Queso chedar");
        carbonara.addExtra("Champiñon");
        carbonara.setQuesoAzul(true);
        carbonara.setQuesoCabra(false);
        barbacoa.setHorno(cogerHorno.execute("C"));

        //Impresion de la carta
        PrintCarta print = new PrintCarta();
        print.printCampera(campera);
        print.printBarbacoa(barbacoa);
        print.printCarbonara(carbonara);

    }
}
