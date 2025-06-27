import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NoteReadAndWrite {
    public static void main(String[] args) {
        System.out.println("Choose option from below");
        System.out.println("1. Write a note\n2. Read the Note");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        sc.nextLine();
        switch (choise)
        {
            case 1 :
                System.out.println("Enter the note you want to write");
                String input = sc.nextLine();
                try(FileWriter writer = new FileWriter("Note.txt",true))
                {
                    writer.write(input + "\n");
                    System.out.println("Your note successfully saved");

                } catch (IOException ioException) {
                    System.out.println("Error in : "+ ioException.getMessage());;
                }
                break;

            case 2:
                try
                {
                    FileReader fileReader = new FileReader("Note.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String output;
                    System.out.println("Your Notes are");
                    while((output = bufferedReader.readLine()) != null)
                    {
                        ;
                        System.out.println(output);
                    }
                    bufferedReader.close();
                    fileReader.close();

                } catch (FileNotFoundException e) {
                    System.out.println("The file you want to access is not available" + e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

            default:
                System.out.println("Your Entered Wrong Choise!! try again");
        }

    }
}