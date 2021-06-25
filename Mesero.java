
/**
 * Write a description of class Albanil here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mesero extends Empleado
{
    private String tomarOrden;
    public Mesero (String tomarOrden, String nombre,String apellido,int carnet){
     super(nombre,apellido,carnet);
     this.tomarOrden = tomarOrden;
    }
    public String getRecibirOrden(boolean a, int i){
        a = false;
       int [] orden = new int[20];
       for( i=0; i<orden.length;i++){
        if (i > 0){
          a = true;
        }
        }
        
     return tomarOrden;
    }
}
