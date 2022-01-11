/*
Kepler’s Law states that the planets move around the sun in elliptical orbits with the sun at one focus. Kepler's 3rd law is The Law of Periods, according to which:

The square of the time period of the planet is directly proportional to the cube of the semimajor axis of its orbit.
You are given the Time periods (T1,T2) and Semimajor Axes (R1,R2) of two planets orbiting the same star.

Please determine if the Law of Periods is satisfied or not, i.e, if the constant of proportionality of both planets is the same.

Print "Yes" (without quotes) if the law is satisfied, else print "No".

Constraints
    1≤T≤104
    1≤T1,T2≤10
    1≤R1,R2≤10
Sample Input 1 
    3
    1 1 1 1
    1 2 3 4
    1 8 2 8
Sample Output 1 
    Yes
    No
    Yes
Explanation
    Test Case 1: 1^2/1^3=1^2/1^3
    Test Case 2: 1^2/3^3≠2^2/4^3
    Test Case 3: 1^2/2^3=8^2/8^3
*/
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
