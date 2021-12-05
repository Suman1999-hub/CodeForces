import java.util.*;
public class BeautifulYear {
	static boolean dist(int year) {
		String y=Integer.toString(year);
		char ch[]=y.toCharArray();
		for(int i=0;i<y.length();i++) {
			int flag=0;
			for(int j=0;j<y.length();j++) {
				if(ch[i]==ch[j]) {
					flag++;
					
				}
			}
			if(flag>=2) {
				return false;
			}
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		year=year+1;
		while(dist(year)==false) {
			year++;
		}
		System.out.print(year);
	}

}
