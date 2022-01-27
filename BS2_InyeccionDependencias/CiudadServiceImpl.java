package com.example.BS2_InyeccionDependencias;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {

    List<Ciudad> listaCiudades = new ArrayList<>();

    @Override
    public void addCiudad(String name, Integer numeroHabitantes) {
        Ciudad c = new Ciudad();
        c.setName(name);
        c.setNumeroHabitantes(numeroHabitantes);
        listaCiudades.add(c);
    }

    @Override
    public List<Ciudad> getCiudad() {
        return listaCiudades;
    }
}
