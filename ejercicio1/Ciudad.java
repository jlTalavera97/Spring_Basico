package BS2_InyeccionDependencias.ejercicio1;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ciudad{

    String name;
    Integer numeroHabitantes;

}
