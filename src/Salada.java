public class Salada extends Comidas{
    
    private int cantidadSal;

    public Salada(double precio, String plato, int sal) {
        super(precio, plato);
        this.cantidadSal = sal;
    }

    public Salada(Comidas comida, int sal) {
        super(comida.getPrecio(), comida.getPlato());
        this.cantidadSal = sal;
    }

    public int getCantidadSal() {
        return this.cantidadSal;
    }
}
