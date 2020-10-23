package com.poo.main;

import java.util.ArrayList;
import java.util.List;

import com.poo.models.Persona;

public class UsoPersona {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.setNombres("Jose Guillermo");
		p1.setApellidos("Parra Aponte");
		p1.setDni("95937395");
		p1.setEdad(33);

		Persona p2 = new Persona();
		p2.setNombres("Doralis Teomara");
		p2.setApellidos("Quiñones Rosales");
		p2.setDni("95999979");
		p2.setEdad(30);

		Persona p3 = new Persona("Ana Karina", "Parra Aponte", "18232212", 32);

		List<Persona> listaPersona = new ArrayList<Persona>();
		listaPersona.add(p1);
		listaPersona.add(p2);
		listaPersona.add(p3);
		for (Persona persona : listaPersona) {
			System.out.println(persona.toString());
		}

	}

}
