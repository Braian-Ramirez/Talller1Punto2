import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int contador;
        double resultado,numero1, numero2, numero3;
        String operador;
        Scanner scan = new Scanner(System.in);
        try{
                System.out.println("Ingrese un valor númerico: ");
                numero1 = scan.nextDouble();
                System.out.println("Ingrese otro valor númerico: ");
                numero2 = scan.nextDouble();
                System.out.println("Ingrese otro valor númerico: ");
                numero3 = scan.nextDouble();
                System.out.println("Ingrese la cantidaad de veces que desea operar los números ingresados: ");
                contador = scan.nextInt();

                while ( contador != 0) {
                    System.out.println("Inserte el simbolo de la operación que desea realizar: ");
                    operador = scan.nextLine();
                if(operador.equals("+")) {
                    resultado = numero1 + numero2 + numero3;
                    contador --;
                    System.out.println("El resultado de la suma de los números ingresados es: " + resultado);
                }
                if(operador.equals("-")){
                    resultado = numero1 - numero2 - numero3;
                    contador --;
                    System.out.println("El resultado de la resta de los números ingresados es: " + resultado);
                }
                if(operador.equals("*")){
                        resultado = numero1 * numero2 * numero3;
                        contador --;
                        System.out.println("El resultado de la multiplicación de los números ingresados es: " + resultado);
                }
                if(operador.equals("/")){
                        resultado = numero1 / numero2 / numero3;
                        contador --;
                        System.out.println("El resultado de la división de los números ingresados es: " + resultado);
                }
                    if(operador.equals("%")){
                        resultado = numero1 % numero2 % numero3;
                        contador --;
                        System.out.println("El resultado de la resta de los números ingresados es: " + resultado);
                    }
            }
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}