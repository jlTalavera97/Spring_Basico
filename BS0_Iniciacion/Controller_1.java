package com.example.BS0_Iniciacion;

import org.springframework.web.bind.annotation.*;


@RestController()
public class Controller_1 {

    @GetMapping("/user/{nombre}")
    public String HolaUser(@PathVariable String nombre)
    {
     return "Hola "+nombre;
    }

    @PostMapping("/userage")
    public Persona agePlusOne(@RequestBody Persona p)
    {
        p.setEdad(p.getEdad()+1);
        return p;
    }
}
