package BS2_InyeccionDependencias.ejercicio1;

import java.util.List;

public interface CiudadService {

    void addCiudad(String name, Integer numeroHabitantes);

    List<Ciudad> getCiudad();
}
