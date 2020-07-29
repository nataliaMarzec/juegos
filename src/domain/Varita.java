package domain;

import animales.Animal;

public abstract class Varita{
	protected Personaje personaje;

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Varita(){}
	
	public abstract void aplicarVaritaAUn(Personaje personaje,Animal animal);
	
	
	


}
