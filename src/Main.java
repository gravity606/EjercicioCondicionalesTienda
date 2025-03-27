//pide menos de 5, "Pedido minimo son 5
//entre 5 y 15, "el envio son 10 euros
//mas de 15 el envio es gratis


import java.util.Scanner;

public class Main { public static void main(String[] args) {

    double pedido;
    String confirmacion;
    String mensajeFinal;
    Scanner teclado = new Scanner(System.in);
    Scanner teclado2 = new Scanner(System.in);

    System.out.println("Introduzca la cantidad de paquetes que desea pedir:");
    pedido = teclado.nextDouble();

    if(pedido < 5){
        System.out.println("El pedido minimo es de 5 paquetes");
    }
    else{
        if(pedido >= 5 && pedido <= 15) {
            System.out.println("Ha solicitado un total de " + pedido + " paquetes.");
            System.out.println("Los gastos de envio son 10 euros");
        }
        else{
            System.out.println("Ha solicitado un total de " + pedido + " paquetes.");
            System.out.println("El envio de paquetes es gratuito");
        }
    }

    double precioTotal = pedido * 10;
    double descuento5 = precioTotal * 0.05;
    double descuento10 = precioTotal * 0.10;
    double precioConDescuento5 = precioTotal - descuento5;
    double precioConDescuento10 = precioTotal - descuento10;

    if(precioTotal <=50){
        System.out.println("Porfavor seleccione una cantidad mayor si quiere continuar con el pedido");
    }
    else{
        if(precioTotal <= 100){
        System.out.println("El precio de su compra es de " + precioTotal + " euros");
        System.out.println("No tiene derecho a ningun descuento");
        }
        else{
            if(precioTotal > 100 && precioTotal <= 300) {
            System.out.println("El precio de su compra es de " + precioTotal + " euros");
            System.out.println("Tiene un 5% de descuento por pedir mas de 100 euros, se ahorra: " + descuento5 + " euros");
            System.out.println("El precio de su compra aplicando este descuento es de: " + precioConDescuento5 + " euros");
            }
            else{
                System.out.println("El precio de su compra es de " + precioTotal + " euros");
                System.out.println("Tiene un 10% de descuento por pedir mas de 300 euros, se ahorra: " + descuento10 + " euros");
                System.out.println("El precio de su compra aplicando este descuento es de: " + precioConDescuento10 + " euros");
            }
    }

    System.out.println("Si esta de acuerdo con realizar el pedido, porfavor introduzca: si");
    System.out.println("De lo contrario introduzca: no");

    confirmacion = teclado2.nextLine();

    mensajeFinal = (confirmacion.equals("si")) ? "Su envio se realizara en las proximas 24 horas" : "Su pedido ha sido cancelado";

    System.out.println(mensajeFinal);

    }
}
}