public class NPC{
	private String nombre;
	private Item[]items=new Item[3];
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public Item[] getItems(){
		return items;
	}
	public void setItems(Item[]items){
		this.items=items;
	}
}