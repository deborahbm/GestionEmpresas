package Edificios;

public class Oficina extends Edificio {

	
	public Oficina()
	{
		super();
		
	}
	public Oficina(float a, float al, float pro, String m, String f, float p, String c)
	{
		super(a, al,pro,m,f,p,c);
		
	}
	
	@Override
	public String funcionalidadEdificio() {
		// TODO Auto-generated method stub
		return "En la oficina se etiqueta el produ";
	}

	
	
	
}
