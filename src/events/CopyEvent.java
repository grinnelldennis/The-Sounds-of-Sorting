package events;

import java.util.ArrayList;
import java.util.List;

public class CopyEvent<T> implements SortEvent<T> {
	public int ind;
	public T val;
	
	public CopyEvent(int ind, T val) {
		this.ind = ind;
		this.val = val;
	}
	
	@Override
	public void apply(T[] arr) {
		arr[ind] = val;
	}

	@Override
	public List<Integer> getAffectedIndices() {
		List<Integer> index = new ArrayList<>();
		index.add(ind);
		return index;
	}

	@Override
	public boolean isEmphasized() {
		return true;
	}
	
	@Override
	public String toString() {
		return "CopyEvent{ind=" + ind + ", val=" + val + "}";
	}

}
