
import java.util.Scanner;

public class Main {

    public static int eSizeClientV = 0, eSizeVueloV = 0, eSizeReservaV = 0;
    public static Scanner x = new Scanner(System.in);

    public static void main(String[] args) {
        //Principal
        Reserva vReserva[] = new Reserva[50];
        Cliente vClient[] = new Cliente[50];
        Vuelo vVuelo[] = new Vuelo[50];
        String sMenú = "***Menú***\n1. Registro de pasajero\n2. Registro de vuelo\n3. Registro de reserva\n4. Listado de pasajeros\n5. Listado de vuelos\n6. Listado de reservas\n0. Salida";
        int eChoice = 0, ei;
        do {
            System.out.println(sMenú);
            eChoice = x.nextInt();
            x.nextLine();
            switch (eChoice) {
                case 1:
                    crearCliente(vClient);
                    break;
                case 2:
                    crearVuelo(vVuelo);
                    break;
                case 3:
                    crearReserva(vReserva);
                    break;
                case 4:
                    for (ei = 0; ei < eSizeClientV; ei++) {
                        vClient[ei].showC();
                    }
                    break;
                case 5:
                    for (ei = 0; ei < eSizeVueloV; ei++) {
                        vVuelo[ei].showV();
                    }
                    break;
                case 6:
                    for (ei = 0; ei < eSizeReservaV; ei++) {
                        vReserva[ei].showR();
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (eChoice != 0);
    }

    public static void crearCliente(Cliente vClient[]) {
        String sId, sName;
        int ec, eSwitch;
        System.out.println("Nombre del cliente.");
        sName = x.nextLine();
        System.out.println("Ingrese indentificación.");
        sId = x.nextLine();
        vClient[eSizeClientV] = new Cliente(sId, sName);
        eSwitch = 0;
        ec = 0;
        if (ec < eSizeClientV) {
            do {
                if ((sId.equals(vClient[ec].sIdentificación))) {
                    eSwitch = 1;
                } else {
                    ec++;
                }
            } while ((ec < eSizeClientV) && (eSwitch == 0));
            if (eSwitch == 0) {
                vClient[eSizeClientV] = new Cliente(sId, sName);
                eSizeClientV++;
            } else {
                System.out.println("Cliente existente");
            }
        } else {
            vClient[eSizeClientV] = new Cliente(sId, sName);
            eSizeClientV++;
        }

    }
    public static void crearVuelo(Vuelo vVuelo[]) {
        int eVuelo;
        String sOrigen, sDestino;
        System.out.println("Número vuelo");
        eVuelo = x.nextInt();
        System.out.println("Origen del vuelo");
        sOrigen = x.next();
        x.nextLine();
        System.out.println("Destino del vuelo");
        sDestino = x.nextLine();
        vVuelo[eSizeVueloV] = new Vuelo(eVuelo, sOrigen, sDestino);
        int ei=0, eSwitch=0;
        if (ei < eSizeVueloV) {
            do {
                if((eVuelo==vVuelo[ei].eVuelo)){
                    eSwitch = 1;
                }else {
                    ei++;
                }
            } while ((ei < eSizeVueloV) && (eSwitch == 0));
            if (eSwitch == 0) {
                vVuelo[eSizeVueloV] = new Vuelo(eVuelo, sOrigen, sDestino);
                eSizeVueloV++;
            } else {
                System.out.println("Vuelo existente");
            }
        } else {
            vVuelo[eSizeVueloV] = new Vuelo(eVuelo, sOrigen, sDestino);
            eSizeVueloV++;
        }
    }
    public static void crearReserva(Reserva vReserva[]){
        String sId;
        int eVuelo;
        System.out.println("Ingrese ID del cliente para la reserva");
        sId=x.nextLine();
        System.out.println("Ingrese número del vuelo para la reserva");
        eVuelo=x.nextInt();
        
        vReserva[eSizeReservaV]= new Reserva(sId, eVuelo);
        eSizeReservaV++;
    }
        
    
}
    