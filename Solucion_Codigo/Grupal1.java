import java.util.Scanner;
public class Grupal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio,descuento,precioF;
        int cantidad;
        System.out.print("Ingrese el precio del producto");
        precio = sc.nextDouble();
        System.out.print("Ingrese el número de productos: ");
        cantidad = sc.nextInt();

        VnPro1 venta = new VnPro1(precio, cantidad);

        descuento = venta.calcularDescuento();
        precioF = venta.calcularPrecioFinal();

        System.out.println("Descuento Total" + (descuento * 100) + "%");
        System.out.println("Precio final:" + String.format("%.2f", precioF));
    }
}

