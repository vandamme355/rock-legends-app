public class Entrada {
    private String tipo;
    private int precio;

    public Entrada() {
        this.tipo = "VIP";
        pruebas-junit
        this.precio = 120000;
    }

        this.precio = 120000; // ejemplo: 120.000 CLP
        }
        main

    public void mostrarInfo() {
        System.out.println("Tipo de entrada: " + tipo);
        System.out.println("Precio: $" + precio + " CLP");
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Entrada entradaVIP = new Entrada();
        entradaVIP.mostrarInfo();
    }
}
