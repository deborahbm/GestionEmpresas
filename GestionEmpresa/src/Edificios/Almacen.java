package Edificios;

public class Almacen extends Edificio {

	
	public Almacen()
	{
		super();
		
	}
	public Almacen(float a, float al, float pro, String m, String f, float p, String c)
	{
		super(a, al,pro,m,f,p,c);
		
	}
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En el almacen se guarda el producto para posteriormente venderlo. ";
	}

	
	
	
}