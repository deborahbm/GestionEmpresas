import Edificios.*;
import Empresa.Empresa;
import Vehiculos.*;
import Productos.*;
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa= new Empresa();
		
		VehiculoElectrico vh1= new VehiculoElectrico();
		VehiculoElectrico vh2= new VehiculoElectrico();
		float coste=0.0f;
		
		VehiculoGasoil vgl=new VehiculoGasoil();
		VehiculoGasolina vg= new VehiculoGasolina();
		
		empresa.setVh1(vh1);
		empresa.setVh2(vh2);
		empresa.getVh1().setEstaArrancado(true);
		empresa.getVh2().setEstaArrancado(true);
		empresa.getVh1().setVelocidadActual(50.0f);
		empresa.getVh2().setVelocidadActual(50.0f);
		
		System.out.println("*****  Vehiculos eléctricos  *****");
		System.out.println(empresa.print());
		
		
		
		System.out.println("*****  Vehiculos gasolina y gasoil  *****");
		
		empresa.setVg(vg);
		empresa.setVgl(vgl);
		empresa.getVg().setEstaArrancado(true);
		empresa.getVgl().setEstaArrancado(true);
		empresa.getVg().setVelocidadActual(80);
		empresa.getVgl().setVelocidadActual(80);
		empresa.getVg().frenar(30.0f);
		empresa.getVgl().frenar(40.0f);
		
		System.out.println(empresa.print());
		
		//System.out.println(vh1.print());
		
		Oficina ofi= new Oficina();
		Almacen al= new Almacen();
		Fabrica fa= new Fabrica();
		
		empresa.setAlmacen(al);
		empresa.setOficina(ofi);
		empresa.setFabrica(fa);
		
		System.out.println("*****  Edificios  *****");
		System.out.println(empresa.getOficina().funcionalidadEdificio());
		System.out.println(empresa.getFabrica().funcionalidadEdificio());
		System.out.println(empresa.getAlmacen().funcionalidadEdificio());
		
		coste= empresa.getFabrica().costePintura("verde", 30.0f);
		System.out.println("El coste de pintar la fábrica de 30.0f es "+ coste);
		
		Puerta p1= new Puerta();
		p1.setId(1);
		empresa.setP1(p1);
		
		Puerta p2= new Puerta();
		p2.setId(2);
		empresa.setP2(p2);
		
		
		Silla s1= new Silla();
		s1.setId(3);
		Silla s2= new Silla();
		s2.setId(4);
		empresa.setS1(s1);
		empresa.setS2(s2);
		
		Ventana v1= new Ventana();
		Ventana v2= new Ventana();
		v1.setId(5);
		v2.setId(6);
		empresa.setV1(v1);
		empresa.setV2(v2);
		System.out.println("******** Productos *****");
		System.out.println(empresa.print());
		
		
		empresa.cambiarUbicaciónProducto(empresa.getS1(), empresa.getOficina());
		empresa.cambiarUbicaciónProducto(empresa.getS2(), empresa.getOficina());
		System.out.println("******** Cambio Ubicación Sillas  *****");
		System.out.println(empresa.print());
		
		empresa.cambiarUbicaciónProducto(empresa.getP1(), empresa.getAlmacen());
		empresa.cambiarUbicaciónProducto(empresa.getP2(), empresa.getAlmacen());
		System.out.println("******** Cambio Ubicación Sillas  *****");
		System.out.println(empresa.print());
		
		if (empresa.venderProducto(empresa.getP1()))
		{
			System.out.println("El producto "+ empresa.getP1().getNombre()+ " has sido vendido correctamente");
		}
		else
		{
			System.out.println("El producto "+ empresa.getP1().getNombre()+ " no ha sido vendido, se producido un error");
		}
		empresa.venderProducto(empresa.getS1());
		
		Puerta pNueva= new Puerta();
		pNueva.setId(2);
		Puerta pNueva2= new Puerta();
		pNueva2.setId(10);
		
		if (empresa.crearProducto(pNueva))
		{
			System.out.println("El producto "+ pNueva.getNombre()+ " has sido creada correctamente");
		}
		else
		{
			System.out.println("El producto "+ pNueva.getNombre()+ " no has sido creada, se ha producido un error");
		}
		if (empresa.crearProducto(pNueva2))
		{
			System.out.println("El producto "+ pNueva2.getNombre()+ " has sido creada correctamente");
		}
		else
		{
			System.out.println("El producto "+ pNueva2.getNombre()+ " no has sido creada, se ha producido un error");
		}
		
		
		
	}

}
