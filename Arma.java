public class Arma extends Item{
	
	private int nivel;
	private int dano;
	private int rango;

//constructor

	public Arma(int nivel, int dano, int rango,int precio, String nombre){
		this.nivel=nivel;
		this.dano=dano;
		this.rango=rango;
		this.precio=precio;
		this.nombre=nombre;

		
	}
//set dano
	public void setDano(int dano){
		this.dano=dano;
	}
//get dano
	public int getDano(){
		return dano;
	}
//set nivel

	public void setNivel(int nivel){

		
		this.nivel = nivel;

	}

//get nivel

	public int getNivel(){

		return nivel;

	}

//set arma

	public void setArma(int arma){

		
		this.arma = arma;

	}

//get arma

	public int getArma(){

		return arma;

	}

//set rango

	public void setRango(int rango){

		
		this.rango = rango;

	}

//get rango

	public int getRango(){

		return rango;

	}


}// clase 
