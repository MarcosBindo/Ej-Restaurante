
public class Comidas {
    private double precio;
    private String plato;

    public Comidas(double precio, String plato) {
        this.precio = precio;
        this.plato = plato;
    }

    public double getPrecio() {
        return precio;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
