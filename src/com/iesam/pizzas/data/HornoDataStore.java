package com.iesam.pizzas.data;

import com.iesam.pizzas.domain.models.Horno;

import java.util.TreeMap;

public class HornoDataStore {
    private static HornoDataStore instance = null;

    private TreeMap<String, Horno> dataStore = new TreeMap<>();

    public void guardar(Horno horno) {
        dataStore.put(horno.getId(), horno);
    }

    public Horno get (String id) {
        return dataStore.get(id);
    }

    public static HornoDataStore getInstance() {
        if (instance == null) {
            instance = new HornoDataStore();
        }
        return instance;
    }
}
