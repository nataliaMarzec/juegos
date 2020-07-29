package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import animales.Animal;
import castillos.Castillo;
import pocimas.Pocima;
import pocimas.TipoDePocima;

public class Personaje {
	protected Set<Animal>animalesPropios=new HashSet<>();
	protected Varita varita;
	protected double sabiduria;
	protected Castillo castillo;
	protected List<Pocima>pocimasPropias=new ArrayList<>();
	protected double fortaleza;

		
	public Personaje(Varita varita){
		this.varita=varita;
	}
	
	public void aplicarPocima(TipoDePocima tipo,Animal _animal){
		Pocima pocima=this.traerPocima(tipo);
		pocima.aplicarPocimaSegunSuColor(_animal,this);
		pocimasPropias.remove(pocima);
		
	}
	public double getFortaleza(){
		fortaleza=this.getSabiduria()+this.getEnergiaDeSusAnimales();
		return fortaleza;
	}
	public double getEnergiaDeSusAnimales() {
		return getAnimalesPropios().stream().mapToDouble(a->a.getEnergia()).sum();
	}
	
	public Pocima traerPocima(TipoDePocima tipo){
		return this.pocimasPropias.stream().filter(p->p.getTipoDePocima().equals(tipo)).findAny().get();
	}
	public boolean tienePocimaDeColor(TipoDePocima tipo) {
		return pocimasPropias.stream().anyMatch(p->p.getTipoDePocima().equals(tipo));
	}
	public void agregarPocima(Pocima pocima){
		this.pocimasPropias.add(pocima);
	}
	public double getSabiduria(){
		return sabiduria;
	}
	public void setSabiduria(double sabiduria){
		this.sabiduria=sabiduria;
	}
	public boolean esDuenioDe(Animal animal) {
		return this.getAnimalesPropios().contains(animal);
	}
	public Set<Animal>getAnimalesPropios(){
		return this.animalesPropios;
	}
	public void addAAnimalesPropios(Animal animal){
		this.animalesPropios.add(animal);
		
	}
	public void aplicarSegunCriterioA(Animal animal) {
		this.getCastillo().cargoAnimalA(this);
		this.addAAnimalesPropios(animal);
		;
		
	}
	public Castillo getCastillo() {
		return castillo;
	}
	
	public Varita getVarita() {
		return varita;
	}
	public void setVarita(Varita varita) {
		this.varita = varita;
	}


	public List<Pocima> getPocimasPropias() {
		return pocimasPropias;
	}

	public void setPocimasPropias(List<Pocima> pocimasPropias) {
		this.pocimasPropias = pocimasPropias;
	}
	public boolean pasoPorElCastillo(Castillo castillo){
		return castillo.getPersonajesQuePasaronPorCastillo().contains(this);
	}
	public boolean esAnimalPropio(Animal animal) {
		return animalesPropios.contains(animal);
	}

	public int cuantoAumenta(int cuantoAumenta) {
		return cuantoAumenta;
	

	
	}

	
	

	
}
