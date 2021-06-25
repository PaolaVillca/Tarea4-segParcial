
/**
 * Write a description of class Maestro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cocinero extends Empleado
{
  
    private Mesero orden;
    public Cocinero(Mesero orden,String nombre,String apellido,int carnet){
     super(nombre,apellido,carnet);
     this.orden=orden;
    }
    
    public String PrepPlatillo(){
        String res;
        if(orden == null){
          res = "No se recibio orden";
        }else{
          res = "Platillo preparado";
        }
     return res;
    }
}
