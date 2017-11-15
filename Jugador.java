public class Jugador extends Personaje{
	
	private Arma 		arma;
	private Armadura 	armadura;
	private int 		puntos;
	private Pocion [] 	pociones;
	private int 		dinero;

//constructor 

	public Jugador(){



	}

//set Arma

	public void setArma(Arma arma){

		this.arma= arma;

	}

//get arma

	public Arma getArma(){

		return arma;

	}

//set armadura

	public void setArmadura(Armadura armadura){

		this.armadura = armadura;

	}

//get armadura

	public Armadura getArmadura(){

		return armadura;

	}

//set puntos

	public void setPuntos(int puntos){

		this.puntos = puntos;

	}

//get puntos

	public int getPuntos(){

		return puntos;
	}

//set Pocion 

	public void setPocion(Pocion [] pociones){

		this.pociones = pociones;

	}

//get Pocion

	public Pocion [] getPocion(){

		return pociones;

	}

//set Dinero

	public void setDinero (int dinero){

		this.dinero = dinero;

	}

//get Dinero

	public int getDinero(){

		return dinero;

	}


}//clase
