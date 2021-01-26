package Vehiculos;

public class VehiculoGasoil extends Vehiculo implements GestionVehiculo {

	
	
	public VehiculoGasoil()
	{
		super();
		
	}
	
	public VehiculoGasoil(String m, float v, boolean e, float pre, float pe, String c, float l)
	{
		super(m,v,e,pre,pe,c,l);
		
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
