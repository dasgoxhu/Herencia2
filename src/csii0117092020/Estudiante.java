
package csii0117092020;


public class Estudiante extends Persona {
    private String Curso;
    
    public Estudiante(){
    }

    public Estudiante(String Curso, String Nombre, String Apellido, String ID, boolean Estado) {
        super(Nombre, Apellido, ID, Estado);
        this.Curso = Curso;
    }

    public String getCurso() {
        return Curso;
    }

    public void CabioCurso (String Curso){
        this.Curso = Curso;
    }
    
    @Override
       public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + getNombre() + " Apellidos: " + getApellido() + " Documento de identificacion: " + getID() + " Estado Civil: " + getEstado() + " Curso: " +  Curso; ;
       return Aux;
    }

    void setEstado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
