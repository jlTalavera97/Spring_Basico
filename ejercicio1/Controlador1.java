package BS2_InyeccionDependencias.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {
    Persona p1 = new Persona();
    Persona p2 = new Persona();
    Persona p3 = new Persona();

    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/controlador1/addPersona")
    public Persona devuelvePersona(@RequestHeader(value= "name") String name, @RequestHeader(value = "ciudad")
            String ciudad, @RequestHeader(value = "edad") Integer edad)
    {
        return personaService.devuelvePersona(name,ciudad,edad);
    }

    @PostMapping("/controlador1/addCiudad")
    public void addCiudad(@RequestHeader(value = "name") String name, @RequestHeader(value = "numeroHabitantes")
            Integer numeroHabitantes){
        ciudadService.addCiudad(name,numeroHabitantes);
    }

    @GetMapping("/controlador/bean/{bean}")
    public Persona getName(@PathVariable String bean)
    {
        switch (bean)
        {
            case "bean1":
                p1.setName(bean);
                return p1;

            case "bean2":
                p2.setName(bean);
                return p2;

            case "bean3":
                p3.setName(bean);
                return p3;
        }
        return null;
    }

}
