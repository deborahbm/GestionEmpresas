package Productos;

import Edificios.*;

public class Producto {

	protected int id;
	protected String nombre;
	protected String tipo;
	protected float anchura;
	protected float profundidad;
	protected float altura;
	protected String color;
	protected Edificio edificio;

	public Producto() {
		this.id = 0;
		this.nombre = "";
		this.tipo = "";
		this.anchura = 0.0f;
		this.profundidad = 0.0f;
		this.altura = 0.0f;
		this.color = "red";
		this.edificio = new Oficina();
	}

	public Producto(int id, String n, String t, float an, float p, float al, String c, Edificio e) {
		this.id = id;
		this.nombre = n;
		this.tipo = t;
		this.anchura = an;
		this.profundidad = p;
		this.altura = al;
		this.color = c;
		this.edificio = e;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getAnchura() {
		return anchura;
	}

	public void setAnchura(float anchura) {
		this.anchura = anchura;
	}

	public float getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(float profundidad) {
		this.profundidad = profundidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}

	public String print() {
		

		String info = "";
		info += "\n id:" + id;
		info += "\n nombre:" + nombre;
		info += "\n tipo: " + tipo;
		info += "\n anchura: " + anchura;
		info += "\n profundidad:" + profundidad;
		info += "\n altura:" + altura;
		info += "\n color: " + color;
		if (edificio != null) {
			info += "\n color: " + edificio.print();
		} else {
			info += "\n NO tiene asociado ningún edificio";
		}

		return info;
	}

}
