public class Troll extends Enemigo{
	public Troll(int nivelDeJugador){
		this.nivel=(int)(Math.random()*((nivelDeJugador+5)-(nivelDeJugador-5)))+(nivelDeJugador-5); //Puede ser 5 niveles menor o mayor que el jugador
		this.xp=nivel*5;
		this.dinero=nivel*5; //Experiencia y dinero que dan depende de su nivel;
	}
}
