public class Arma extends Item{
	
	private int nivel;
	private int dano;
	private int rango;
	private int precio;

//constructor

	public Arma(int nivel, int dano, int rango,int precio){
		this.nivel=nivel;
		this.dano=dano;
		this.rango=rango;
		this.precio=precio;

		
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
//get precio
	public int getPrecio(){
		return precio;
	}
//set precio
	public void setPrecio(int precio){
		this.precio=precio;
	}


}// clase 
