package com.example.BS2_InyeccionDependencias;

public interface PersonaService {

    Persona devuelvePersona(String name, String ciudad, Integer edad);

    Persona devuelvePersonaPor2(String name, String ciudad, Integer edad);

}

