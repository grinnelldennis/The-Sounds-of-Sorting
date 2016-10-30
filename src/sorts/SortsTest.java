package sorts;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import events.SortEvent;

public class SortsTest {

	private static final Integer[] PRESORTED = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final Integer[] PRESORTED_R = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	private static final Integer[] REVERSED = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	private static final Integer[] REVERSED_R = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	private static final Integer[] REPEAT = {1, 2, 3, 1, 2, 3};
	private static final Integer[] REPEAT_R = {1, 1, 2, 2, 3, 3};
	
	private static final Integer[] PRAND = {2, 8, 1, 5, 3};
	private static final Integer[] PRAND_R = {1, 2, 3, 5, 8};
	
	private static final Integer[] SINGLE = {1};
	private static final Integer[] SINGLE_R = {1};
	
	private static final Integer[] EMPTY = {};
	private static final Integer[] EMPTY_R = {};
	
	@Test
	public <T extends Comparable<T>> void selectionPresortedTest() {
		List<SortEvent<Integer>> evts = Sorts.selectionSort(Arrays.copyOf(PRESORTED,
				PRESORTED.length));
		Integer[] res = Arrays.copyOf(PRESORTED, PRESORTED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRESORTED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void selectionReversedTest() {
		List<SortEvent<Integer>> evts = Sorts.selectionSort(Arrays.copyOf(REVERSED,
				REVERSED.length));
		Integer[] res = Arrays.copyOf(REVERSED, REVERSED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REVERSED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void selectionRepeatTest() {
		List<SortEvent<Integer>> evts = Sorts.selectionSort(Arrays.copyOf(REPEAT, REPEAT.length));
		Integer[] res = Arrays.copyOf(REPEAT, REPEAT.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REPEAT_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void selectionPrandTest() {
		List<SortEvent<Integer>> evts = Sorts.selectionSort(Arrays.copyOf(PRAND, PRAND.length));
		Integer[] res = Arrays.copyOf(PRAND, PRAND.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRAND_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void selectionSingleTest() {
		List<SortEvent<Integer>> evts = Sorts.selectionSort(Arrays.copyOf(SINGLE, SINGLE.length));
		Integer[] res = Arrays.copyOf(SINGLE, SINGLE.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(SINGLE_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void selectionEmptyTest() {
		List<SortEvent<Integer>> evts = Sorts.selectionSort(Arrays.copyOf(EMPTY, EMPTY.length));
		Integer[] res = Arrays.copyOf(EMPTY, EMPTY.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(EMPTY_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void insertionPresortedTest() {
		List<SortEvent<Integer>> evts = Sorts.insertionSort(Arrays.copyOf(PRESORTED,
				PRESORTED.length));
		Integer[] res = Arrays.copyOf(PRESORTED, PRESORTED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRESORTED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void insertionReversedTest() {
		List<SortEvent<Integer>> evts = Sorts.insertionSort(Arrays.copyOf(REVERSED,
				REVERSED.length));
		Integer[] res = Arrays.copyOf(REVERSED, REVERSED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REVERSED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void insertionRepeatTest() {
		List<SortEvent<Integer>> evts = Sorts.insertionSort(Arrays.copyOf(REPEAT, REPEAT.length));
		Integer[] res = Arrays.copyOf(REPEAT, REPEAT.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REPEAT_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void insertionPrandTest() {
		List<SortEvent<Integer>> evts = Sorts.insertionSort(Arrays.copyOf(PRAND, PRAND.length));
		Integer[] res = Arrays.copyOf(PRAND, PRAND.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRAND_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void insertionSingleTest() {
		List<SortEvent<Integer>> evts = Sorts.insertionSort(Arrays.copyOf(SINGLE, SINGLE.length));
		Integer[] res = Arrays.copyOf(SINGLE, SINGLE.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(SINGLE_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void insertionEmptyTest() {
		List<SortEvent<Integer>> evts = Sorts.insertionSort(Arrays.copyOf(EMPTY, EMPTY.length));
		Integer[] res = Arrays.copyOf(EMPTY, EMPTY.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(EMPTY_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void bubblePresortedTest() {
		List<SortEvent<Integer>> evts = Sorts.bubbleSort(Arrays.copyOf(PRESORTED,
				PRESORTED.length));
		Integer[] res = Arrays.copyOf(PRESORTED, PRESORTED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRESORTED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void bubbleReversedTest() {
		List<SortEvent<Integer>> evts = Sorts.bubbleSort(Arrays.copyOf(REVERSED,
				REVERSED.length));
		Integer[] res = Arrays.copyOf(REVERSED, REVERSED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REVERSED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void bubbleRepeatTest() {
		List<SortEvent<Integer>> evts = Sorts.bubbleSort(Arrays.copyOf(REPEAT, REPEAT.length));
		Integer[] res = Arrays.copyOf(REPEAT, REPEAT.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REPEAT_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void bubblePrandTest() {
		List<SortEvent<Integer>> evts = Sorts.bubbleSort(Arrays.copyOf(PRAND, PRAND.length));
		Integer[] res = Arrays.copyOf(PRAND, PRAND.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRAND_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void bubbleSingleTest() {
		List<SortEvent<Integer>> evts = Sorts.bubbleSort(Arrays.copyOf(SINGLE, SINGLE.length));
		Integer[] res = Arrays.copyOf(SINGLE, SINGLE.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(SINGLE_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void bubbleEmptyTest() {
		List<SortEvent<Integer>> evts = Sorts.bubbleSort(Arrays.copyOf(EMPTY, EMPTY.length));
		Integer[] res = Arrays.copyOf(EMPTY, EMPTY.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(EMPTY_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void mergePresortedTest() {
		List<SortEvent<Integer>> evts = Sorts.mergeSort(Arrays.copyOf(PRESORTED,
				PRESORTED.length));
		Integer[] res = Arrays.copyOf(PRESORTED, PRESORTED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRESORTED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void mergeReversedTest() {
		List<SortEvent<Integer>> evts = Sorts.mergeSort(Arrays.copyOf(REVERSED,
				REVERSED.length));
		Integer[] res = Arrays.copyOf(REVERSED, REVERSED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REVERSED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void mergeRepeatTest() {
		List<SortEvent<Integer>> evts = Sorts.mergeSort(Arrays.copyOf(REPEAT, REPEAT.length));
		Integer[] res = Arrays.copyOf(REPEAT, REPEAT.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REPEAT_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void mergePrandTest() {
		List<SortEvent<Integer>> evts = Sorts.mergeSort(Arrays.copyOf(PRAND, PRAND.length));
		Integer[] res = Arrays.copyOf(PRAND, PRAND.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRAND_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void mergeSingleTest() {
		List<SortEvent<Integer>> evts = Sorts.mergeSort(Arrays.copyOf(SINGLE, SINGLE.length));
		Integer[] res = Arrays.copyOf(SINGLE, SINGLE.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(SINGLE_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void mergeEmptyTest() {
		List<SortEvent<Integer>> evts = Sorts.mergeSort(Arrays.copyOf(EMPTY, EMPTY.length));
		Integer[] res = Arrays.copyOf(EMPTY, EMPTY.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(EMPTY_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void quickPresortedTest() {
		List<SortEvent<Integer>> evts = Sorts.quickSort(Arrays.copyOf(PRESORTED,
				PRESORTED.length));
		Integer[] res = Arrays.copyOf(PRESORTED, PRESORTED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRESORTED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void quickReversedTest() {
		List<SortEvent<Integer>> evts = Sorts.quickSort(Arrays.copyOf(REVERSED,
				REVERSED.length));
		Integer[] res = Arrays.copyOf(REVERSED, REVERSED.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REVERSED_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void quickRepeatTest() {
		List<SortEvent<Integer>> evts = Sorts.quickSort(Arrays.copyOf(REPEAT, REPEAT.length));
		Integer[] res = Arrays.copyOf(REPEAT, REPEAT.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(REPEAT_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void quickPrandTest() {
		List<SortEvent<Integer>> evts = Sorts.quickSort(Arrays.copyOf(PRAND, PRAND.length));
		Integer[] res = Arrays.copyOf(PRAND, PRAND.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(PRAND_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void quickSingleTest() {
		List<SortEvent<Integer>> evts = Sorts.quickSort(Arrays.copyOf(SINGLE, SINGLE.length));
		Integer[] res = Arrays.copyOf(SINGLE, SINGLE.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(SINGLE_R, res);
	}
	
	@Test
	public <T extends Comparable<T>> void quickEmptyTest() {
		List<SortEvent<Integer>> evts = Sorts.quickSort(Arrays.copyOf(EMPTY, EMPTY.length));
		Integer[] res = Arrays.copyOf(EMPTY, EMPTY.length);
		
		Sorts.eventSort(res, evts);
		
		assertArrayEquals(EMPTY_R, res);
	}
}
