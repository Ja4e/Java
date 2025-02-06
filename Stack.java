public class Stack{
	Node top;
	
	public boolean isEmpty(){
		if (top == null){
			return true;
		}
		else{
			return false;
		}
		//return top == null;
	}
	public void push(int d){
		Node newNode = new Node(); // Creating the new node to
		newNode.data = d; // add to the stack
		if ( isEmpty() ){
			top = newNode;
		}
		else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public void main(String[] args){
		Node temp = top;
		while( temp != null ){
			System.out.println( temp.data );
			temp = temp.next;
		}
		System.out.println();	
	}
}
