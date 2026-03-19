import java.util.*;
import java.util.Scanner;
class demo {
    public static int add(int a,int b) {
        return a+b;
    }
    public static String getname()
    {
        return "Sayali";
    }
    public static int divide(int a,int b)
    {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=add(a,b);
        System.out.println(ans);
    }
}