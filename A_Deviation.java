// A. A.M. Deviation
/*d(a1,a2,a3)=|a1+a3−2⋅a2|.
Example
	inputCopy
	3
	3 4 5
	2 2 6
	1 6 5
	outputCopy
	0
	1
	0
*/
import java.util.*;
import java.lang.*;
public class Deviation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0){
			long sum=0;
			long a1=sc.nextLong();
			long a2=sc.nextLong();
			long a3=sc.nextLong();
			long d=Math.abs(a1+a3-(2*a2));
			if(d%3==0){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}
	}
}