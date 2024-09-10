import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numero1;
        double numero2;
        String operacion;
        double resultado = 0;

        System.out.println("Ingrese el primer numero");
        Scanner in1 = new Scanner(System.in);
        numero1 = in1.nextInt();

        System.out.println("Ingrese el segundo numero");
        Scanner in2 = new Scanner(System.in);
        numero2 = in2.nextInt();

        System.out.println("Ingrese la operación a realizar (+, -, *, /, %)");
        Scanner in3 = new Scanner(System.in);
        operacion = in3.nextLine();

        if (operacion.equals("+")) {
            resultado = numero1 + numero2;
        }else if (operacion.equals("-")) {
            resultado = numero1 - numero2;
        }else if (operacion.equals("*")) {
            resultado = numero1 * numero2;
        }else if (operacion.equals("/")) {
            resultado = numero1 / numero2;
        }

        System.out.println("El resultado es " + resultado);

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor que " + numero2);
        }else if (numero2 > numero1) {
            System.out.println("El numero " + numero2 + " es mayor que " + numero1);
        }else{
            System.out.println("Los numeros son iguales");
        }

        if (resultado % 2 == 0) {
            System.out.println("El resultadon es par");
        }else{
            System.out.println("El resultado es impar");
        }

        int resultadoEntero = (int) resultado;

        System.out.println(resultadoEntero);

        
        if (numero1 > 0 && numero2 > 0) {
            System.out.println("Ambos números son positivos");

        }

        if (numero1 > 10 && numero2 > 10) {
            System.out.println("Ambos números son mayores que 10");
        }

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Al menos uno de los números es negativo o igual a cero");
        }
        
    }
}
