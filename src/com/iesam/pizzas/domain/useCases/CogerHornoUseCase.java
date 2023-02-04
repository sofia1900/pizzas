package com.iesam.pizzas.domain.useCases;

import com.iesam.pizzas.data.HornoDataStore;
import com.iesam.pizzas.domain.models.Horno;

public class CogerHornoUseCase {
    private HornoDataStore hornoDataStore = HornoDataStore.getInstance();

    public Horno execute(String id){
        return hornoDataStore.get(id);
    }
}
