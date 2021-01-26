package Edificios;

public class Fabrica extends Edificio {

	
	public Fabrica()
	{
		super();
		
	}
	public Fabrica(float a, float al, float pro, String m, String f, float p, String c)
	{
		super(a, al,pro,m,f,p,c);
		
	}
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la fábrica se crea el producto. ";
	}

	
	
	
}