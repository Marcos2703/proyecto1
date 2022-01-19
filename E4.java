

import java.util.Scanner;
//mi primer git
public class E4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una operación con espacios");
        String operacion = sc.nextLine();
        String cuerda = operacion;
        String[] parts = cuerda.split(" ");
        float numero1 = Float.parseFloat(parts[0]), numero2 = Float.parseFloat(parts[2]);
        String signo = parts[1];
        String texto = "El resultado es: ";
       if (signo.equals("+")) {
        System.out.println(texto + (numero1 + numero2));
       } else if (signo.equals("-")) {
           System.out.println(texto + (numero1 - numero2));
       } else if (signo.equals("*")) {
           System.out.println(texto + (numero1 * numero2));
       } else if (signo.equals("/")) {
           System.out.println(texto + (numero1 / numero2));
       }
    }
}
