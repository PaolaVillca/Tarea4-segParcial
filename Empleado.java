
/**
 * Write a description of class Persona here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Empleado{
    private String nombre;
    private String apellido;
    private int carnet;

    public Empleado (String nombre, String apellido, int carnet){
     this.nombre = nombre;
     this.apellido = apellido;
     this.carnet = carnet;
    }
    public String getNombre(){
     return nombre;
    }
    
     public String getApellido(){
     return apellido;
    }
    
     public int getCarnet(){
     return carnet;
    }
}
