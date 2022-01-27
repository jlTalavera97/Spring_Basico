package com.example.BS2_InyeccionDependencias;

//@Service
public class PersonaServiceImpl implements PersonaService {

    Persona p = new Persona();

    @Override
    public Persona devuelvePersona(String name, String ciudad, Integer edad)
    {
        p.setName(name);
        p.setCiudad(ciudad);
        p.setEdad(edad);

        return p;
    }

    @Override
    public Persona devuelvePersonaPor2(String name, String ciudad, Integer edad) {
        p.setName(name);
        p.setCiudad(ciudad);
        p.setEdad(edad*2);

        return p;
    }
}
