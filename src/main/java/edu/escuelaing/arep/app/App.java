package edu.escuelaing.arep.app;

import static spark.Spark.*;

import java.util.ArrayList;

/**
 * @author Edwin Rodriguez Clase principal de lectura de archivos y impresion de
 *         los datos calculados
 *
 */
public class App {
	/**
	 * Encargada de iniciar el servicio usando spark
	 * @param args parametros al momento de iniciar la aplicación
	 */
    public static void main(String [] args){
    	
    	ArrayList<Double> list = new ArrayList<Double>();
    	
    	list.add(5.0);
    	list.add(6.0);
    	list.add(7.0);
    	list.add(8.0);
    	list.add(9.0);
    	list.add(10.0);
    	
    	Calculator cal = new Calculator(list);

    	
        staticFiles.location("/public");
        port(getPort());
		post("/calculator", (request, response) -> {
			
			return "{\"mean\":" + cal.sum() + ", \"dev\":" + cal.average() + "}";
 
		});
    } 
    /**
     * retorna el puerto solicitado por la aplicacion
     * @return puerto
     */
	static int getPort() {
		 if (System.getenv("PORT") != null) {
			 return Integer.parseInt(System.getenv("PORT"));
		 }
		 return 4567;
	}
}