
/**
 * Write a description of class Vektor3D here.
 * immutable : cuma bisa dilihat g bisa di ubah oleh yg lain , pkai private utk bisa dilihat panggil method getter
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector3D
{
   double x,y,z ;
  
   public Vector3D (double x,double y,double z){
       this.x=x;
       this.y=y;
       this.z=z;
     } 
    
  public double getX(){
      return x;
    }
    
  
  public double getY(){
      return y;
    }
  
    
  public double getZ(){
      return z;
    }
}
