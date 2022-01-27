package BS2_InyeccionDependencias.ejercicio1;

import com.example.BS0_Iniciacion.PersonaService;
import com.example.BS0_Iniciacion.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestHeader;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	@Qualifier("bean1")
	PersonaService bean1()
	{
		PersonaService p = new PersonaServiceImpl();
		p.setName("bean1");
		return p;
	}

	@Bean
	@Qualifier("bean2")
	PersonaService bean2()
	{
		PersonaService p = new PersonaServiceImpl();
		p.setName("bean2");
		return p;
	}

	@Bean
	@Qualifier("bean3")
	PersonaService bean3()
	{
		PersonaService p = new PersonaServiceImpl();
		p.setName("bean3");
		return p;
	}
}
