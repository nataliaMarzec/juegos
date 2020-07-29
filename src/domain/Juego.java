package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import animales.Animal;
import castillos.Castillo;


  public class Juego {
	protected Personaje personaje;
	protected double cantidadPocimas;
	protected List<Castillo>castillos=new ArrayList<>();
	protected double antiguedad;
	protected Set<Personaje>personajesDelEntorno=new HashSet<>();	
	public List<Animal>animalesDelEntorno=new ArrayList<>();


	
  public void pedirCrearAnimales(){
	 this.getCastillos().forEach(c->this.agregarAnimalSuelto(c.crearAnimal()));  	  
  }
  public List<Animal> getAnimalesSueltos() {
	return animalesDelEntorno;
}
  public void setAnimalesSueltos(List<Animal> animalesSueltos) {
	this.animalesDelEntorno = animalesSueltos;
}
  public void agregarAnimalSuelto(Animal animal){
	  this.animalesDelEntorno.add(animal);
  }
  
  public List<Castillo> getCastillos() {
	return castillos;
}
  public void setCastillos(List<Castillo> castillos) {
	this.castillos = castillos;
}
  public void agregarCastillo(Castillo castillo){
	  this.castillos.add(castillo);
  }
 
  public boolean personajePasoPorElCastillo(){
	return true;
   }
   
  public void recargarCastillo(Castillo _castillo){
	 _castillo.capacidadParaProducirPocimas+=6;
   }

  public double antiguedad(){
	 return this.getCastillos().stream()
			 .mapToDouble(c->c.cantidadPersonajesQuePasaronPorCastillo()).sum();
  }

  public double cantidadDeCastillos(){
	  return this.getCastillos().size();
  }
 
 public Personaje personajeDelEntorno(Personaje personaje){
	 return this.getPersonajesDelEntorno().stream().filter(p->p.equals(personaje)).findAny().get();
 }
 public Set<Personaje> getPersonajesDelEntorno() {
		return personajesDelEntorno;
	}
 public void setPersonajesQuePasoPorCadaCastillo(Set<Personaje> personajesDelEntorno) {
		this.personajesDelEntorno= personajesDelEntorno;
	}	
	

}
