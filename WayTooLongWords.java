import java.util.*;
public class WayTooLongWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			String str=sc.next();
			int n=str.length();
			if(n>10) {
				str=str.charAt(0) + "" + (n-2) + "" +str.charAt(n-1);
				System.out.println(str);
			}
			else {
				System.out.println(str);
			}
		}
	}

}
