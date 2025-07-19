public class Entrada {
    private String tipo;
    private int precio; // en pesos chilenos

    public Entrada() {
        this.tipo = "VIP";
        this.precio = 120000; // ejemplo: 120.000 CLP
    }

    public void mostrarInfo() {
        System.out.println("Tipo de entrada: " + tipo);
        System.out.println("Precio: $" + precio + " CLP");
    }

    // Getters necesarios para pruebas
    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    // Método main para ejecutar manualmente
    public static void main(String[] args) {
        Entrada entradaVIP = new Entrada();
        entradaVIP.mostrarInfo();
    }
}
