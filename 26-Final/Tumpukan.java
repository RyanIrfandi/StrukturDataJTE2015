
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.BigInteger;
import java.util.*;
//import java.util.NoSuchElementException;
public class Tumpukan
{
 //   Stack stack = new Stack();
    private Node atas;
    private Node bawah;
    
    public Tumpukan(){
         this.atas=atas;
         
         this.bawah=bawah;
    }
    
    public void tumpuk(BigInteger Data){
        BigInteger atas = new BigInteger("0"); 
        atas =atas.add(Data);   
    }
    
    public BigInteger ambil(){
        
      //  if (atas == null) {
        //    throw new NoSuchElementException();
        //}
        return null;
      //  return null;
    }
    
    public BigInteger atas(){
        if(atas!=null){
            atas=atas;
        }
      return null;
    }
    
    public BigInteger bawah(){
        if(bawah!=null){
            atas=bawah;
        }
        return null;
    }
    
}