package animales;


import domain.Personaje;
import pocimas.TipoDePocima;

public abstract class Animal{
	protected double fuerzaDelVinculo;
	protected double fuerzaVinculoAumentada;
	protected double energia;
	protected double resistencia;
	protected Personaje personaje;
	
/*en buey por ejemplo
 * void evaluarPosibleCambioDeDuenio(per)
 * if(this.fuerzaDElVInculo<5)
 * 
 * else if(this.estalibre()&& this.fuerzaVinculo>10)
 */
	
    public abstract void evaluarPosibleCambioDeDuenio(Personaje duenio,int cuantoAumenta);
	public void ponerPocima(TipoDePocima _item,double cuanto){
	}
	
	public boolean esDeDuenio(Personaje personaje) {
		return personaje.esDuenioDe(this);
		
	}
	
	public double getFuerzaDelVinculo() {
		return fuerzaDelVinculo;
	}

	public void setFuerzaDelVinculo(double fuerzaDelVinculo) {
		this.fuerzaDelVinculo = fuerzaDelVinculo;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public double getResistencia() {
		return resistencia;
	}

	
	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	public void aumentarFuerzaDelVinculoDeAnimalConDuenio(Personaje duenio) {
		duenio.addAAnimalesPropios(this);
		this.esDeDuenio(duenio);
		double sabiduriaDeDuenio=duenio.getSabiduria()/3;
		fuerzaDelVinculo=fuerzaDelVinculo+sabiduriaDeDuenio;
		this.setFuerzaDelVinculo(fuerzaDelVinculo);
		
	}
	

	
	

	
	
	
	
	
	
	
	
	
	
	

}
