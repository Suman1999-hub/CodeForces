package CP;
import java.util.*;
public class PlusOneOnTheSubset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            Arrays.sort(arr);
            sum=arr[n-1]-arr[0];
            System.out.println(sum);

        }
    }
}
