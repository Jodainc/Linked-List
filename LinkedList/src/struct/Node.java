package struct;

public class Node {
	public int data;
	public Node pointer;
	 public Node(int data , Node pointer){
		 this.data = data;
		 this.pointer = pointer;
	 }
	 public Node(int data ){
		 this.data = data;
		 this.pointer = null;
	 }

}
