package Edificios;

public abstract class Edificio {
	
	
	protected float anchura;
	protected float altura;
	protected float profundidad;
	protected String material;
	protected String funcionalidad;
	protected float precio;
	protected String color;
	
	public Edificio()
	{
		this.anchura=0.0f;
		this.altura=0.0f;
		this.profundidad=0.0f;
		this.material="Ladrillo";
		this.funcionalidad="";
		this.precio=0.0f;
		this.color="blanco";
		
	}
	public Edificio(float a, float al, float pro, String m, String f, float p, String c)
	{
		this.anchura=a;
		this.altura=al;
		this.profundidad=pro;
		this.material=m;
		this.funcionalidad=f;
		this.precio=p;
		this.color=c;
		
	}
	public float getAnchura() {
		return anchura;
	}
	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getFuncionalidad() {
		return funcionalidad;
	}
	public void setFuncionalidad(String funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public float costePintura(String color, float precio)
	{
		float coste= this.profundidad * this.anchura * this.altura * precio;
		if (coste <=0)
		{
			return -1;
		}
		return coste;
	}
	public float costePintura(String color, float precio,String lado)
	{
		float coste=0.0f;
		if (lado.equals("ladoprofundidad"))
		{
			coste= this.profundidad * this.altura * precio;
		}
		else if (lado.equals("ladoanchura"))
		{
			coste= this.anchura * this.altura * precio;
		}
		if (coste <=0)
		{
			return -1;
		}
		return coste;
	}
	
	public abstract String funcionalidadEdificio();
	
	
	public String print()
	{
		
		
		String info="";
		info+="\n anchura:"+anchura;
		info+="\n altura:"+altura;
		info+="\n profundidad: "+profundidad;
		info+="\n material: "+material;
		info+="\n funcionalidad:"+funcionalidad;
		info+="\n precio:"+precio;
		info+="\n color: "+color;
		
		return info;
	}
	

}
