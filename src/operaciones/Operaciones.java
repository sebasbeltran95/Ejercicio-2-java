package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         String nombre = "";
        int horas = 0 , clave = 0;
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingrese el nombre del trabajador ");
        nombre = Entrada.nextLine();
        
        System.out.println("Porfavor Ingrese horas del trabajador ");
        horas = Entrada.nextInt();
        
        System.out.println("Porfavor Ingrese la clave");
        clave = Entrada.nextInt();
        
        if (clave == 1){ 
        System.out.println("El trabajador@ " + nombre + "trabajo " + horas + " horas y su sueldo a pagar es 300 mil pesos");
        }if (clave == 2){ 
        System.out.println("El trabajador@ " + nombre + "trabajo " + horas + " horas y su sueldo a pagar es 500 mil pesos");
        }else { 
        System.out.println("Error al ingresar la clave");
        }   
        


    }
}
