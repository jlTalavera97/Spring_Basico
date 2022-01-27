package com.example.BS2_InyeccionDependencias;

import java.util.List;

public interface CiudadService {

    void addCiudad(String name, Integer numeroHabitantes);

    List<Ciudad> getCiudad();
}
