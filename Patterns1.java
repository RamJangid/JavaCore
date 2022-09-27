public class Patterns1 
{
    public static void main(String[] args) 
    {
        System.out.println("First Pattern");

        //pattern 1
        /*
        for(int i=0;i<4;i++)
        {
            for(int j=0; j<5;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        } */

        //pattern 2 1
        /* 
        for(int i=1;i<=4;i++)
        {
            for(int j=1; j<=5;j++)
            {
                if(i==2||i==3)
                {
                    if(j>1 && j<5)
                    {
                        System.out.print(" ");
                        continue;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        } */

        //pattern 2 2
        /* 
        for(int i=1;i<=4;i++)
        {
            for(int j=1; j<=5;j++)
            {
               if(i==1 || j==1 || i==4 || j==5 )
               {
                System.out.print("*");
               }
               else
               {
                    System.out.print(" ");
               }
                
            }
            System.out.println();
        }*/

        //pattern 3
        /* 
        for(int i=1;i<=4;i++)
        {
            for(int j=1; j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println();
        }*/

        //pattern 4 1
        /* 
        for(int i=1;i<=4;i++)
        {
            for(int j=1,k=4; j<=4&&k>=1;j++,k--)
            {
                if(k>=i)
                {
                    System.out.print("*");
                }
      
            }
            System.out.println();
        }*/

        //pattern 4 2
        /* 
        for(int i=4;i>=1;i--)
        {
            for(int j=1; j<=i;j++)
            {
               System.out.print("*");
            }
            System.out.println();
        }*/

        //pattern 5
        /* 
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=1;j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/

        //Pattern 6
        /* 
        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=i;j++)
            {
               System.out.print(j);
            }
            System.out.println();
        }*/

        //Pattern 7
        /* 
        for(int i=5;i>=1;i--)
        {
            for(int j=1; j<=i;j++)
            {
               System.out.print(j);
            }
            System.out.println();
        }*/

        //pattern 8
        /*
        int value=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=i;j++)
            {
               System.out.print(value+" ");
               value++;
            }
            System.out.println();
        }*/

        //Pattern 9
        /* 
        for(int i=1;i<=5;i++)
        {
            for(int j=1; j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");

                }
            }
            System.out.println();
        }*/

        //Pattern 1
        /* 
        int n=4;

        //Upper half
        for(int i=1;i<=n;i++)
        {
            //first part k *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //Yha pe smajna h, for space, you do not need to put the code into inner for loop

            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //second part k *

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            //Apko row me sare kaam krne h, For exmpl: i=1 pe sare kaam hue fir i=2 hoga
        }

        //Lower half

        /* 
        //upper half
        for(int i=n;i>=1;i--)
        {
            //first part k *
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //Yha pe smajna h, for space, you do not need to put the code into inner for loop

            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //second part k *

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            //Apko row me sare kaam krne h, For exmpl: i=1 pe sare kaam hue fir i=2 hoga
        }*/

        //pattern 2
        /* 
        int n=5;
        for(int i=1;i<=n;i++)
        {
            //for space in left side of value 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //for printing a value
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }

            //for space in right side of value 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }*/

        //pattern 3
        /* 
        int n=5;
       
        for(int i=1;i<=n;i++)
        {
            //for space in left side of value 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //for printing a value
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }*/

        //Pattern 4
        /* 
        int n=4;
        //for Upper side Pattern
        for(int i=1;i<=n;i++)
        {
            //for Upper left side Pattern
            //spaces code
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //for value
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //for upper right side pattern
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
      

        //for Lower side pattern

        for(int i=n;i>=1;i--)
        {
            //sbse pehle space ka code in left side for only one side which is left.
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //for lower side left pattern
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            //for lower side right pattern
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //Pattern 5

        int n=5;

        for(int i=1;i<=n;i++)
        {
            //space code 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //left side code here
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //right side code here
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
