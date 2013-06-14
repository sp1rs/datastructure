
/*
	This code is about stack implementation.
	I am using linkedlist to implement stack.(We can also use array to implement stack)
*/

import java.util.Scanner;
public class tester{
	public static void main(String[] args){
		stack st=new stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 to push element in stack \nPress 2 to pop element in stack \nPress 3 to peek in stack \nPress 4 to display all element in stack \nPress 0 to exit \n");
		System.out.println("Press Key");
		int t=sc.nextInt();
		while(t!=0){
			if(t==1){
				System.out.println("Enter element");
				int x=sc.nextInt();
				st.push(x);
			}else if(t==2){
				st.pop();
			}else if(t==3){
				st.peek();
			}else if(t==4){
				st.print();
			}
			System.out.println("Press Key");
			t=sc.nextInt();
		}
	}
}
