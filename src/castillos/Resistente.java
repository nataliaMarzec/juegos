package castillos;


import animales.Animal;
import animales.Buey;
import animales.Perro;
import domain.Personaje;
import pocimas.Pocima;
import pocimas.PocimaAmarilla;

public class Resistente extends Castillo{

	public Resistente(double capacidadParaProducirPocimas) {
		this.capacidadParaProducirPocimas=capacidadParaProducirPocimas;
		
	}

	@Override
	public void registrarPersonaje(Personaje personaje) {
		this.agregarPersonaje(personaje);
		if(this.tieneCapacidadParaCrearPocima()){
		this.crearPocimaEn(personaje);
		this.capacidadPocimasRestada();
		
	 }		
	}
	@Override
	public void crearPocimaEn(Personaje personaje) {
		Pocima pocima= new PocimaAmarilla();
		personaje.getPocimasPropias().add(pocima);
		
	}
	@Override
	public double capacidadPocimasRestada() {
		capacidadParaProducirPocimas=capacidadParaProducirPocimas-1;
		return capacidadParaProducirPocimas;
	}
	@Override
	public double modificacionSabiduriaDelPersonaje(Personaje personaje,double _sabiduria){
		double sabiduria= _sabiduria+Castillo.getPuntajeDeSabiduriaMinima();
		double maximo=Double.MAX_VALUE;
		maximo=30;
		double sabiduriaDelPersonaje=Math.min(maximo,sabiduria);
		personaje.setSabiduria(sabiduriaDelPersonaje);
	    return sabiduriaDelPersonaje;
		
		}

	@Override
	public Animal crearAnimal(){
		Animal animal=
		this.cantidadPersonajesQuePasaronPorCastillo()%2==0 ? 
				new Buey(5, 12)
				:new Perro(this.cantidadPersonajesQuePasaronPorCastillo(),this.cantidadPersonajesQuePasaronPorCastillo());
		return animal;
	}


	

	

	

	

	
}
