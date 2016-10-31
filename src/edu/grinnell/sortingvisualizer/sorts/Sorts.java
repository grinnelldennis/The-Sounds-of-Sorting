package edu.grinnell.sortingvisualizer.sorts;

import java.util.ArrayList;
import java.util.List;

import edu.grinnell.sortingvisualizer.sortevents.CompareEvent;
import edu.grinnell.sortingvisualizer.sortevents.CopyEvent;
import edu.grinnell.sortingvisualizer.sortevents.SortEvent;
import edu.grinnell.sortingvisualizer.sortevents.SwapEvent;

public class Sorts {
	public static <T extends Comparable<T>> List<SortEvent<T>> selectionSort(T[] arr) {
		List<SortEvent<T>> evts = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			T min = arr[i];
			int minInd = i;
			
			// find min
			for(int j = i + 1; j < arr.length; j++) {
				evts.add(new CompareEvent<T>(i, j));
				if(min.compareTo(arr[j]) > 0) {
					minInd = j;
					min = arr[minInd];
				}
			}
			
			// swap
			SwapEvent<T> swap = new SwapEvent<>(minInd, i);
			swap.apply(arr);
			evts.add(swap);
		}
		
		return evts;
	}

	public static <T extends Comparable<T>> List<SortEvent<T>> insertionSort(T[] arr) {
		List<SortEvent<T>> evts = new ArrayList<>();
		
		for(int i = 1; i < arr.length; i++) {
			evts.add(new CompareEvent<T>(i, i - 1));
			if(arr[i].compareTo(arr[i - 1]) < 0) {
				// walk down to find correct position
				int ind; // first element smaller than arr[i]
				for(ind = i - 1; ind >= 0; ind--) {
					evts.add(new CompareEvent<T>(ind, i));
					if(arr[ind].compareTo(arr[i]) < 0) {
						break;
					}
				}
				
				// shift
				T temp = arr[i];
				for(int j = i; j > ind + 1; j--) {
					CopyEvent<T> cpy = new CopyEvent<>(j, arr[j - 1]);
					cpy.apply(arr);
					evts.add(cpy);
				}
				CopyEvent<T> cpy = new CopyEvent<>(ind + 1, temp);
				cpy.apply(arr);
				evts.add(cpy);
			}
		}
		
		return evts;
	}

	public static <T extends Comparable<T>> List<SortEvent<T>> bubbleSort(T[] arr) {
		List<SortEvent<T>> evts = new ArrayList<>();
		
		for(int i = arr.length - 1; i > 0; i--) {
			for(int j = 0 ; j < i; j++) {
				evts.add(new CompareEvent<T>(j, j + 1));
				if(arr[j].compareTo(arr[j + 1]) > 0) {
					SwapEvent<T> swap = new SwapEvent<>(j, j + 1);
					swap.apply(arr);
					evts.add(swap);
				}
			}
		}
		
		return evts;
	}

	public static <T extends Comparable<T>> List<SortEvent<T>> mergeSort(T[] arr) {
		List<SortEvent<T>> evts = new ArrayList<>();
		mergeSort(arr, evts);
		return evts;
	}
	
	public static <T extends Comparable<T>> void mergeSort(T[] x, List<SortEvent<T>> evts) {
		mergeSort(x, 0, x.length-1, evts);
	}

	private static <T extends Comparable<T>> void mergeSort(T[] x, int first, int last,
			List<SortEvent<T>> evts) {
		int mid, lt, rt;

		if(first >= last) return;

		mid = (first + last) / 2;

		mergeSort(x, first, mid, evts);
		mergeSort(x, mid + 1, last, evts);

		lt = first;
		rt = mid + 1;
		evts.add(new CompareEvent<T>(mid, rt));
		if(x[mid].compareTo(x[rt]) <= 0) {
			return;
		}

		while(lt <= mid && rt <= last) {
			evts.add(new CompareEvent<T>(lt, rt));
			if(x[lt].compareTo(x[rt]) <= 0) {
				lt++;
			}
			else {
				T tmp = x[rt];

				for(int i = rt; i > lt; i--) {
					CopyEvent<T> cpy = new CopyEvent<>(i, x[i - 1]);
					cpy.apply(x);
					evts.add(cpy);
				}
				CopyEvent<T> cpy = new CopyEvent<>(lt, tmp);
				cpy.apply(x);
				evts.add(cpy);
				lt++;  mid++;  rt++;
			}
		}
	}


	public static <T extends Comparable<T>> List<SortEvent<T>> quickSort(T[] arr) {
		List<SortEvent<T>> evts = new ArrayList<>();
		if(arr.length != 0) {
			quickSort(arr, 0, arr.length - 1, evts);
		}
		return evts;
	}
 
    private static <T extends Comparable<T>> void quickSort(T[] arr, int lowerIndex, int higherIndex, List<SortEvent<T>> evts) {
        int i = lowerIndex;
        int j = higherIndex;
        
        int pivotInd = lowerIndex+(higherIndex-lowerIndex)/2;
        T pivot = arr[pivotInd];
        
        while (i <= j) {
            while (arr[i].compareTo(pivot) < 0) {
            	evts.add(new CompareEvent<T>(i, pivotInd));
                i++;
            }
            evts.add(new CompareEvent<T>(i, pivotInd));
            
            while (arr[j].compareTo(pivot) > 0) {
            	evts.add(new CompareEvent<T>(j, pivotInd));
                j--;
            }
            evts.add(new CompareEvent<T>(j, pivotInd));
            
            if (i <= j) {
            	SwapEvent<T> swap = new SwapEvent<>(i++, j--);
            	swap.apply(arr);
            	evts.add(swap);
            }
        }
        
        if (lowerIndex < j)
            quickSort(arr, lowerIndex, j, evts);
        if (i < higherIndex)
            quickSort(arr, i, higherIndex, evts);
    }
    
	public static <T> void eventSort(T[] arr, List<SortEvent<T>> events) {
		for(SortEvent<T> evt : events) {
			evt.apply(arr);
		}
	}
}
