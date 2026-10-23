import java.util.Scanner;

public class Devolvercambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int BILLETE_DE_100 = 100;
        final int BILLETE_DE_50 = 50;
        final int BILLETE_DE_20 = 20;
        final int BILLETE_DE_10 = 10;
        final int BILLETE_DE_5 = 5;
        final int MONEDA_DE_1 = 1;
        final int MONEDA_DE_2 = 2;
        System.out.print("Cuantos euros debe pagar: ");
        int precioProducto = scanner.nextInt();
        System.out.print("Cuantos euros entrega el cliente: ");
        int pagoCliente = scanner.nextInt();
        String validacionpago = (pagoCliente >= precioProducto) ? "Acción permitida" : "Error pago insuficiente";
        System.out.println(validacionpago);
        int cambio = pagoCliente - precioProducto;
        System.out.println(cambio / BILLETE_DE_100 + " billete(s) de 100 €");
        cambio %= BILLETE_DE_100;
        System.out.println(cambio / BILLETE_DE_50 + " billete(s) de 50 €");
        cambio %= BILLETE_DE_50;
        System.out.println(cambio / BILLETE_DE_20 + " billete(s) de 20 €");
        cambio %= BILLETE_DE_20;
        System.out.println(cambio / BILLETE_DE_10 + " billete(s) de 10 €");
        cambio %= BILLETE_DE_10;
        System.out.println(cambio / BILLETE_DE_5 + " billete(s) de 5 €");
        cambio %= BILLETE_DE_5;
        System.out.println(cambio / MONEDA_DE_2 + " moneda(s) de 2 €");
        cambio %= MONEDA_DE_2;
        System.out.println(cambio / MONEDA_DE_1 + " moneda(s) de 1 €");
        cambio %= MONEDA_DE_1;

    }

}
