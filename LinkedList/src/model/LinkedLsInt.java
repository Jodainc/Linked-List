package model;
import struct.Node;
public class LinkedLsInt {
	protected Node nodeInitial, nodeFinal;
	protected int data;
	public LinkedLsInt(){
		nodeInitial = null;
		nodeFinal = null;
	}
	// add Initial element
	public void addInitial(int dataIni){
		nodeInitial = new Node(dataIni,nodeInitial);
		if(nodeFinal==null){
			nodeFinal=nodeInitial;
		}
	}
	
	//add sequence 
	 public void addlast (int data){
		 if(!empty()){
			 nodeFinal.pointer = new Node(data);
			 nodeFinal = nodeFinal.pointer;			 
		 }else{
			 nodeInitial=nodeFinal = new Node(data);
		 }
		 
	 }
	 //empty list true|| false
	 private boolean empty() {
		
		 if (nodeInitial==null) {
			return true;
		}else{
		return false;
	}
	 }
	// view all data
	 public void viewListed(){
			Node sequence = nodeInitial;
			 System.out.println("");
			 while(sequence != null){
				 System.out.print("["+sequence.data+"]"+"->");
				 sequence = sequence.pointer;	 
			 }
		 
	 }

}
