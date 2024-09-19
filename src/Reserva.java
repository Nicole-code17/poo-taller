public class Reserva {
    //Atributos
    public String sId;
    public int eVuelo;
    
    //Métodos
    public Reserva(String sId, int eVuelo) {
        this.sId = sId;
        this.eVuelo = eVuelo;
    }
    public void showR(){
        System.out.println("-Identificación: "+sId+"\n-Vuelo: "+eVuelo);
    }
}
