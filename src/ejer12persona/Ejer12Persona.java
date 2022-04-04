package ejer12persona;

import PersonaEntidades.PersonaEntidades;
import PersonaServicios.Servicio;


public class Ejer12Persona {
    public static void main(String[] args) {
        
        PersonaEntidades P1 = Servicio.crearPersona();
        System.out.println( Servicio.calcularEdad(P1) );
        System.out.println( Servicio.menorQue(18, P1) ); 
        Servicio.mostrarPerosna(P1);
        
    }
    
}
