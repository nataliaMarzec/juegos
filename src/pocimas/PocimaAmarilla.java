package pocimas;

import animales.Animal;
import domain.Personaje;

public class PocimaAmarilla extends Pocima{

	protected double energiadisminuida;
	protected double fuerzaDelVinculo;
	
	public PocimaAmarilla() {}

	@Override
	public TipoDePocima getTipoDePocima() {
		return TipoDePocima.POCIMA_AMARILLA;
	}

	@Override
	public void aplicarPocimaSegunSuColor(Animal animal, Personaje personaje) {
		this.disminuirEnergia(animal);
		this.disminuirFuerzaDelVinculoConDuenio(animal);
		    	
	}

	public void disminuirFuerzaDelVinculoConDuenio(Animal animal) {
		animal.setFuerzaDelVinculo(animal.getFuerzaDelVinculo()-3);
		
	}

	public void disminuirEnergia(Animal animal) {
		animal.setEnergia(animal.getEnergia()-10);		
	}

	@Override
	public void disminuirResistenciaAnimal(Animal animal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentarResistenciaAnimal(Animal animal) {
		// TODO Auto-generated method stub
		
	}

	
}
