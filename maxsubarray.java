package epicCenter;

import java.util.Scanner;

public class maxsubarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int i = 0; i < T; i++) {
			int N=sc.nextInt();
			int arry[]=new int[N];
			for (int j = 0; j < N; j++) {
				arry[j]=sc.nextInt();
			}
			// for contiguous
			int so_far=arry[0];
			int best_far=arry[0];
			 
			for (int j = 1; j < N; j++) {
				int val=so_far+arry[j];
				 if(val>arry[j])
					so_far= val;
				 else
					 so_far=arry[j];
				 if(best_far<so_far)
					 best_far=so_far;
				 
				
			}
			
			
			// for non contiguous
			int sum=0;
			int negVal=Integer.MIN_VALUE;
			for (int j = 0; j < N; j++) {
				 if(arry[j]>0)
				 {
					 sum+=arry[j];
				 }
				 else if(negVal<arry[j])
				 {
					 negVal=arry[j];
				 }
					 
				
			}			 
			if(sum==0)
				System.out.println(best_far+" "+negVal);
			else
				System.out.println(best_far+" "+sum);
			
			
		}
	}

}
