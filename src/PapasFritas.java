public class PapasFritas extends Salada{
    public PapasFritas(double precio, String plato, int sal){
        super(precio,plato, sal);
    }

    @Override
    public int getCantidadSal() {
        return super.getCantidadSal() * 4;
    }
    
}
