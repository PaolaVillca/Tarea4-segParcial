
/**
 * Write a description of class Astronauta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cajero extends Empleado
{
    private Mesero orden;
    
    public Cajero (Mesero orden, String nombre,String apellido,int carnet){
     super(nombre,apellido,carnet);
     this.orden=orden;
     
    }
    public String cobrar(){
        String res;
        if(orden == null){
          res = "aun no ordeno no hay nada que cobrar";
        }else{
          res = "cobrar platillo consumido";
        }
     return res;
    }
}
