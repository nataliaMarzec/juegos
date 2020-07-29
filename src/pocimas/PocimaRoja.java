package pocimas;

import animales.Animal;
import domain.Personaje;



public class PocimaRoja extends Pocima{
	protected double cantidad;

	public PocimaRoja() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public TipoDePocima getTipoDePocima() {
		return TipoDePocima.POCIMA_ROJA;
	}

	@Override
	public void aplicarPocimaSegunSuColor(Animal animal, Personaje personaje) {
	    if(personaje.esAnimalPropio(animal)){
	    	this.aumentarResistenciaAnimal(animal);
	    }
	    if(!personaje.esDuenioDe(animal)&& !personaje.equals(personaje)){
	    	this.disminuirResistenciaAnimal(animal);
 }
		
	}

	@Override
	public void disminuirResistenciaAnimal(Animal animal) {
		animal.setResistencia(animal.getResistencia()-3);
		
	}

	@Override
	public void aumentarEnergiaAnimal(Animal animal) {
		animal.setEnergia(animal.getEnergia()+4);
		
	}

	@Override
	public void aumentarResistenciaAnimal(Animal animal) {
		// TODO Auto-generated method stub
		
	}

	

	

}
