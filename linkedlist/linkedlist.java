public class linkedlist{
	public node Head;
	node n;
	
	public linkedlist(){
		Head=null;
		n=new node();
	}

	public node search(int key){
		node y=Head;
		if(y==null){
			System.out.println("Empty Linked List");
		}else{
			do{
				if(y.key==key){
					System.out.println("Key is present in the linkedlist");
					break;
				}
				y=y.next;	
		
			}while(y!=null);
		}
		if(y==null){
			System.out.println("Key is not present in the linkedlist");
		}
		return y;
	}

	public void delete(int key){
		node y=Head;
		node x=null;
		if(y==null){
			System.out.println("Empty Linked List");
		}else{
			do{
				if(y.key==key){
					break;
				}
				x=y;
				y=y.next;
			}while(y!=null);
		
		}
		if(x==null){
			node temp=y.next;
			y.next=null;
			Head=temp;
		}else if(y==null){
			System.out.println("Element Not found in the linkedlist");
		}else{
			x.next=y.next;
			y.next=null;
		}
	}

	public void insert(int key){
		node n=new node(key);
		if(Head==null){
			Head=n;
		}else{
			node x=Head;
			while(x.next!=null){
				x=x.next;
			}
			x.next=n;
		}	
	}
	
	public void print(){
		node y=Head;
		if(Head!=null){
			while(y.next!=null){
				System.out.print(y.key+" ");
				y=y.next;
			}
			System.out.println(y.key);
		}else{
			System.out.println("Linked List is empty");
		}
	}	
}
