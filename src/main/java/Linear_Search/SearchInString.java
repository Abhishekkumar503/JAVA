package Linear_Search;

import java.util.stream.IntStream;

public class SearchInString {
    public static void main(String[] args) {
        String str ="Abhishek";
        char ch ='A';
        System.out.println(StringSearch(str,ch));
        System.out.println(StringSearch2(str,ch));
    }
   static boolean StringSearch(String str, char target)
    {
       if (str.length()==0)
       {
           return false;
       }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i))
            {
                return true;
            }
        }
       return false;
    }

    static boolean StringSearch2(String str, char target)
    {
        if (str.length()==0)
        {
            return false;
        }
        for(char ch : str.toCharArray())
        {
            if (ch ==target)
                return true;
        }
        return false;
    }
}
