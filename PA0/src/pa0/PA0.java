/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa0;

/**
 *
 * @author Alberto
 */
public class PA0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean finalizar;
        do {
            String entrada = leerEntrada();
            if(!(finalizar = finalDeJuego())) {
                logica();
                escribirSalida();
            }
        }
        while(!finalizar);
    }

    // Jugador1
    private static String leerEntrada() {
        throw new UnsupportedOperationException("Todavía no."); //To change body of generated methods, choose Tools | Templates.
    }

    //Jugador2
    private static boolean finalDeJuego() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void logica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void escribirSalida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
