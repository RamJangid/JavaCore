import java.util.*;
import java.io.*;

public class newProj {
void mainMenu() {

System.out.println("Choose the file Operations You want to perform :");
System.out.println("1. List the Files.");
System.out.println("2. Operations on Files.");
System.out.println("3. Exit");

}
public static void main(String[] args) {

// TODO Auto-generated method stub
System.out.println(" Welcome Screen !!!!");
System.out.println(" File Manager Application : Jigar Bariya ");
newProj a = new newProj();
a.mainMenu();

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter your Choice");
int ch=sc.nextInt();
switch(ch){

case 1 :

File fileDir = new File("C:\\Users\\JIGAR\\OneDrive\\Desktop\\test");
if(fileDir.isDirectory()) {

List<String> listFile = Arrays.asList(fileDir.list());
Collections.sort(listFile);

for(String s: listFile){

System.out.println(s);

}

}
break ;

case 2 :

System.out.println("1. Add a File");
System.out.println("2. Delete a File");
System.out.println("3. Search a File");
System.out.println("4. Navigate to Main Menu");

System.out.println("Please Enter your Choice");
int ch1=sc.nextInt();

switch(ch1) {
case 1 :

System.out.println("Enter the File Name you want to Add");

String str = sc.next();

File file = new
File("C:\\Users\\JIGAR\\OneDrive\\Desktop\\test\\"+str);

try {

boolean value = file.createNewFile();
if (value) {
System.out.println("New Java File is created.");
}
else {
System.out.println("The file already exists.");
}
}
catch(Exception e) {

e.getStackTrace();
}

break;
case 2 :

System.out.println(" Enter The File Name You want to Delete ");

String str2 = sc.next();

File f =new
File("C:\\Users\\JIGAR\\OneDrive\\Desktop\\test\\"+str2);
try {

if(f.exists()) {

if(f.delete()) {

System.out.println("File Deleted : "+f.getName());

}
else {

System.out.println("Failed");

}

}

else {

System.out.println("Incorrect File Name, File Doesn't Exists");

}

}
catch(Exception e) {
e.getMessage();

}
break;

case 3 :

System.out.println(" Enter The File NAme You want to Search ");

String str1 = sc.next();

File f1=new

File("C:\\Users\\JIGAR\\OneDrive\\Desktop\\test\\"+str1);

if (f1.exists()) {

System.out.println("Found Your File : "+f1);

}
else {

System.out.println("File Does Not Exists !!!");

}

break;

case 4 :

a.mainMenu();
break;

}
case 3 :

break;

}

}
}