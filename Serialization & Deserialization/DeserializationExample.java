import java.io.*;

public class DeserializationExample {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person = (Person) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Deserialized Person:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
