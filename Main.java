import java.util.Scanner;

public class Main {


    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Aplicacion bancaria");

        String nombreDelCliente = "Tony Stark";
        System.out.println(nombreDelCliente);
        String tipoDeCuenta = "Corriente";
        System.out.println(tipoDeCuenta);
        double saldo = 1599.99;
        System.out.println(saldo + "$");
        int retiro = 0;
        int deposito;
        int opcion;
        do  {
            System.out.println("********************************************");
            System.out.println("**Escribe el número de la opción deseada**");
            System.out.println("[1] - Consultar saldo");
            System.out.println("[2] - Retirar");
            System.out.println("[3] - Depositar");
            System.out.println("[9] - Salir");
            opcion = teclado.nextInt();


            switch (opcion) {
                case 1:

                    System.out.println("El saldo actualizado es:" + saldo);


                    break;

                case 2:

                    System.out.println("¿Cual es el valor que deseas retirar?" );
                    retiro = teclado.nextInt();

                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - retiro;
                        System.out.println("El saldo restante :" + saldo);
                    }

                    break;

                case 3:
                    System.out.println("¿ Cual es el valor que vas a depositar");
                    deposito = teclado.nextInt();
                    saldo = saldo + deposito;
                    System.out.println("El saldo actualizado es:" + saldo);

                    break;

                case 9:
                    System.out.println("Finalizando el programa,.Muchas gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion!=9);

    }
}

