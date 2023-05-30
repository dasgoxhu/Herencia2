
package csii0117092020;

public class Empleado extends Persona {
    private int Tiempo;
    private String Despacho;

    public Empleado(){
    }

    public Empleado(int Tiempo, String Despacho, String Nombre, String Apellido, String ID, boolean Estado)
    {
        super(Nombre, Apellido, ID, Estado);
        this.Tiempo = Tiempo;
        this.Despacho = Despacho;
    }

    public Empleado(int Tiempo, String Despacho) 
    {
        this.Tiempo = Tiempo;
        this.Despacho = Despacho;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public String getDespacho() {
        return Despacho;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void cambioDespacho(String Despacho) {
        this.Despacho = Despacho;
    }
    @Override
       public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " El dia de entrada : " +  Tiempo + " Despacho asignado es: " + Despacho;
       return Aux;
    }

    void setEstado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
