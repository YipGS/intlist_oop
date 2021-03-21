package intlist_oop2021;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

import intlist_oop.Node;
//immutable first
//1.make it immutable to start with, define the getters
//implement after building a test, first create an invariant elements to store the list ---> getElements delete runtimeException, return elements.clone(), have to 
//create a copy, which is the clone. --> implement constructor, 
/**
 * 
 * Each instance of this class represents a sequence of int values.
 * 
 * 
 * @invar |getElements() != null
 * @immutable
 *
 */
public class intList {
	
	private static class Node {
		private int value;
		/**
		 * @peerobject
		 */
		private Node next;
		
		
		private static boolean hasLength(Node node, int length) {
			if(length==0)
				return node ==null;
			else 
				return length>0 && node!= null && hasLength(node.next, length-1);
			
			//return length == 0?node == null: length >0 &&node != null &&hasLength(node.next,length -1);	
}
	}
	/**
	 * @invar | Node.hasLength(head,length)
	 */
	private int length; 
	private Node head; //first node is head 
	/**
	 * @invar |elements != null 
	 * 
	 * @representationObject 
	 */
	//representation is any object used by the class to help represent the abstract state of an instance of a class 
	
	//private int[] elements;
	/** 
	 * Returns an array containgthe  elements of this object
	 * 
	 * @creates | result
	 * 
	 */
	public int[] getElements() {
		int[] result =new int [length];
		Node node = head;
		int i=0;
		while (node!= null) {
			result[i++]=node.value;
			node=node.next;
		}
		return result;
	}
	
	private static Node createNodes(int[] elements, int index) {
		if(index==elements.length)
			return null;
		else {
			Node head = new Node();
			head.value=elements[index];
			head.next=createNodes(elements, index+1);
			return head;
		}
	}
	//if don't return a copy there will be a problem
	
	/**
	 * Initializes this object so that it represents the sequence of int values contained in the given array
	 * @pre |elements !=null
	 * 
	 * @post | Arrays.equals(getElements(),elements)
	 */
	public intList(int[] elements) {
		this.head=createNodes(elements,0);
		this.length=elements.length;
	}
}
