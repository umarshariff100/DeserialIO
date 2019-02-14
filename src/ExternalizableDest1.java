import java.io.*; 
class Car implements Externalizable { 
    static int age; 
    String name; 
    int year; 
  
    public Car() 
    { 
        System.out.println("Default Constructor called"); 
    } 
  
    Car(String n, int y) 
    { 
        name = n; 
        year = y; 
        age = 10; 
    } 
    @Override
    public void writeExternal(ObjectOutput out)  
                              throws IOException 
    { 
        out.writeObject(name); 
        out.writeInt(age); 
        out.writeInt(year); 
    } 
    @Override
    public void readExternal(ObjectInput in)  
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
  
public class ExternalizableDest1 { 
    public static void main(String[] args) 
    { 
        Car car = new Car("Shubham", 1995); 
        Car newcar = null; 
  
        // Serialize the car 
       try { 
           String path = "C:\\spiderman\\ioprg\\Batsman.txt";
            FileInputStream fi = new FileInputStream(path); 
            ObjectInputStream si = new ObjectInputStream(fi); 
            newcar = (Car)si.readObject(); 
        } 
        catch (IOException | ClassNotFoundException e) { 
            System.out.println(e); 
        } 
  
        System.out.println("The original car is:\n" + car); 
        System.out.println("The new car is:\n" + newcar); 
       
  
        // Deserializa the car 
        
    } 
} 