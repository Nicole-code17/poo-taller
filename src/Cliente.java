public class Cliente {
    //Atributos
    public String sIdentificación;
    public String sNombre;
    
    //Métodos
    public Cliente(String sIdentificación, String sNombre){
        this.sIdentificación = sIdentificación;
        this.sNombre = sNombre;
    }
    public void showC(){
        System.out.println("-Indentificación: "+sIdentificación+"\n-Nombre: "+sNombre+"\n");
    }
    
}
