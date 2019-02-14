



import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

 

class Keepers implements Serializable {
      String name;
    transient int runs;
    transient  float avg;
    boolean ismarried;
    
    Keepers(String name,int runs, float avg, boolean ismarried){
        this.name = name;
        this.runs = runs;
        this.avg = avg;
        this.ismarried = ismarried;
    }
    
    void disp(){
        System.out.println(name);
        System.out.println(runs);
        System.out.println(avg);
        System.out.println(ismarried);
    }
}
public class SelDeSerial3a{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        
        String path = "C:\\spiderman\\ioprg\\Keeper.txt";
        FileInputStream fis = new FileInputStream(path);
        
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Keepers ck = (Keepers)ois.readObject();
        ck.disp();
        
        
        
        
    }
    
}






