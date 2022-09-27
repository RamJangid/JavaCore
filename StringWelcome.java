import java.util.Scanner;

public class StringWelcome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //Scanner non premitive data type

        //String name = sc.next(); //not using nextLine() Fn, so "Tony" on output, so even its String data type but use nextLine()

      /*String name = sc.nextLine(); 
        System.out.println(name);*/
        
        // String firstName = "Tony";
        // String lastName = "Stark";

       // String fullName = firstName + lastName; //+ operator works here but space do not include, wese be Tony Stark me space h hi nhi

    //    String fullName = firstName +" "+ lastName;
    //     System.out.println(fullName);

    //     System.out.println(fullName.length());

    //     for(int i=0; i<fullName.length();i++)
    //     {
    //         System.out.println(fullName.charAt(i));
    //     }
    //     System.out.println();

        // String str1 = "Tony2";
        // String str2 = "Tony";

        // if(str1.compareTo(str2)==0)
        //     System.out.println("Both String are equal");
        
        // else if(str1.compareTo(str2)>=0)
        //     System.out.println("Str1 > Str2");

        // else 
        //     System.out.println("Str1 < Str2");

        //Let's try using direct str1 == str2, it does not work all the time

    
        // String str1 = "Tony";
        // String str2 = "Tony";

        // if(str1 == str2)
        // {
        //     System.out.println("Both Equal");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }

        // if(new String("Tony") == new String("Tony"))
        // System.out.println("Equal with new operator");
        // else
        // System.out.println("Not Equal with new operator"); // This is the output

        // String sentence = "My name is Tony";
        // //String name = sentence.substring(11);
        // String name = sentence.substring(11, sentence.length());
        // System.out.println(name); 

        // String sentence2 = "Tony Stark";
        // String name2 = sentence2.substring(0, 4);
        // System.out.println(name2);

        // String name3 = sentence2.substring(5);
        // System.out.println(name3);

    
        // String str1 = "Tony";
        // String str2 = "Tony";

        // if(str1.equals(str2))
        // System.out.println("Equal");
        // else
        // System.out.println("Not Equal");

        // String str1 = "TONY";
        // String str2 = "tony";

        // if(str1.equals(str2))
        // System.out.println("Equal");
        // else
        // System.out.println("Not Equal");

        // if(str1.equalsIgnoreCase(str2))
        // System.out.println("Equal with Ignore Case");
        // else
        // System.out.println("Not Equal with Ignore case");

        // String str1 = "123";
        // int num = Integer.parseInt(str1);
        // float numFloat = Float.parseFloat(str1);
        // byte numByte = Byte.parseByte(str1);
        // short numShort = Short.parseShort(str1);
        // long numLong = Long.parseLong(str1);
        // double numDouble = Double.parseDouble(str1);
        // boolean numBoolean = Boolean.parseBoolean(str1);

        // System.out.println(num);
        // System.out.println(numFloat);
        // System.out.println(numByte);
        // System.out.println(numShort);
        // System.out.println(numLong);
        // System.out.println(numDouble);
        // System.out.println(numBoolean);

        // int num = 123;
        // String str = Integer.toString(num);
        // System.out.println(str);
        // System.out.println(str.length());

        // boolean bool = true;
        // String strBool = Boolean.toString(bool);
        // System.out.println(strBool);

        // char charValue = 'a';
        // String strChar = Character.toString(charValue);
        // System.out.println(strChar);
        // Short.toString(num); All 8 Clasees have the toString Fn
        // Float.toString(f);
        // Double.toString(d);
        // Long.toString(i);
        // Byte.toString(b);
        // Boolean.toString(b);
        // Character.toString(c);
    

        // int lengthValue = 0;
        // String arr[] = new String[5];

        // System.out.println("Enter the String Elements");

        // for(int i=0; i<arr.length;i++)
        // {
        //     System.out.println("Enter Element at "+i);
        //     arr[i] = sc.nextLine();
        //     lengthValue = lengthValue + arr[i].length();
        // }
        // System.out.println("Length of all String Array is"+lengthValue);

        // String original = "eabcdef";

        // char result[] = new char[original.length()];

        // for(int i=0; i<original.length(); i++)
        // {
        //     if(original.charAt(i)=='e')
        //         result[i] = 'i';
        //     else
        //         result[i] = original.charAt(i);
        // }

        // for(int i=0; i<result.length;i++)
        // {
        //     System.out.print(result[i]);
        // }


        // String email = "apnaCollegeJava@gmail.com";
        // int value = email.length()-10;

        // String user = email.substring(0, value);
        // System.out.println(user);


        //concat Fn 

        // String str1 = "Tony";
        // String str2 = " Stark";

        // String newString = str1.concat(str2);

        // System.out.println(newString);

        // //contains() Fn

        // if(str1.contains("T"))
        // System.out.println("It contains char T");
        
        //String str1 = "Tony";
        char arr[] = {'H','e','l','l','o'};
        String str2 = "";

        str2 = str2.copyValueOf(arr, 0,5);

        System.out.println(str2);
    }
}
