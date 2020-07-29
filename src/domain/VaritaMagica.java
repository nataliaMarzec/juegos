package domain;

import animales.Animal;

public class VaritaMagica extends Varita{

	@Override
	public void aplicarVaritaAUn(Personaje duenio, Animal animal) {
		animal.aumentarFuerzaDelVinculoDeAnimalConDuenio(duenio);
		
		
	}

	

}
