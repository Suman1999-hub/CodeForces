package CP;
import java.util.*;
public class KeplersLaw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int arr[]=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            double T1=(double)Math.pow(arr[0],2);
            double T2=(double)Math.pow(arr[1],2);
            double R1=(double)Math.pow(arr[2],3);
            double R2=(double)Math.pow(arr[3],3);
            if((double)(T1/R1)==(double)(T2/R2)){
                System.out.print("Yes");
            }
            else{
                System.out.print("No");
            }

            t--;
        }
    }
}
