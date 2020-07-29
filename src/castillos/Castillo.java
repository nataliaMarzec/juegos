package castillos;

import java.util.HashSet;
import java.util.Set;

import animales.Animal;
import domain.Personaje;



public abstract class Castillo{
	public double capacidadParaProducirPocimas;
	protected Set<Personaje>personajesQuePasaronPorCastillo=new HashSet<>();
	protected double puntosDeSabiduria;
	protected Animal animal;
    protected static  double puntajeDeSabiduriaMinima=2;
    
    
	public static double getPuntajeDeSabiduriaMinima() {
		return puntajeDeSabiduriaMinima;
	}
	public abstract double modificacionSabiduriaDelPersonaje(Personaje personaje,double sabiduria);
		
	public boolean tieneCapacidadParaCrearPocima(){
		return this.getCapacidadParaProducirPocimas()>=1;
	}
	
	public abstract void crearPocimaEn(Personaje personaje);
	
	
    public double getCapacidadParaProducirPocimas() {
	return this.capacidadParaProducirPocimas;
    }
	public Set<Personaje> getPersonajesQuePasaronPorCastillo() {
		return personajesQuePasaronPorCastillo;
	}
	public double cantidadPersonajesQuePasaronPorCastillo(){
		return this.getPersonajesQuePasaronPorCastillo().size();
	}
	public void agregarPersonaje(Personaje _personaje){
		this.getPersonajesQuePasaronPorCastillo().add(_personaje);
	}
	public boolean personajePasoPorCastillo(Personaje personaje){
		return this.getPersonajesQuePasaronPorCastillo().contains(personaje);
	}
		
	public abstract Animal crearAnimal();
	
	public boolean cargoAnimalA(Personaje personaje){
		return this.getPersonajesQuePasaronPorCastillo().stream()
		.map(p->personaje.esDuenioDe(animal)).findAny().get();
	}
	public abstract void registrarPersonaje(Personaje personaje);
	
	public abstract double capacidadPocimasRestada();
	
 
    
	
    
	
	

	
	

	
    
    
    }
