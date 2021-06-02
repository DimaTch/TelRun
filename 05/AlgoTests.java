package algo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class OperationTests {

	@Test
	void isSum() {
		assertEquals(true, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)50) );
		assertEquals(true, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)60) );
		assertEquals(true, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)15) );
		assertEquals(true, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)40) );
		assertEquals(true, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)100) );
	}

	@Test
	void sort() {
		short arrSort[] = new short[] {0,5,10,15,20,40,50,50};

		short  arr[] = new short[] {50, 10, 5, 15, 20, 40, 0, 50};
		short arr1[] = new short[] {40, 10, 5, 15, 20, 50, 0, 50};
		short arr2[] = new short[] {5, 10, 50, 15, 20, 40, 0, 50};
		short arr3[] = new short[] {50, 10, 5, 0, 20, 40, 15, 50};
		short arr4[] = new short[] {50, 10, 40, 15, 20, 5, 0, 50};


		Algo.sortSelect(arr);
		Algo.sortSelect(arr1);
		Algo.sortSelect(arr2);
		Algo.sortSelect(arr3);
		Algo.sortSelect(arr4);
		
		assertEquals(true, Arrays.equals(arrSort, arr));
		assertEquals(true, Arrays.equals(arrSort, arr1));
		assertEquals(true, Arrays.equals(arrSort, arr2));
		assertEquals(true, Arrays.equals(arrSort, arr3));
		assertEquals(true, Arrays.equals(arrSort, arr4));


	}

}
