package jinkom;

import java.util.Scanner;



public class Test {
	public static void main(String[] args) {
		/*Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数");
		int sum1=input.nextInt();*/
		while(true){
			int sum1=(int)(Math.random()*10);
			
			for (int i = 0; i < sum1; i++) {
				
				for (int j = 0; j <sum1-i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <i*2+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(sum1==5){
				break;
			}
		}
		
	}
}
