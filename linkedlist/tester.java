
/*
	This is code which implement linkedlist.
	This is a singly-link linkedlist.
	=======================
	Author: Shashank Parekh
	=======================
*/
import java.util.Scanner;

public class tester{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		linkedlist ld=new linkedlist();
		System.out.println("Press 1 to check linked list \nPress 2 to search element in linked list \nPress 3 to Delete element in linked list \nPress 4 to insert element in linked list \nPress anything to exit \n\n ");		
		int t=sc.nextInt();
		while(t!=0){
			if(t==1){

				// Method to print the whole linkedlist
				ld.print();
			}else if(t==2){
				System.out.println("Enter element to be searched in the list");
				int i=sc.nextInt();

				// Method to search any element in the linkedlist
				ld.search(i);
			}else if(t==3){
				System.out.println("Enter element to be deleted in the list");
				int i=sc.nextInt();

				// Method to delete any element in the linkedlist
				ld.delete(i);
			}else if(t==4){
				System.out.println("Enter element to be inserted in the list");
				int i=sc.nextInt();

				// Method to insert any element in the linkedlist
				ld.insert(i);
			}
			System.out.println("Press key");
			t=sc.nextInt();
		}
	}
}
