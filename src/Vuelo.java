public class Vuelo {
    //Atributos
    public int eVuelo;
    public String sOrigen;
    public String sDestino;

    //Métodos
    public Vuelo(int eVuelo, String sOrigen, String sDestino) {
        this.eVuelo = eVuelo;
        this.sOrigen = sOrigen;
        this.sDestino = sDestino;
    }
    public void showV(){
        System.out.println("-Vuelo #"+eVuelo+"\n-Origen: "+sOrigen+"\n-Destino: "+sDestino+"\n");
    }
}
