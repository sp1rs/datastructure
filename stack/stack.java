
public class stack{
	public node head;
	public node tail;
	
	public stack(){
		head=null;
		tail=null;	
	}

	public void  push(int x){
		node n;
		if(head==null){
			n=new node(x);
			head=n;
			tail=n;	
		}else{
			n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=new node(x);
			tail=n.next;
		}
	}
	
	public void pop(){
		node n=head;
		node y=head;
		if(n==null){
			System.out.println("Stack is empty");
		}else{
			while(n.next!=null){
				y=n;
				n=n.next;		
			}
			y.next=null;
			tail=y;
		}
	}

	public void  peek(){
		if(head==null){
			System.out.println("Stack is empty");
		}else{
			System.out.println("The top element is"+tail.key);
		}
	}

	public void print(){
		if(head==null){
			System.out.println("Stack is empty");
		}else{
			node n=head;
			while(n!=null){
				System.out.print(n.key+" ");
				n=n.next;
			}
		}
		System.out.println();
        }
}
