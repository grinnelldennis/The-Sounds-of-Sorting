package edu.grinnell.sortingvisualizer.sortevents;

import java.util.List;

/**
 * @author Mattori Birnbaum & Dennis Chan
 *	SortEvent Interface, 
 *	Creates generic sortevent class 
 */
public interface SortEvent<T> {
	/**
	* void apply(arr): applies this sort event to the given array.
	*/
	void apply(T[] arr);
	
	/**
	* List<Integer> getAffectedIndices(): returns a list containing all of the array 
	*  indices that this event affects.
	*/
	List<Integer> getAffectedIndices();
	
	/**
	* return true if this event should be emphasized by the visualizer/audibilizer.
	*/
	boolean isEmphasized();
}
