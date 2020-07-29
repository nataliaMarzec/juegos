package animales;

import domain.Personaje;

public class Buey extends Animal{

	public Buey(double energia, double resistencia) {
	    this.energia=energia;
	    this.resistencia=resistencia;
		
	}

	@Override
	public void evaluarPosibleCambioDeDuenio(Personaje personaje,int cuantoAumenta) {
		if(this.fuerzaDelVinculo<5){
			personaje.getAnimalesPropios().remove(this);
			}
		  if(this.esDeDuenio(null)&&cuantoAumenta>10){
			  this.setDuenio(personaje);
			  this.fuerzaDelVinculo=fuerzaDelVinculo+cuantoAumenta;		  
			  
		}
	}

	protected void setDuenio(Personaje personaje) {
		this.personaje=personaje;
		
	}
	public void bajarResistencia(int cuantoResistencia){
		int disminucionMaxima=Integer.MAX_VALUE;
		disminucionMaxima=4;
		if(cuantoResistencia>disminucionMaxima){
			this.resistencia=resistencia-cuantoResistencia;
		}
	
	}
	

}
