
/*
	This program implement queue data-structure.
	I have implemented the queue using array and not using linked list because I have implemented stack using linked list.

	======================
	Author:Shashank Parekh
	====================== 
*/
import java.util.Scanner;
public class tester{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		queue q=new queue();
		
		System.out.println("Press 1 to display queue \nPress 2 to enqueue \nPress 3 to dequeue\n");

		// Enter no of element to be entered
		int t=sc.nextInt();
		while(t!=0){
			if(t==1){
				q.print();
			}else if(t==2){
				System.out.println("Enter element to be enqueue");
				int x=sc.nextInt();
				q.enqueue(x);
			}else if(t==3){
				q.dequeue();
			}
			System.out.println("Press Key");	
			t=sc.nextInt();
		}
		
	}
}
