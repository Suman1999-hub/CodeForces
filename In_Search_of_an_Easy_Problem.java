package Array;
import java.util.*;
public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[n-1]==1){
            System.out.print("HARD");
        }
        else{
            System.out.print("EASY");
        }
    }
}
