package edu.grinnell.sortingvisualizer.sortevents;

import java.util.ArrayList;
import java.util.List;

public class SwapEvent<T> implements SortEvent<T> {
	private int ind1;
	private int ind2;
	
	public SwapEvent(int ind1, int ind2) {
		this.ind1 = ind1;
		this.ind2 = ind2;
	}

	@Override
	public void apply(T[] arr) {
		T temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}

	@Override
	public List<Integer> getAffectedIndices() {
		List<Integer> indices = new ArrayList<>();
		indices.add(ind1);
		indices.add(ind2);
		return indices;
	}

	@Override
	public boolean isEmphasized() {
		return true;
	}
	
	@Override
	public String toString() {
		return "SwapEvent{ind1=" + ind1 + ", ind2=" + ind2 + "}";
	}

}
