package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mattori Birnbaum & Dennis Chan
 *	Logs whenever an algorithm copies an element into an index of the array, 
 *	Implements generic interface SortEvent
 */
public class CopyEvent<T> implements SortEvent<T> {
	public int ind;
	public T val;
	
	/**
	* 	Constructor for generic CopyEvent class
	* @param ind1,	an integer
	* @param ind2,	an integer 	
	*/
	public CopyEvent(int ind, T val) {
		this.ind = ind;
		this.val = val;
	}
	
	@Override
	/**
	*	Applies this sort event to the given array.
	* @param arr,	a generic type array
	*/
	public void apply(T[] arr) {
		arr[ind] = val;
	}

	@Override
	/**
	*	Returns a list containing all of the array indices that this event affects.
	* @return	a list of integers
	*/
	public List<Integer> getAffectedIndices() {
		List<Integer> index = new ArrayList<>();
		index.add(ind);
		return index;
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
		return "CopyEvent{ind=" + ind + ", val=" + val + "}";
	}

}
