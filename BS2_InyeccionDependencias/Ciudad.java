package com.example.BS2_InyeccionDependencias;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Ciudad{

    String name;
    Integer numeroHabitantes;

}
