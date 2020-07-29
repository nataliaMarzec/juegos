package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import animales.Animal;
import animales.Buey;
import animales.Hiena;
import animales.Perro;
import castillos.Agricola;
import castillos.Castillo;
import castillos.Maligno;
import castillos.Resistente;
import domain.Juego;
import domain.NoVaritaMagica;
import domain.Personaje;
import domain.Varita;
import domain.VaritaMagica;
import pocimas.Pocima;
import pocimas.PocimaAmarilla;
import pocimas.PocimaAzul;
import pocimas.PocimaRoja;

public class TestTest {
	protected Juego game;
	protected Personaje pers1;protected Personaje pers2; 
	protected Personaje pers3;protected Personaje pers4;
	protected Personaje pers5;protected Personaje pers6;
	protected Buey buey;protected Hiena hiena;protected Perro perro;
	protected Agricola agricola;protected Maligno maligno;protected Resistente resistente;
	protected PocimaAzul pocimaAzul;protected PocimaRoja pocimaRoja;protected PocimaAmarilla pocimaAmarilla;
	protected Varita varitaMagica;protected Varita noVaritaMagica;
	
   @Before

public void Setup(){
	   game=new Juego();
	  // new Personaje(sabiduria, varita)
	   pers1=new Personaje(varitaMagica);pers2=new Personaje(noVaritaMagica);
	   pers3=new Personaje(varitaMagica);pers4=new Personaje(noVaritaMagica);
	   pers5=new Personaje(varitaMagica);pers6=new Personaje(noVaritaMagica);
	   //new Buey(energia, resistencia)
	   buey=new Buey(5,10);hiena=new Hiena(2,6);perro=new Perro(10,12);
	   
	   agricola=new Agricola(300);maligno=new Maligno(100);resistente=new Resistente(45);
	   //new PocimaAzul(resistenciaAumentada, resistenciaDisminuida)
	   pocimaAzul=new PocimaAzul(5, 2);
	   pocimaRoja=new PocimaRoja();pocimaAmarilla=new PocimaAmarilla();
	   
	   varitaMagica=new VaritaMagica();noVaritaMagica=new VaritaMagica();
	  	 	
}
 //_______________________________________REQUERIMIENTO UNO:____________________________________________________________
  
 //Resolver el paso de un personaje por un castillo
   
   @Test
   public void crearPocimaAzul(){
	   agricola.registrarPersonaje(pers1);
	   agricola.tieneCapacidadParaCrearPocima();
	   assertEquals(299,agricola.getCapacidadParaProducirPocimas(),0.00);
	   agricola.crearPocimaEn(pers1);
	   pocimaAzul.getResistenciaAumentada();
	  // assertEquals(1,pers1.getPocimasPropias().size());
   }
   @Test
   public void crearPocimaRojaYAmarilla(){
	   resistente.registrarPersonaje(pers2);
	   resistente.tieneCapacidadParaCrearPocima();
	   assertEquals(44,resistente.getCapacidadParaProducirPocimas(),0.00);
	   resistente.crearPocimaEn(pers2);
	   assertEquals(2,pers2.getPocimasPropias().size());
   }
	@Test
	public void test() {
	    pers1.getSabiduria();
	    agricola.modificacionSabiduriaDelPersonaje(pers1, 10);
	    assertEquals(12,pers1.getSabiduria(),0.00);
	    
	    pers2.getSabiduria();
	    resistente.modificacionSabiduriaDelPersonaje(pers2,30);
	    assertEquals(30, pers2.getSabiduria(),0.00);
	    maligno.modificacionSabiduriaDelPersonaje(pers2, 0);
	    
	    
	       	    	
	}

//________________________________________REQUERIMIENTO DOS:____________________________________________________________

//   Resolver el encuentro de un personaje con un animaL
    
    @Test
    public void testEncuentroConUnAnimal(){
    	
    }
    @Test
    public void testAplicarVaritaMagica(){
    	//sabiduria=12
    	buey.setFuerzaDelVinculo(15);
    	varitaMagica.aplicarVaritaAUn(pers1,buey);
    	assertEquals(18,buey.getFuerzaDelVinculo(),0.00);
    	
    }
    @Test
    public void testPersonajeNoTieneVaritaMagica(){
    	noVaritaMagica.aplicarVaritaAUn(pers2, hiena);
    	//assertEquals(, actual);
    	    	
    }
 //_____________________________________REQUERIMIENTO TRES_________________________________________________________
 
 //   Recargar un castillo
    
    @Test
    
   public void testRecargarCastillo(){
    	agricola.getCapacidadParaProducirPocimas();
    	agricola.registrarPersonaje(pers1);
    	game.recargarCastillo(agricola);
    	assertEquals(305, agricola.getCapacidadParaProducirPocimas(),0.00);    
    }


//_____________________________________REQUERIMIENTO CUATRO_________________________________________________________

//El juego le pide crear un animal a cada castillo;
   @Test
   public void pedirAnimales(){
	    game.agregarCastillo(agricola);
	    game.agregarCastillo(resistente);
	    assertEquals(2, game.getCastillos().size());
	    game.pedirCrearAnimales();
	    assertEquals(2,game.getAnimalesSueltos().size());
}
//_____________________________________REQUERIMIENTO CINCO____________________________________________________________
   
 //calcular la fortaleza de un personaje, que se define como su sabiduria mas la suma de las energias de sus animales
   @Test
public void calculoDeFortalezaDelPersonaje(){
	   pers3.setSabiduria(20);
	   pers3.addAAnimalesPropios(buey);
	   pers3.addAAnimalesPropios(hiena);
	   assertEquals(27, pers3.getFortaleza(),0.00);
	   
	   
   }
//____________________________________REQUERIMIENTO SEIS_______________________________________________________________

 //calcular la antiguedad de un juego,que es la suma de la cantidad de personajes que paso por cada castillo
   @Test
   public void calculoDeAntiguedadDeUnJuego(){
	 agricola.agregarPersonaje(pers3);
	 resistente.agregarPersonaje(pers4);
	 maligno.agregarPersonaje(pers5);
	 game.agregarCastillo(agricola);
	 game.agregarCastillo(maligno);
	 game.agregarCastillo(resistente);
	 
	 assertEquals(3,game.antiguedad(),0.00);
   }
   
   
 }
