package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mattori Birnbaum & Dennis Chan
 *	Logs whenever an algorithm swaps elements of the array
 *	Implements generic interface SortEvent
 */
public class SwapEvent<T> implements SortEvent<T> {
	private int ind1;
	private int ind2;
	
	/**
	* 	Constructor for generic CompareEvent class
	* @param ind1,	an integer
	* @param ind2,	an integer 	
	*/
	public SwapEvent(int ind1, int ind2) {
		this.ind1 = ind1;
		this.ind2 = ind2;
	}

	@Override
	/**
	*	Applies this sort event to the given array by swapping elements 
	* @param arr,	a generic type array
	*/
	public void apply(T[] arr) {
		T temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}

	@Override
	/**
	*	Returns a list containing all of the array indices that this event affects.
	* @return	a list of integers
	*/
	public List<Integer> getAffectedIndices() {
		List<Integer> indices = new ArrayList<>();
		indices.add(ind1);
		indices.add(ind2);
		return indices;
	}

	@Override
	/**
	*	Return true if this event should be emphasized by the visualizer/audibilizer.
	* @return	false
	*/
	public boolean isEmphasized() {
		return true;
	}
	
	@Override
	/**
	*	Getter method returning a string of the comparison's fields.
	* @return	A string
	*/
	public String toString() {
		return "SwapEvent{ind1=" + ind1 + ", ind2=" + ind2 + "}";
	}

}
