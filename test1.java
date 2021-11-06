import java.util.*;

public class test1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Escribe tu apellido: ");
        String apellido = scan.nextLine();
        System.out.println("Escribe tu edad: ");
        String edad = scan.nextLine();
        System.out.println("Escribe tu hobbie: ");
        String hobbie = scan.nextLine();
        System.out.println("Escribe tu editor de código preferido: ");
        String idle = scan.nextLine();
        System.out.println("Escribe el sistema operativo que utiliza: ");
        String os = scan.nextLine();


        System.out.println("Tu nombre es: " + nombre + "\n"+
                "Tu apellido es: " + apellido + "\n"+
                "Tu edad es: " + edad + "\n"+
                "Tu editor de código preferido: " + idle + "\n"+
                "El sistema operativo que utiliza " + os );
    }
}
