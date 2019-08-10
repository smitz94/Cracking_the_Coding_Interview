package smit;

import java.util.HashMap;
import java.util.Scanner;

public class IsUnique {

    public static boolean is_Unique(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] strArray=str.toCharArray();

        for(char c: strArray) //counting frequency of characters in the string
        {
          if(hm.containsKey(c))
              hm.put(c,hm.get(c)+1);
          else
              hm.put(c,1);
        }

        for(HashMap.Entry mapElement : hm.entrySet()) // checking whether the characters are unique or not
        {
            int count=(int)mapElement.getValue();
            if(count>1)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
	String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        str=sc.next();
    boolean flag;

    flag=is_Unique(str);
    System.out.println(flag);

    }
}
