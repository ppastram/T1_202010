package algo.json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import main.Infraccion;

public class Main 
{
	public static void main (String[] args)
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
		
		String objectid;
		String fecha_hora;
		String medio_dete;
		String clase_vehi;
		String tipo_servi;
		String infraccion;
		String des_infrac;
		String localidad;
		
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
			
			
			infras.add( new Infraccion(objectid, fecha_hora, medio_dete, clase_vehi, tipo_servi, infraccion, des_infrac, localidad ));
		}
		
		//JSONArray jsonArray = obj.getJSONArray("Array");
		
		//for(int i = 0; i < jsonArray.length(); i++)
		//{
		//	System.out.println(jsonArray.get(i));
		//}
	}
	
	//public static void printJsonObject(JSONObject obj) {

	//    for (Object key : obj.keySet()) {
	//        String keyStr = (String) key;
	//        Object keyvalue = obj.get(keyStr);
	//
	//       if (keyvalue instanceof JSONObject) {
	//           printJsonObject((JSONObject) keyvalue);
	//       } else if (keyvalue instanceof JSONArray) {
	//           JSONArray array = (JSONArray) keyvalue;
	//           for (int i = 0; i < array.length(); i++) {
	//               printJsonObject((JSONObject) array.get(i));
	//           }
	//
	//       } else {
	//           System.out.println(keyStr + ", " + keyvalue);
	//       }
	//   }
	//}

}
