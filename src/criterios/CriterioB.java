package criterios;

import animales.Animal;
import domain.Personaje;
import pocimas.TipoDePocima;

public class CriterioB extends Criterio{

	@Override
	public void aplicarPocima(Personaje personaje, Animal animal) {
		if(personaje.esAnimalPropio(animal)){
			personaje.getVarita().aplicarVaritaAUn(personaje, animal);
			
		}else if(personaje.tienePocimaDeColor(TipoDePocima.POCIMA_AMARILLA)
				&& !personaje.esDuenioDe(animal)&& !personaje.equals(personaje)){
			personaje.aplicarPocima(TipoDePocima.POCIMA_AMARILLA, animal);			
		}		
	}
}

