package intlist_oop2021;

import java.util.Arrays;

import javax.management.RuntimeErrorException;
//immutable first
//1.make it immutable to start with, define the getters
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
	/** 
	 * Returns an array containgthe  elements of this object
	 * 
	 * @creates | result
	 * 
	 */
	public int[] getElements() {throw new RuntimeException("Not yet");}
	
	/**
	 * Initializes this object so that it represents the sequence of int values contained in the given array
	 * @pre |elements !=null
	 * 
	 * @post | Arrays.equals(getElements(),elements)
	 */
	public intList(int[] elements) {
		throw new RuntimeException("Not yet");
	}
}
