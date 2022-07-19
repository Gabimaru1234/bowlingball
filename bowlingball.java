import java.util.*;
import java.io.*;
import java.math.*;
//today is 7/10.
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int[] nicee = new int[10];
        for (int i = 0; i < N; i++) {
            String GAME = in.nextLine();
            System.out.println(GAME);
            String[] nice = GAME.split(" ");
            for(int n = 0; n < N ;n++)
            {
                if(nice[n].equals("X"))
                {
                    nicee[n]=10+nice[n].charAt(0)-'0'+nice[n].charAt(1)-'0';
                }
                else if(nice[n].substring(1).eqauls("/"))
                {
                    nicee[n]=nice[n].charAt(0)-'0'+nice[n].charAt(1)-'0';
                }
                else if(nice[n].substring(1).equals('-'))
                {
                    nicee[n]=GAME.charAt(0);
                }
            }
            
            
        }
        

       
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(nicee);
    }
}