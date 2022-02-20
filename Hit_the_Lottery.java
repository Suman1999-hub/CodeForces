//package CP;
import java.util.*;
public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        while(n!=0){
            if(n>=100){
                count++;
                n=n-100;
            }
            else if(n>=20){
                count++;
                n=n-20;
            }
            else if(n>=10){
                count++;
                n=n-10;
            }
            else if(n>=5){
                count++;
                n=n-5;
            }
            else if(n>=1){
                count++;
                n=n-1;
            }
        }
        System.out.print(count);
    }
}
