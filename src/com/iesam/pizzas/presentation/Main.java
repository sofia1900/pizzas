package com.iesam.pizzas.presentation;

import com.iesam.pizzas.data.HornoDataStore;
import com.iesam.pizzas.domain.models.*;
import com.iesam.pizzas.domain.useCases.CogerHornoUseCase;
import com.iesam.pizzas.domain.useCases.GuardarHornoUseCase;

public class Main {
    public static void main (String[] args){
        Main main = new Main(); //Al ser estático, no se puede acceder a los métodos de la propia clase.
        main.crearHornos();
        main.crearPizzas();
        
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
        PizzaCampera campera = new PizzaCampera();
        PizzaBarbacoa barbacoa = new PizzaBarbacoa();
        PizzaCarbonara carbonara = new PizzaCarbonara();

        CogerHornoUseCase cogerHorno = new CogerHornoUseCase();

        campera.setId("1");
        campera.setNombre("Campera");
        campera.setSalsa("Tomate");
        campera.addExtra("Atun");
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

    }
}
