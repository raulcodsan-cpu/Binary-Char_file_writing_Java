import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);

    // Task 2 - Write Person to file1.txt using FileWriter
    // TODO 4: Add a static method textFileWrite() that returns void
    // TODO 5: Create Person object
    // TODO 6-7: Write to file using FileWriter in try-catch
    // TODO: Print message "File written with FileWriter..."
    public static void textFileWrite(){
        Person person = new Person("Raul", 32,82);

        try (FileWriter writer = new FileWriter("src/file1.txt");){

            writer.write(person.toString());
            writer.write("/r/n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    //  Task 3 - Write user input to file2.txt using PrintWriter
    // TODO 8: Define a static method printWrite() that returns void
    // TODO 9: Take input using Scanner
    // TODO 10: Create Person object
    // TODO 11-12: Write to file using PrintWriter in try-catch
    // TODO: Print message "File written with PrintWriter..."
    public static void printWrite(){

        String name = keyboard.next();
        int age = keyboard.nextInt();
        double weight = keyboard.nextDouble();

        Person person = new Person(name, age, weight);

        try(PrintWriter printWriter = new PrintWriter("src/file2.txt")){

            printWriter.println(person.toString());

        } catch (IOException e){
            IO.println("Exception: " + e.getMessage());
        }
    }


    // Task 4 - Write byte array to binary file3.dat using FileOutputStream
    // TODO 13: Define a static method writeBinaryNumbers() that returns void
    // TODO 14: Declare byte array
    // TODO 15-17: Write bytes using FileOutputStream in try-catch
    // TODO: Print message "File written with FileOutputStream..."
    public static void writeBinaryNumbers(){
        byte[] stringAsBytes = {1,2,3,4};
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/file3.dat")){
            for (byte stringAsByte : stringAsBytes) {
                fileOutputStream.write(stringAsByte);
            }
        } catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    // Task 5 - Write Person object to binary file4.dat using DataOutputStream
    //TODO 18: Define a static method writePersonBinary() that returns void
    // TODO 19: Read input using Scanner
    // TODO 20: Create Person object
    // TODO 21-23: Write attributes using DataOutputStream in try-catch
    // TODO: Print message "File written with DataOutputStream..."
    static void writePersonBinary(){
        String name = keyboard.next();
        int age = keyboard.nextInt();
        double weight = keyboard.nextDouble();
        Person person = new Person(name, age, weight);
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("src/file4.dat"))){
            outputStream.writeUTF(person.name);
            outputStream.writeInt(person.age);
            outputStream.writeDouble(person.weight);
        } catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // TODO 24: Call all static methods to test
        //textFileWrite();
        //printWrite();
        //writeBinaryNumbers();
        writePersonBinary();
    }
}



