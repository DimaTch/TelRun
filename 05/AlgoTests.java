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
		
		assertEquals(false, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)3) );
		assertEquals(false, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)18) );
		assertEquals(false, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)53) );
		assertEquals(false, Algo.isSum(new short[] {50,10,5,15,20,40,0,50},(short)22) );

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
		
		
		short arr5[] = new short[] {250, 10, 5, 15, 20, 40, 0, 50};
		short arr6[] = new short[] {40, 310, 5, 15, 20, 450, 10, 50};
		short arr7[] = new short[] {5, 10, 50, 615, 220, 240, 0, 50};
		short arr8[] = new short[] {50, 10, 35, 110, 20, 640, 15, 50};
		short arr9[] = new short[] {50, 610, 540, 15, 20, 85, 0, 50};
		
		assertEquals(false, Arrays.equals(arrSort, arr5));
		assertEquals(false, Arrays.equals(arrSort, arr6));
		assertEquals(false, Arrays.equals(arrSort, arr7));
		assertEquals(false, Arrays.equals(arrSort, arr8));
		assertEquals(false, Arrays.equals(arrSort, arr9));


	}

}
