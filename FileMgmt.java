import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMgmt 
{

    public static void main(String[] args) 
    {
        System.out.println("Main Fn starts here");
        //1. Creating a new File 

        
        //File myFile = new File("NewFile.txt");//Even you can give any other path you want

        // File myFile = new File("C:\\Users\\91820\\Music\\FullStackDeveloper//FileAddedInDifferentFolder.txt");
        // try 
        // {
        //     myFile.createNewFile();
        //     System.out.println("New file has been created Successfully "+myFile.getName());
        // } 
        // catch(IOException e) 
        // {
        //     System.out.println("File already exists, custom msg");
         
        //     e.printStackTrace();
        // }


        File myFile = new File("NewFile.txt");//Even you can give any other path you want

        try 
        {
            if(myFile.exists())
            {
                System.out.println("File Name: "+myFile.getName());
                System.out.println("Absolute Path : "+myFile.getAbsolutePath());
                System.out.println("Can Write! :"+myFile.canWrite());
                System.out.println("Can Read! "+myFile.canRead());
                System.out.println("File size in Bytes : "+myFile.length());
            }
        } 
        catch(Exception e) // You can not have try catch for IOException if exception code is thrown
        {
            System.out.println("Exception class, custom msg");

        }
        



        //2. Write the text in the file

        /* 
        try
        {
            FileWriter fileWriter = new FileWriter("NewFile.txt");
            fileWriter.write("txt is written in file by program");
            fileWriter.close();//It is necessary, without this you can not write txt and save in the file
        } 
        catch (IOException e) 
        {
            System.out.println("Could not write the text in file, please try again");
            e.printStackTrace();
        }*/

        //3. Read the txt in the file

        /* 
        File myFile = new File("test.txt");// or NewFile.txt
        //You are not calling myFile.createNewFile(); as File is already there but file obj is needed

        try
        {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            System.out.println("You have read it successfully");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found, custom msg");
            e.printStackTrace();
        }*/

        //4. Delete a file 

        // File myFile = new File("test.txt");

        // if(myFile.delete())
        // {
        //     System.out.println("We have deleted "+myFile.getName());
        // }
        // else
        // {
        //     System.out.println("Some issue occured while deleting a file");
        // }

        // System.out.println("Main Fn, Normal Flow");
        
    }
    
}
