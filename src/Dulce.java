public class Dulce extends Comidas {
    private boolean azucar;

    public Dulce(double precio, String plato, boolean azucar) {
        super(precio, plato);
        this.azucar = azucar;
    }

    public boolean isAzucar() {
        return this.azucar;
    }
}
