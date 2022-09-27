import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions 
{
    public static void main(String[] args) 
    {
        Pattern pattern = Pattern.compile(".xx.");
        Matcher matcher = pattern.matcher("xxxx"); //1xx4, AxxB True | 1x4x, AxBx False

        System.out.println("String matches the given regex "+matcher.matches());
        
    }
    
}
