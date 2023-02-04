package com.iesam.pizzas.domain.useCases;

import com.iesam.pizzas.data.HornoDataStore;
import com.iesam.pizzas.domain.models.Horno;

public class GuardarHornoUseCase {
    HornoDataStore hornoDataStore = new HornoDataStore();

    public void execute(Horno horno){
        hornoDataStore.guardar(horno);
    }
    
}
