package com.iesam.pizzas.domain.useCases;

import com.iesam.pizzas.data.HornoDataStore;
import com.iesam.pizzas.domain.models.Horno;

public class GuardarHornoUseCase {
    private HornoDataStore hornoDataStore = HornoDataStore.getInstance();

    public void execute(Horno horno){
        hornoDataStore.guardar(horno);
    }
    
}
