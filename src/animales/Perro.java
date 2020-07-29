package animales;

import domain.Personaje;

public class Perro extends Animal{


	public Perro(double energia, double resistencia) {
		this.energia=energia;
		this.resistencia=resistencia;
	}


	@Override
	public void evaluarPosibleCambioDeDuenio(Personaje duenio, int cuantoAumenta) {
		if(this.fuerzaDelVinculo==0){
			duenio.getAnimalesPropios().remove(this);
		}
		double fuerza=this.fuerzaDelVinculo+cuantoAumenta;
		if(fuerza>=5){
		this.setPersonaje(duenio);
			
		}
			
		
		
	}


	

}
