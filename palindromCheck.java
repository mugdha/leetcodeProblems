package epicCenter;

import java.util.Scanner;

public class palindromCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Testcase=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < Testcase; i++) {
			String input=sc.nextLine();
			if(checkPalindrome(input))
			{
				int start=0;
				for (int si = input.length()-1; si >= input.length()/2; si--) {
					if(input.charAt(si)!=input.charAt(start))
					{
						 StringBuffer temp1=new StringBuffer();
						temp1.append(input.substring(0, start));
						temp1.append(input.substring(start+1));
						 StringBuffer temp2=new StringBuffer();
						 temp2.append(input.subSequence(0, si));
						 temp2.append(input.substring(si+1));
						 if(!checkPalindrome(temp1.toString()))
							 {
							 System.out.println(start);
							 break;
							 }
						 else
							 {
							 System.out.println(si);
							 break;
							 }
						 
					}
					start++;
						
				}	
							
			}
			else
			{
				System.out.println("-1");
			}
			
		}
	}
	
	public static boolean checkPalindrome(String s)
	{
		boolean flag=false;
		int i=0;
		for (int si = s.length()-1; si >= s.length()/2; si--) {
			if(s.charAt(si)!=s.charAt(i++))
			{
				flag=true;
			}
				
		}	
		
		return flag;
	}

}
