package BS2_InyeccionDependencias.ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador2 {

    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/addPersonaPor2")
    public Persona devuelvePersonaPor2(@RequestHeader(value= "name") String name, @RequestHeader(value = "ciudad")
            String ciudad, @RequestHeader(value = "edad") Integer edad)
    {
        return personaService.devuelvePersonaPor2(name,ciudad,edad);
    }

    @GetMapping("/controlador2/getCiudad")
    public List<Ciudad> devuelveCiudades(){
        return ciudadService.getCiudad();
    }

}
