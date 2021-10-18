import java.util.Scanner;
import java.util.Vector;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Restaurante resto = new Restaurante();
        boolean cerrado = false;
        
        while(cerrado!= true){
            MostrarMenu();
            System.out.print("Ingrese la opcion: ");
            int op = sc.nextInt();
            
            switch(op){
                case 1: 
                    resto.mesasDisponibles();
                break;
                case 2:
                    System.out.print("Ingrese la cantidad de comensales: ");
                    int comensales = sc.nextInt();
                    resto.Sentarse(comensales);
                    break;
                case 3: 
                    if(resto.mesasOcupadas() == true){
                       System.out.print("Que Numero de mesa realizara un pedido?: ");
                        int nMesa = sc.nextInt();
                        System.out.print("Cuantos platos van a pedir?:");
                        int cantPlatos = sc.nextInt();
                        Comidas[] pedido = resto.showFood(cantPlatos); 
                        resto.pedirComida(pedido, nMesa);
                        
                    }else{
                        resto.mesasOcupadas();
                        break;
                    }
                    break;
                case 4:
                    System.out.print("Que Numero de mesa pagara la cuenta?: ");
                    int nMesa = sc.nextInt();
                    resto.pagarCuenta(nMesa);
                    break;
                case 5:
                    cerrado = true;
            }

        }
        System.out.println("Saliste del Restaurante");
    }

    public static void MostrarMenu(){
        System.out.println("Menu de opciones: ");
        System.out.println("1-Mostrar Mesas disponibles");
        System.out.println("2-Ocupar Mesa");
        System.out.println("3-Pedir Comida");
        System.out.println("4-Pagar cuenta");
        System.out.println("5-Cerrar Resto.");
        
    }
}
    
     
            

