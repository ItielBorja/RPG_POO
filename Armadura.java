public class Armadura extends Item{
	
	private int nivel;
	private int defensa;
	private int especialidad;

//constructor

	public Armadura(int nivel,int defensa,String nombre){
		this.nivel=nivel;
		this.defensa=defensa;
		this.nombre=nombre;
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

//set defensa

	public void setDefensa(int defensa){

		
		this.defensa = defensa;

	}

//get defensa

	public int getDefensa(){

		return defensa;

	}

//set especialidad

	public void setEspecialidad(int especialidad){

		
		this.especialidad = especialidad;

	}

//get especialidad

	public int getEspecialidad(){

		return especialidad;

	}


}//clase 
