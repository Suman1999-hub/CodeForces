//package CP;
import java.util.*;
public class Collecting_Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int sum=a+b+c+n;
            if(sum%3==0&&sum/3>=max){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
