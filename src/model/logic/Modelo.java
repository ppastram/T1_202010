package model.logic;

import java.util.ArrayList;

import org.json.JSONObject;

import algo.json.JSONUtils;
import algo.json.Main;
import main.Infraccion;
import model.data_structures.List;

/**
	 * Definicion del modelo del mundo
 * @param <T>
	 *
	 */
public class Modelo<T> 
{
	private static final String T = null;

	/**
	 * Atributos del modelo del mundo
	 */
	public List <T> datos;
	
	public Main yeison;
	
	/**
	 * Constructor del modelo del mundo creando el primer item
	 */
	public Modelo(T item)
	{
		datos = new <T> List( item );
	}
	
	public Modelo()
	{
		datos = null;
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int getSize() 
	{
		return datos.getSize();
	}

	public boolean isEmpty() 
	{
		return datos.isEmpty();
	}
	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void append(T item) 
	{	
		datos.append(item);
	}
	
	public void addFirst (T item)
	{	
		datos.addFirst(item);
	}
	
	public void removeFirst() 
	{
		datos.removeFirst();
	}
	
	public void remove(int pos) 
	{
		datos.remove(pos);
	}
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public T get(String id) 
	{
		return datos.get(id);
	}
	
	
	public void cargarInfo  ()
	{
		

		
		JSONObject obj = JSONUtils.getJSONObjectFromFile("/geofile.json");
		String [] names = JSONObject.getNames(obj);
		
		//System.out.println(names[0]);
		//System.out.println(names[1]);
		//System.out.println(names[2]);
		//System.out.println(names[3]);

		
		for (String string : names)
		{
			System.out.println(string + ": " + obj.get(string) );
		}
		
		ArrayList <Infraccion> infras = new ArrayList<>();
		
		String objectid = "";
		String fecha_hora = "";
		String medio_dete = "";
		String clase_vehi = "";
		String tipo_servi = "";
		String infraccion = "";
		String des_infrac = "";
		String localidad = "";
		
		System.out.println("Info del primer comparendo:");
		
		while (names[0].indexOf("geometry") > -1)
		{

			
			objectid = names[0].substring(     names[0].indexOf("\"OBJECTID"), names[0].indexOf("\"FECHA_HORA")-2     );
			fecha_hora = names[0].substring(     names[0].indexOf("\"FECHA_HORA\""), names[0].indexOf("\"MEDIO_DETE\"")-2     );
			medio_dete = names[0].substring(     names[0].indexOf("\"MEDIO_DETE\""), names[0].indexOf("\"CLASE_VEHI\"")-2     );
			clase_vehi = names[0].substring(     names[0].indexOf("\"CLASE_VEHI\""), names[0].indexOf("\"TIPO_SERVI\"")-2     );
			tipo_servi = names[0].substring(     names[0].indexOf("\"TIPO_SERVI\""), names[0].indexOf("\"INFRACCION\"")-2     );
			infraccion = names[0].substring(     names[0].indexOf("\"INFRACCION\""), names[0].indexOf("\"DES_INFRAC\"")-2     );
			des_infrac = names[0].substring(     names[0].indexOf("\"DES_INFRAC\""), names[0].indexOf("\"LOCALIDAD\"")-2     );
			localidad = names[0].substring(     names[0].indexOf("\"LOCALIDAD\""), names[0].indexOf("\"geometry\"")-2     );
			
			if (names[0].indexOf("\"OBJECTID") < 300)
			{
				datos.addFirst((T) new Infraccion(objectid, fecha_hora, medio_dete, clase_vehi, tipo_servi, infraccion, des_infrac, localidad ));
				
				System.out.println("ID: " + objectid);
				System.out.println("Fecha y hora: " + fecha_hora);
				System.out.println("Medio que lo detectó: " + medio_dete);
				System.out.println("Tipo de vehículo: " + clase_vehi);
				System.out.println("Tipo de servicio: " + tipo_servi);
				System.out.println("Infracción: " + infraccion);
				System.out.println("Descripción: " + des_infrac);
				System.out.println("Localidad: " + localidad);

			}
			
			else
			{
				datos.append( (T) new Infraccion(objectid, fecha_hora, medio_dete, clase_vehi, tipo_servi, infraccion, des_infrac, localidad ));
			}
		}
		
		System.out.println("Info del último comparendo:");
		
		System.out.println("ID: " + objectid);
		System.out.println("Fecha y hora: " + fecha_hora);
		System.out.println("Medio que lo detectó: " + medio_dete);
		System.out.println("Tipo de vehículo: " + clase_vehi);
		System.out.println("Tipo de servicio: " + tipo_servi);
		System.out.println("Infracción: " + infraccion);
		System.out.println("Descripción: " + des_infrac);
		System.out.println("Localidad: " + localidad);
		
		
		System.out.println("--- Número total de comparendos: ---\n" + getSize());


		
	}
	
	public void buscar(String id)
	{
		Infraccion esta = (Infraccion) get(id); 
		
		System.out.println("Info del comparendo consultado:");
		System.out.println("ID: " + esta.getobjectid());
		System.out.println("Fecha y hora: " + esta.getfecha_hora());
		System.out.println("Infracción: " + esta.getinfraccion());
		System.out.println("Tipo de vehículo: " + esta.getclase_vehi());
		System.out.println("Tipo de servicio: " + esta.gettipo_servi());
		System.out.println("Localidad: " + esta.getlocalidad());


	}
	

}

