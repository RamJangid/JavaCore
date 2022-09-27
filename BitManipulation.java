public class BitManipulation 
{
    public static void main(String[] args) 
    {
        //Get operation(AND Logic) : Get the Bit 0 or 1 at the required position
        // int num =5; //0101
        // int pos = 3; //1st Bitmast create 1<<2 (2 is position from which we want to do Get operation)

        // if((pos & num) == 0) //2nd Perform AND operation then check if 0 or 1;
        // {
        //     System.out.println("Bit at "+pos+" position is 0");
        // }
        // else
        // {
        //     System.out.println("Bit at "+pos+" position is 1");
        // }

        //Set Operation(OR Logic) : Set 1 to 0 or 1 to 1 at the required position 

        // int num =5; //0101
        // int pos = 1; 

        // int bitMask = 1<<1; ////1st Bitmast create 1<<1 (1 is position from which we want to do Get operation)

        // int newNumber = bitMask | num;//OR Logic 0010 | 0101 = 0111 = (7)base10
        // System.out.println(newNumber);//7

        //Clear Operation(~, AND) : Always clear and make the Bit as 0 at required position


        int num =5; //0101
        int pos = 2; 

        int bitMask = 1<<2; //1st Bitmask (1<<i) 
        int notBitMask = ~(bitMask); //2nd ~(NOT) the bitMask

        int newNumber = notBitMask & num; //3rd notBitMask AND num 
        System.out.println(newNumber);//0001

        //Update is just Clear if 1 -> 0 and Set if 0 -> 1;
        
    }
    
}
