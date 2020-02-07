package main;

public class Infraccion 
{
	String objectid;
	String fecha_hora;
	String medio_dete;
	String clase_vehi;
	String tipo_servi;
	String infraccion;
	String des_infrac;
	String localidad;
	
	public Infraccion(	String objectid2, String pfecha_hora, String pmedio_dete, String pclase_vehi, String ptipo_servi, String pinfraccion, String pdes_infrac, String plocalidad)
	{
		fecha_hora = pfecha_hora;
		objectid = objectid2;
		medio_dete = pmedio_dete;
		clase_vehi = pclase_vehi;
		tipo_servi = ptipo_servi;
		infraccion = pinfraccion;
		des_infrac = pdes_infrac;
		localidad = plocalidad;
	}
	
	public void setobjectid(String nuevo)
	{
		objectid = nuevo;
	}
	public void setfecha_hora(String nuevo)
	{
		fecha_hora = nuevo;
	}
	public void setmedio_dete(String nuevo)
	{
		medio_dete = nuevo;
	}
	public void setclase_vehi(String nuevo)
	{
		clase_vehi = nuevo;
	}
	public void settipo_servi(String nuevo)
	{
		tipo_servi = nuevo;
	}
	public void setinfraccion(String nuevo)
	{
		infraccion = nuevo;
	}
	public void setdes_infrac(String nuevo)
	{
		des_infrac = nuevo;
	}
	public void setlocalidad(String nuevo)
	{
		localidad = nuevo;
	}
	
	
	public String getobjectid()
	{
		return objectid;
	}
	public String getfecha_hora()
	{
		return fecha_hora;
	}
	public String getmedio_dete()
	{
		return medio_dete;
	}
	public String getclase_vehi()
	{
		return clase_vehi;
	}
	public String gettipo_servi()
	{
		return tipo_servi;
	}
	public String getinfraccion()
	{
		return infraccion;
	}
	public String getdes_infrac()
	{
		return des_infrac;
	}
	public String getlocalidad()
	{
		return localidad;
	}
	
}
