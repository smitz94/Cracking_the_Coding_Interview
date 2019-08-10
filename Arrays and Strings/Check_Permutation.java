package smit;

import java.util.Scanner;

public class Check_Permutation {

    public static boolean is_Permutation(String strA,String strB)
    {
        if(strA.length()!=strB.length())
            return false;

        int[] characters=  new int[128];

        char[] strA_array=strA.toCharArray();

        for(char c: strA_array)
        {
            characters[c]++; //updating character count using ASCII value corresponding to that in the array
        }

        // cross checking the character count in string B now

        for(int i=0;i<strB.length();i++)
        {
            int j= (int) strB.charAt(i); //converting character to ASCII value
            characters[j]--;
            if(characters[j]<0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String strA = new String();
        String strB = new String();
        Scanner sc =new Scanner(System.in);
        System.out.print("String A: ");
        sc.next();
        System.out.print("String B: ");
        sc.next();

        boolean flag = is_Permutation(strA,strB);

        System.out.println(flag);

    }
}
