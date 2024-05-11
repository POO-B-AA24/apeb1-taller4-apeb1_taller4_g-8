class VnPro1 {
    public double precio;
    public int cantidad;

    public VnPro1(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return 0.10; 
        } else {
            return 0.05; 
        }
    }

    public double calcularPrecioFinal() {
        double descuento = calcularDescuento();
        double precioDescuento = precio * descuento;
        double precioFinal = precio - precioDescuento;
        return precioFinal;
    }
}
