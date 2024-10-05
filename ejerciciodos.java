import java.util.Scanner;

public class ejerciciodos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una línea de texto: ");
        String texto=scanner.nextLine();
        int contador=0;

        String [] palabras=texto.trim().split("\\s+");
        int longitud =palabras.length;
        if (longitud>0 && !palabras[0].isEmpty()) {
            contador=palabras.length;
        }
        System.out.println("la cadena de texto tiene este numero de palabras: "+contador);
        scanner.close();
}
}
