package castillos;

import animales.Animal;
import animales.Hiena;
import domain.Personaje;
import pocimas.Pocima;
import pocimas.PocimaAmarilla;

public class Maligno extends Castillo{

	
	public Maligno(double capacidadParaProducirPocimas) {
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
		Pocima pocima=new PocimaAmarilla();
		personaje.agregarPocima(pocima);
			
	}
	@Override
	public double capacidadPocimasRestada() {
		capacidadParaProducirPocimas=capacidadParaProducirPocimas-1;
		return capacidadParaProducirPocimas;
	}
	
	@Override
	public double modificacionSabiduriaDelPersonaje(Personaje personaje,double sabiduria) {
		double minimo=Double.MIN_VALUE;
		minimo=0;
		double sabiduriaQueQueda=sabiduria-5;
		double sabiduriaDelPersonaje=Math.min(minimo,sabiduriaQueQueda);
	    return sabiduriaDelPersonaje;
	}

	@Override
	public Animal crearAnimal() {
		return new Hiena(6, 2);
	}


	
	

}
