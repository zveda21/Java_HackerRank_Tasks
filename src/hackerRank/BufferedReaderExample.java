package hackerRank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N <= 1 || N >= 21) {
            System.out.println("You need to enter integer between 2-20");
        }else {
            for (int i = 1; i <=10 ; i++) {
                System.out.println(N+" x "+i+" = "+N*i);
            }

        }
        bufferedReader.close();

    }
}

//public class Palindrome
//{
//    public static void main(String args[])
//    {
//        String x, y = "";
//        Scanner a = new Scanner(System.in);
//        System.out.print("Enter  string you want to check:");
//        x = a.nextLine();
//        int l = x.length();
//        for(int k = l - 1; k >= 0; k--)
//        {
//            y = y + x.charAt(k);
//        }
//        if(x.equalsIgnoreCase(y))
//        {
//            System.out.println("The string is palindrome.");
//        }
//        else
//        {
//            System. out.println("The string is not a palindrome.");
//        }
//    }
//}