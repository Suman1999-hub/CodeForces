//B. Odd Grasshopper
/*
Example
	input
	9
	0 1
	0 2
	10 10
	10 99
	177 13
	10000000000 987654321
	-433494437 87178291199
	1 0
	-1 1
	output
	-1
	1
	11
	110
	190
	9012345679
	-87611785637
	1
	0
Note
	The first two test cases in the example correspond to the first two jumps from the point x0=0.

	Since 0 is an even number, the first jump of length 1 is made to the left, and the grasshopper ends up at the point 0−1=−1.

	Then, since −1 is an odd number, a jump of length 2 is made to the right, bringing the grasshopper to the point with coordinate −1+2=1.
*/
import java.util.*;
public class S{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long ans=0,rem=0;
		long t=sc.nextLong();
		while(t-->0){
			long x0=sc.nextLong();
			long n=sc.nextLong();
			rem=n%4;
			long q=n/4;
			if(x0 % 2==0){
				if(rem==0){
					ans=x0;
				}
				else if(rem==1){
					ans=x0 + -(1+4*q);
				}
				else if(rem==2){
					ans= x0+1;
				}
				else{
					ans=x0 + 4*(q+1);
				}
			}
			else{
				if(rem==0){
					ans=x0;
				}
				else if(rem==1){
					ans=x0 +(1+4*q);
				}
				else if(rem==2){
					ans=x0-1;
				}
				else{
					ans=x0 - 4*(q+1);
				}
			}
			System.out.println(ans);
		}
	}
}