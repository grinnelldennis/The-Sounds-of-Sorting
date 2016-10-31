package edu.grinnell.sortingvisualizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A collection of indices into a Scale object.
 * These indices are the subject of the various sorting algorithms
 * in the program.
 */
public class NoteIndices {
	private Integer[] notes;
	private boolean[] isHighlighted;

    /**
     * @param n the size of the scale object that these indices map into
     */
    public NoteIndices(int n) {
    	initializeAndShuffle(n);
    }
    
    /**
     * Reinitializes this collection of indices to map into a new scale object
     * of the given size.  The collection is also shuffled to provide an
     * initial starting point for the sorting process.
     * @param n the size of the scale object that these indices map into
     */
    public void initializeAndShuffle(int n) {
    	List<Integer> lst = new ArrayList<>(n);
    	for(int i = 0; i < n; i++) {
    		lst.add(i);
    	}
        Collections.shuffle(lst);
        notes = (Integer[]) lst.toArray(new Integer[lst.size()]);
        
        isHighlighted = new boolean[n];
    }
    
    /** @return the indices of this NoteIndices object */
    public Integer[] getNotes() { 
        return notes;
    }
    
    /**
     * Highlights the given index of the note array
     * @param index the index to highlight
     */
    public void highlightNote(int index) {
    	isHighlighted[index] = true;
    }
    
    /** @return true if the given index is highlighted */
    public boolean isHighlighted(int index) {
    	return isHighlighted[index];
    }
    
    /** Clears all highlighted indices from this collection */
    public void clearAllHighlighted() {
        isHighlighted = new boolean[isHighlighted.length];
    }
}
