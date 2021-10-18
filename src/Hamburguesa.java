public class Hamburguesa extends Salada{
    public Hamburguesa(double precio, String plato, int sal) {
        super(precio, plato, sal);
    }

    @Override
    public int getCantidadSal() {
        return super.getCantidadSal() * 2;
    }
}
