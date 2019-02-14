import java.io.*; 
class Van implements Serializable { 
    static int age; 
    String name; 
    int year; 
  
    public Van() 
    { 
        System.out.println("Default Constructor called"); 
    } 
  
    Van(String n, int y) 
    { 
        name = n; 
        year = y; 
        age = 10; 
    } 
    private void writeObject(ObjectOutputStream out)  
                              throws IOException 
    { 
        out.writeObject(name); 
        out.writeInt(age); 
        out.writeInt(year); 
    } 
    public void readExternal(ObjectInputStream in)  
       throws IOException, ClassNotFoundException 
    { 
        name = (String)in.readObject(); 
        year = in.readInt(); 
        age = in.readInt(); 
    } 
    @Override
    public String toString() 
    { 
        return ("Name: " + name + "\n" +  
               "Year: " + year + "\n" +  
               "Age: " + age); 
    } 
   
       
} 
  
public class SerializableDest1 { 
    public static void main(String[] args) 
    { 
        Van car; 
        car = new Van();
        Van newcar = null; 
  
        // Serialize the car 
       try { 
           String path = "C:\\spiderman\\ioprg\\Batsman.txt";
            FileInputStream fi = new FileInputStream(path); 
            ObjectInputStream si = new ObjectInputStream(fi); 
            newcar = (Van)si.readObject(); 
        } 
        catch (IOException | ClassNotFoundException e) { 
            System.out.println(e); 
        } 
  
        System.out.println("The original car is:\n" + car); 
        System.out.println("The new car is:\n" + newcar); 
       
  
        // Deserializa the car 
        
    } 
} 

