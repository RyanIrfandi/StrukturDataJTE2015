
/**
 * Write a description of class FiniteElement here.
 * komposisi : class yg menytakan kumpulan bagian2 dari class GAYA 
 * 
 */
public class FiniteElement {
  
   private Gaya[] gaya; 
   
   public FiniteElement(){
       
    }
    
   public FiniteElement(Gaya[] gaya){
       this.gaya=gaya;
    }
    
   public Gaya[] daftarGaya(){
       return gaya;
    }
    
}
