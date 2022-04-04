package PersonaServicios;

import PersonaEntidades.PersonaEntidades;
import java.util.Date;
import java.util.Scanner;

public class Servicio {

 public static PersonaEntidades crearPersona(){
    Scanner leer= new Scanner (System.in).useDelimiter("\n");
    PersonaEntidades p1=new PersonaEntidades();
     System.out.println("ingrese nombre ");
     p1.Nombre=leer.next();
     System.out.println("Ingrese dia de nac ");
     int dia=leer.nextInt();
     System.out.println("Ingrese mes de nac");
     int mes = leer.nextInt();
     System.out.println("Ingrese año de nac ");
     int anio = leer.nextInt();
     Date fecha = new Date (anio-1900,mes-1,dia);
     
     p1.fecha= fecha;
     return p1;
     
 }  
 public static int calcularEdad(PersonaEntidades p1){
     
     Date fechaActual=new Date();
        
        int diferencia = fechaActual.getYear()-p1.getFecha().getYear();
        return diferencia;
        
 }
 
 public static boolean menorQue(int edad, PersonaEntidades p1){
     
     int edad1 = calcularEdad (p1);
     return edad1 < edad;
 }
 
 public static void mostrarPerosna(PersonaEntidades p1){
     System.out.println("La persona tiene " + p1.fecha + " y se llama " + p1.Nombre);
 }
}