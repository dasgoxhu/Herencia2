package csii0117092020;


public class Persona {
  private String Nombre, Apellido, ID, Estado; 

    public Persona(){
    }

    public Persona(String Nombre, String Apellido, String ID, boolean Estado) 
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.Estado = Estado;
    }

    public String getNombre() 
    {
        return Nombre;
    }

    public String getApellido() 
    {
        return Apellido;
    }

    public String getID() 
    {
        return ID;
    }

    public boolean getEstado() 
    {
        return Estado;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) 
    {
        this.Apellido = Apellido;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public void CabioCivil(String Estado) 
    {
        this.Estado = Estado;
    }
    
    public String MostrarInf()
    {
       String Aux;
       Aux = "Nombre: " + Nombre + " Apellidos: " + Apellido + " Documento de identificacion: " + ID + " Estado Civil: " + Estado;
       return Aux;
    }
    
    
  
}
