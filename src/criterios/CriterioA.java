package criterios;

import animales.Animal;
import domain.Personaje;
import pocimas.TipoDePocima;

public class CriterioA extends Criterio {

	@Override
	public void aplicarPocima(Personaje personaje,Animal animal) {
		if(personaje.tienePocimaDeColor(TipoDePocima.POCIMA_AZUL)){
			personaje.aplicarPocima(TipoDePocima.POCIMA_AZUL,animal);
			
		}else if(personaje.tienePocimaDeColor(TipoDePocima.POCIMA_ROJA)){
			personaje.aplicarPocima(TipoDePocima.POCIMA_ROJA,animal);
			
		}
		
	}

}
