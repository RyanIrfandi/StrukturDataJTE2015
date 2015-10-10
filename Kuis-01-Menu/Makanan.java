
/**
 * Write a description of class Makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makanan{
    
     String nama,harga;
    private JenisMakanan[] jenisMakanan;
        
        public Makanan(){
            jenisMakanan=null;
        }
        
       public Makanan (String nama, String harga, JenisMakanan jenismakanan[]){
           this.nama=nama;
           this.harga=harga;
           this.jenisMakanan=jenisMakanan;
           
        }
   
}
