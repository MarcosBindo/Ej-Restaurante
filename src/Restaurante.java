import java.util.Scanner;
import java.util.Vector;

public class Restaurante {
    private double caja;
    private Vector<Mesa> mesas;    

    public Restaurante() {
        this.mesas = new Vector<Mesa>(3, 1); // disponibilidad de 3 mesas

        for(int i = 0; i < 3; i++) {
            if(i % 2 == 0) {
                this.mesas.add(new Mesa(5));
            }
            else {
                this.mesas.add(new Mesa(3));
            }
        }
    }

public void Sentarse(int comensales){
    for(int i = 0; i < mesas.size(); i++) {
        if(mesas.get(i).getPersonasSentadas() == 0) {
            if(comensales < mesas.get(i).getCapacidad()) {
                mesas.get(i).setPersonasSentadas(comensales);
                System.out.println("Se han sentado " + comensales + " personas en la mesa " + i);
                break;
            }
        }
        if(i + 1 == mesas.size()) {
            System.out.println("Perdon, No hay mesas disponibles para esta cantidad de personas");
            break;
        }
    }
}
    
public void mesasDisponibles(){
    for (int i = 0; i < mesas.size(); i++){
        if(mesas.get(i).getPersonasSentadas() == 0){
            System.out.println("Mesa " + i + " libre con capacidad para " +(mesas.get(i).getCapacidad()-1)+ " personas");
        }
    }
}

public boolean mesasOcupadas(){
    boolean ocupacion = false;
    for (int i = 0; i < mesas.size();){
        if(mesas.get(i).getPersonasSentadas() > 0){
            System.out.println("Mesa " +i+" ocupadas con " + mesas.get(i).getPersonasSentadas() + " personas");
            ocupacion = true;
            break;
        }else{
            System.out.println("No hay mesas ocupadas");
            ocupacion = false;
            break;
        }
    }
    return ocupacion;
}






/*public void mostrarMesas(){
    for (int i=0;i<mesas.size();i++){

        System.out.println("Mesa:"+i+" ->> Sentados: "+mesas.get(i).getPersonasSentadas()+
        "|  Cuenta: "+mesas.get(i).getCuenta()+
        "|  Capacidad: "+mesas.get(i).getCapacidad());

    }
}*/

public void sumaGanancias(double factura){
    caja += factura;
}
public void verGananciasDia(){
    System.out.println(caja);
}

public Comidas[] showFood(int cantPlatos){
    int cont = 0;
    Scanner sc = new Scanner(System.in);
    Comidas[] pedido = new Comidas[cantPlatos];
    while(cont < cantPlatos){
        System.out.println("Menu de comidas: ");
        System.out.println("1-Cafe");
        System.out.println("2-Empanadas");
        System.out.println("3-Flan");
        System.out.println("4-Hamburguesa");
        System.out.println("5-Mouse de Chocolate");
        System.out.println("6-Panqueque");
        System.out.println("7-PapasFritas");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                pedido[cont] = new Cafe(200, "Con leche", true);
                break;
            case 2: 
                pedido[cont] = new Empanadas(50, "Jamon y Queso", 2);
                break;
            case 3:
                pedido[cont] = new Flan(300, "Con DDl", true);
                break;
            case 4:
                pedido[cont]= new Hamburguesa(600, "Completa", 2);
                break;
            case 5:
                pedido[cont] = new MouseChocolate(250, "Chocolate", true);
                break;
            case 6:
                pedido[cont] = new Panqueque(250, "Dulce de leche", true);
                break;
            case 7:
                pedido [cont] = new PapasFritas(400, "A a provenzal", 3);
        }
        cont++;
    }
    return pedido;
}

public void pedirComida(Comidas[] pedido, int nMesa){
    for (Comidas plato : pedido) {
        mesas.get(nMesa).setPedidos(plato);
        mesas.get(nMesa).setCuenta(plato.getPrecio());

        System.out.println(mesas.get(nMesa).getPedidos());
        System.out.println(mesas.get(nMesa ).getCuenta());
    } 
        

}

public void pagarCuenta(int nMesa){
    System.out.println("La mesa " + nMesa + " Pago " + mesas.get(nMesa).getCuenta());
}

}
