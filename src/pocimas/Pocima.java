package pocimas;

import animales.Animal;
import domain.Personaje;

public abstract class Pocima {

	
	public Pocima() {	
	}

	public abstract TipoDePocima getTipoDePocima();

	public abstract void aplicarPocimaSegunSuColor(Animal _animal, Personaje personaje);

	public abstract void disminuirResistenciaAnimal(Animal animal);
	
	public abstract void aumentarResistenciaAnimal(Animal animal);

	public void aumentarEnergiaAnimal(Animal animal){}
	

}
