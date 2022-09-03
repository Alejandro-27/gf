package com.Factory.Factory;

//import Entidades.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //(exclude = {SecurityException.class})
@RestController
public class FactoryApplication {

@GetMapping("/gomez")

public String gomez(){
	return "Haciendo pruevas con Spring boot";
}

	/*@GetMapping("/prueba")

	public String prueba(){
	Empresa pru = new Empresa("Factory ", "Villavicencio-Colombia", 000000, 123456789);


	return "La empresa " + pru.getNombre() + "de la ciudad " + pru.getDireccion();
	}*/



	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
		System.out.println("Alejandro Gómez");
	}

}
