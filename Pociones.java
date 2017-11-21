public class Pociones extends Item{
	
	private int especialidad;
	private int aumento;

//constructor

	public Pociones(int aumento,int precio,String nombre){
		
		this.aumento=aumento;
		this.precio=precio;
		this.nombre=nombre;


	}

//set aumento

	public void setAumento(int aumento){

		
		this.aumento = aumento;

	}

//get aumento

	public int getAumento(){

		return aumento;

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
