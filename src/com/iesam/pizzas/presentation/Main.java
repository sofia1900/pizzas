package com.iesam.pizzas.presentation;

import com.iesam.pizzas.data.HornoDataStore;
import com.iesam.pizzas.domain.models.*;
import com.iesam.pizzas.domain.useCases.CogerHornoUseCase;
import com.iesam.pizzas.domain.useCases.GuardarHornoUseCase;

public class Main {
    public static void main (String[] args){

        Main main = new Main(); //Al ser estático, no se puede acceder a los métodos de la propia clase.
        main.crearHornos(); //Crear los hornos y almacenarlos en el dataStore para que puedan ser "cogidos" por las pizzas
        main.crearPizzas(); //Crear las pizzas. Si se diera otra utilidad para las pizzas, como imprimir la carta,
                            //habría que crear también el dataStore de las pizzas.

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

    public void crearPizzas(){

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

        System.out.println(campera.getHorno());

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

    }
}
