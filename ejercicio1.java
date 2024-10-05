import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero: ");
        int numero = scanner.nextInt();
        int contador=0;
        if (numero==0) {
            contador=1;
            
        }
        else{
            if (numero<0) {
                numero=-numero;
                
            }
            while (numero>0) {
                numero/=10;
                contador++;
                
            }
        }
        System.out.println("el numero tiene este numero de digitos: "+contador);
        scanner.close();
    }
}
