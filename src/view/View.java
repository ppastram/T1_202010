package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("Bienvenido al menú de servicios del sistema de comparendos de Bogotá.");
			System.out.println("1. Cargar comparendos y visualizar info sobre el primer y el último comparendos y el número total de estos");
			System.out.println("2. Consultar info sobre un comparendo por su ID");
			System.out.println();
			System.out.println("6. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
		}
}
