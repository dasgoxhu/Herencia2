package csii0117092020;

public class Profesor extends Empleado {
    private String departamento;
    
    public Profesor(){
    }

    public Profesor(String departamento, int Tiempo, String Despacho, String Nombre, String Apellido, String ID, boolean Estado) {
        super(Tiempo, Despacho, Nombre, Apellido, ID, Estado);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void cambioDerpatamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " El dia de entrada : " +  getTiempo() + " Despacho asignado es: " + getDespacho() + " Derpatamento: " + departamento;
       return Aux;
    }
    
}
