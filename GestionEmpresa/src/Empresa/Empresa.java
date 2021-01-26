package Empresa;

import Edificios.*;
import Productos.*;
import Vehiculos.*;

public class Empresa {

	protected VehiculoElectrico vh1;
	protected VehiculoElectrico vh2;

	protected VehiculoGasolina vg;
	protected VehiculoGasoil vgl;

	protected Edificio almacen;
	protected Edificio fabrica;
	protected Edificio oficina;

	protected Silla s1;
	protected Silla s2;
	protected Ventana v1;
	protected Ventana v2;
	protected Puerta p1;
	protected Puerta p2;

	public VehiculoElectrico getVh1() {
		return vh1;
	}

	public void setVh1(VehiculoElectrico vh1) {
		this.vh1 = vh1;
	}

	public VehiculoElectrico getVh2() {
		return vh2;
	}

	public void setVh2(VehiculoElectrico vh2) {
		this.vh2 = vh2;
	}

	public VehiculoGasolina getVg() {
		return vg;
	}

	public void setVg(VehiculoGasolina vg) {
		this.vg = vg;
	}

	public VehiculoGasoil getVgl() {
		return vgl;
	}

	public void setVgl(VehiculoGasoil vgl) {
		this.vgl = vgl;
	}

	public Edificio getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Edificio almacen) {
		this.almacen = almacen;
	}

	public Edificio getFabrica() {
		return fabrica;
	}

	public void setFabrica(Edificio fabrica) {
		this.fabrica = fabrica;
	}

	public Edificio getOficina() {
		return oficina;
	}

	public void setOficina(Edificio oficina) {
		this.oficina = oficina;
	}

	public Silla getS1() {
		return s1;
	}

	public void setS1(Silla s1) {
		this.s1 = s1;
	}

	public Silla getS2() {
		return s2;
	}

	public void setS2(Silla s2) {
		this.s2 = s2;
	}

	public Ventana getV1() {
		return v1;
	}

	public void setV1(Ventana v1) {
		this.v1 = v1;
	}

	public Ventana getV2() {
		return v2;
	}

	public void setV2(Ventana v2) {
		this.v2 = v2;
	}

	public Puerta getP1() {
		return p1;
	}

	public void setP1(Puerta p1) {
		this.p1 = p1;
	}

	public Puerta getP2() {
		return p2;
	}

	public void setP2(Puerta p2) {
		this.p2 = p2;
	}

	public boolean crearProducto(Silla s) {

		boolean existe = false;
		if (s1 != null && s1.getId() == s.getId()) {
			existe = true;
		} else if (s2 != null && s2.getId() == s.getId()) {
			existe = true;
		}

		if (!existe) {
			// Mirar si tiene hueco
			if (s1 == null) {
				s1 = s;
				return true;
			} else if (s2 == null) {
				s2 = s;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean crearProducto(Ventana v) {

		boolean existe = false;
		if (v1 != null && v1.getId() == v.getId()) {
			existe = true;
		} else if (v2 != null && v2.getId() == v.getId()) {
			existe = true;
		}

		if (!existe) {
			// Mirar si tiene hueco
			if (v1 == null) {
				v1 = v;
				return true;
			} else if (v2 == null) {
				v2 = v;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean crearProducto(Puerta p) {

		boolean existe = false;
		if (p1 != null && p1.getId() == p.getId()) {
			existe = true;
		} else if (p2 != null && p2.getId() == p.getId()) {
			existe = true;
		}

		if (!existe) {
			// Mirar si tiene hueco
			if (p1 == null) {
				p1 = p;
				return true;
			} else if (p2 == null) {
				p2 = p;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean venderProducto(Producto p) {

		if (s1 != null && s1.getId() == p.getId() && s1.getEdificio().getFuncionalidad().equals("Almacen")) {
			s1 = null;
			return true;
		} else if (s2 != null && s2.getId() == p.getId() && s2.getEdificio().getFuncionalidad().equals("Almacen")) {
			s2 = null;
			return true;
		} else if (v1 != null && v1.getId() == p.getId() && v1.getEdificio().getFuncionalidad().equals("Almacen")) {
			v1 = null;
			return true;
		} else if (v2 != null && v2.getId() == p.getId() && v2.getEdificio().getFuncionalidad().equals("Almacen")) {
			v1 = null;
			return true;
		} else if (p1 != null && p1.getId() == p.getId() && p1.getEdificio().getFuncionalidad().equals("Almacen")) {
			p1 = null;
			return true;
		} else if (p2 != null && p2.getId() == p.getId() && p2.getEdificio().getFuncionalidad().equals("Almacen")) {
			p2 = null;
			return true;
		}
		return true;
	}

	public boolean cambiarUbicaciónProducto(Producto p, Edificio e) {

		if (s1 != null && s1.getId() == p.getId()) {
			s1.setEdificio(e);
			return true;
		} else if (s2 != null && s2.getId() == p.getId()) {
			s2.setEdificio(e);
			return true;
		} else if (v1 != null && v1.getId() == p.getId()) {
			v1.setEdificio(e);
			return true;
		} else if (v2 != null && v2.getId() == p.getId()) {
			v2.setEdificio(e);
			return true;
		} else if (p1 != null && p1.getId() == p.getId()) {
			p1.setEdificio(e);
			return true;
		} else if (p2 != null && p2.getId() == p.getId()) {
			p2.setEdificio(e);
			return true;
		}
		return true;
	}

	public String print() {
		

		String info = "";
		if (vh1 != null) {
			info += "\n vh1:" + vh1.print();
		}
		if (vh2 != null) {
			info += "\n vh2:" + vh2.print();
		}
		if (vg != null) {
			info += "\n vg: " + vg.print();
		}
		if (vgl != null) {
			info += "\n vgl: " + vgl.print();
		}
		if (almacen != null) {
			info += "\n almacen:" + almacen.print();
		}
		if (fabrica != null) {
			info += "\n fabrica:" + fabrica.print();
		}
		if (oficina != null) {
			info += "\n oficina: " + oficina.print();
		}
		if (s1 != null) {
			info += "\n s1: " + s1.print();
		}
		if (s2 != null) {
			info += "\n s2: " + s2.print();
		}
		if (v1 != null) {
			info += "\n v1: " + v1.print();
		}
		if (v2 != null) {
			info += "\n v2: " + v2.print();
		}
		if (p1 != null) {
			info += "\n p1: " + p1.print();
		}
		if (p2 != null) {
			info += "\n p2: " + p2.print();
		}

		return info;

	}

}
