



import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

 

class Batsman implements Serializable {
    String name;
    int runs;
    float avg;
    boolean ismarried;
    
    Batsman(String name,int runs, float avg, boolean ismarried){
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
public class IODeSerialDest1{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        
        String path = "C:\\spiderman\\ioprg\\input.txt";
        FileInputStream fis = new FileInputStream(path);
        
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Batsman ck = (Batsman)ois.readObject();
        ck.disp();
        
        
        
        
    }
    
}






