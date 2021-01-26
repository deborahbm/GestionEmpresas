package Vehiculos;

public class VehiculoGasolina extends Vehiculo implements GestionVehiculo {

	
	protected float contaminacion;
	protected float tamanyoDeposito;
	
	
	public VehiculoGasolina()
	{
		super();
		this.contaminacion=1000.0f;
		this.tamanyoDeposito=60.0f;
	}
	
	public VehiculoGasolina(String m, float v, boolean e, float pre, float pe, String c, float l,float co, float d)
	{
		super(m,v,e,pre,pe,c,l);
		this.contaminacion=co;
		this.tamanyoDeposito=d;
	}
	
	
	public float getContaminacion() {
		return contaminacion;
	}

	public void setContaminacion(float contaminacion) {
		this.contaminacion = contaminacion;
	}

	public float getTamanyoDeposito() {
		return tamanyoDeposito;
	}

	public void setTamanyoDeposito(float tamanyoDeposito) {
		this.tamanyoDeposito = tamanyoDeposito;
	}

	@Override
	public boolean acelerar(float v) {

		if (this.estaArrancado) {
			this.velocidadActual = this.velocidadActual + v;
			if (this.velocidadActual > 300.0f) {
				this.velocidadActual = 300.0f;
			}
			return true;
		} else {
			return false;
		}

		// TODO Auto-generated method stub

	}

	@Override
	public boolean frenar(float v) {
		// TODO Auto-generated method stub
		if (this.estaArrancado) {
			this.velocidadActual = this.velocidadActual - v;
			if (this.velocidadActual <0.0f) {
				this.velocidadActual = 0.0f;
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean arrancar() {
		// TODO Auto-generated method stub
		
		if (!this.estaArrancado)
		{
			this.estaArrancado=true;
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	@Override
	public boolean parar() {
		// TODO Auto-generated method stub
		if (this.estaArrancado)
		{
			this.estaArrancado=false;
			return true;
		}
		else
		{
			return false;
		}
	}

}
