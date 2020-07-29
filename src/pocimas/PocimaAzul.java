package pocimas;

import animales.Animal;
import domain.Personaje;

public class PocimaAzul extends Pocima{
	protected double resistenciaAumentada;
	protected double resistenciaDisminuida;
	
    public PocimaAzul(){}
	public PocimaAzul(double resistenciaAumentada,double resistenciaDisminuida) {
		this.resistenciaAumentada=resistenciaAumentada;
		this.resistenciaDisminuida=resistenciaDisminuida;
	}
	@Override
	public TipoDePocima getTipoDePocima() {
		return TipoDePocima.POCIMA_AZUL;
	}
	@Override
	public void aplicarPocimaSegunSuColor(Animal animal, Personaje personaje) {
		if(animal.esDeDuenio(personaje)){
		       this.aumentarResistenciaAnimal(animal);
		}
		if(!animal.esDeDuenio(personaje)||!personaje.equals(personaje)){//ajeno=!equals 
			   this.disminuirResistenciaAnimal(animal);
		}		
	}
	@Override
	public void disminuirResistenciaAnimal(Animal animal) {
		   animal.setResistencia(animal.getResistencia()-this.resistenciaAumentada);
		
	}
	@Override
	public void aumentarResistenciaAnimal(Animal animal){
		   animal.setResistencia(animal.getResistencia()+this.resistenciaDisminuida);
	}
	
	public double getResistenciaAumentada() {
		return this.resistenciaAumentada;
	}
	
	public double getResistenciaDisminuida(){
		return this.resistenciaDisminuida;
	
	}
	public void setResistenciaAumentada(double resistenciaAumentada) {
		this.resistenciaAumentada = resistenciaAumentada;
	}
	public void setResistenciaDisminuida(double resistenciaDisminuida) {
		this.resistenciaDisminuida = resistenciaDisminuida;
	}
	
	

}
