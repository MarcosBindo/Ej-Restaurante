import java.util.Vector;

public class Mesa {
    private final int capacidad;
    private int personasSentadas;
    private double cuenta;
    private Vector<Comidas> pedidos = new Vector<Comidas>();

    public Mesa(int capacidad) {
        super();
        this.capacidad = capacidad;
        this.pedidos = new Vector<Comidas>();
    }

    public int getPersonasSentadas(){
        return personasSentadas;
    }

    public void setPersonasSentadas(int personasSentadas){
        this.personasSentadas = personasSentadas;
    }

    public double getCuenta(){
        return cuenta;
    }

    public void setCuenta(double cuenta){
        this.cuenta += cuenta;
    }

    public Vector<Comidas> getPedidos(){
        return pedidos;
    }

    public void setPedidos(Comidas plato){
        this.pedidos.add(plato);
    }

    public int getCapacidad(){
        return capacidad;
    }
}


