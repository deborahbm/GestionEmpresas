package Vehiculos;

public class Vehiculo {
	
	protected String marca;
	protected float velocidadActual;
	protected boolean estaArrancado;
	protected float precio;
	protected float peso;
	protected String color;
	protected float longitud;
	
	public Vehiculo()
	{
		this.marca="";
		this.velocidadActual=0.0f;
		this.estaArrancado=false;
		this.precio=10000.0f;
		this.peso=3000.0f;
		this.color="red";
		this.longitud=3.0f;
	}
	public Vehiculo(String m, float v, boolean e, float pre, float pe, String c, float l)
	{
		this.marca=m;
		this.velocidadActual=v;
		this.estaArrancado=e;
		this.precio=pre;
		this.peso=pe;
		this.color=c;
		this.longitud=l;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(float velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public boolean isEstaArrancado() {
		return estaArrancado;
	}
	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public String print()
	{
		
		String info="";
		info+="\n Marca:"+marca;
		info+="\n Velocidad Actual:"+velocidadActual;
		info+="\n Esta arrancado: "+estaArrancado;
		info+="\n Precio: "+precio;
		info+="\n Peso:"+peso;
		info+="\n Color:"+color;
		info+="\n Longitud: "+longitud;
		
		return info;
	}
	
	
	
	

	

}
