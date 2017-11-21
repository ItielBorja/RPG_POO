public class Bruja extends Enemigo{
	public Bruja(int nivelDeJugador){
		this.nivel=(int)(Math.random()*((nivelDeJugador+7)-(nivelDeJugador-7)))+(nivelDeJugador-7); //Puede ser 7 niveles menor o mayor que el jugador
		this.xp=nivel*7;
		this.dinero=nivel*7; //Experiencia y dinero que dan depende de su nivel;
	}
}
