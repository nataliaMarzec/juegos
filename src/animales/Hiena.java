package animales;

import domain.Personaje;

public class Hiena extends Animal{
	

	public Hiena(double energia, double resistencia) {
		this.energia=energia;
		this.resistencia=resistencia;
	}

	@Override
	public void evaluarPosibleCambioDeDuenio(Personaje duenio, int cuantoAumenta) {
		if(this.esEnergiaMultiploDeTres()){
			duenio.getAnimalesPropios().remove(this);
		}
		if(!this.esDeDuenio(duenio)&&cuantoAumenta==8){
			this.setDuenio(duenio);
		}
		if(cuantoAumenta>=15){
			duenio.getAnimalesPropios().remove(this);
			this.setDuenio(duenio);
		}
		
	}

	public boolean esEnergiaMultiploDeTres() {
		return this.energia%3==0;
	}

	public void setDuenio(Personaje duenio) {
		this.personaje=duenio;
		
	}
	
	
}