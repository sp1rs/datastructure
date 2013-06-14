
public class queue{
	private int arr[];
	private int size=0;

	// Take size of array to be 100. We can take anything
	public queue(){
		arr=new int[100];
	}
		
	// Method to add element in queue
	public void enqueue(int x){
		arr[size++]=x;
	}
	
	// Method to remove element from queue
	public int dequeue(){
		return arr[--size];
	}
	
	// Method to print the queue
	public void print(){
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
