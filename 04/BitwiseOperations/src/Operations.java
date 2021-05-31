
public class Operations {
	/**
	 * 
	 * @param number - given number
	 * @param nBit   - given sequential number of bit from 0
	 * @return value of nBit in the given number (see tests)
	 */
	public static int getBit(int number, int nBit) {
		int bitValue = 0;
		// here your code goes
		// bitValue = (number&(1<<nBit))>>nBit;
		bitValue = (number & (1 << nBit)) > 0 ? 1 : 0;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;
		;

		return bitValue;
	}

	/**
	 * 
	 * @param number - given number
	 * @param nBit
	 * @return new number (as a particular case it may be the same number) with
	 *         value of the given bit - 1 (see tests)
	 */
	public static int setBit(int number, int nBit) {
		int numberRes = number;
		// here your code goes
		numberRes = number | (1 << nBit);
		return numberRes;
	}

	/**
	 * 
	 * @param number - given number
	 * @param nBit
	 * @return new number (as a particular case it may be the same number) with
	 *         value of the given bit - 0 (see tests)
	 */
	public static int resetBit(int number, int nBit) {
		int numberRes = number & ~(1 << nBit);
		// here your code goes

		return numberRes;
	}

	public static Integer getNumberSetBitsTest(int a) {
		// TODO Auto-generated method stub
		int count = 0;

		for (int i = 0; i < 32; i++) {
//			if (getBit(a, i) == 1) {
//				count++;
//			}
			if (((1 << i) & a) != 0) {
				count++;
			}
		}

		return count;
	}

	public static long getMaxLong() {
		// TODO Auto-generated method stub
		var max = 1L;
		while (max > 0) {
			max <<= 1;
		}

		return max - 1;
	}

	public static int log2(long number) {
		// TODO Auto-generated method stub
		int cnt=0;
		while(number!=0) {
			number>>=1;
			cnt++;
		}
		return cnt-1;
	}

}
