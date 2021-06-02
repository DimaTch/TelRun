package algo;

public class Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static boolean isSum (short arr[], short sum){
		sortSelect(arr);
		
		int left=0, right=arr.length-1;		
		while(left!=right) {
			int lr = arr[left] + arr[right];
			if(lr>sum)		right--; 
			if(lr<sum)		left++;
			if(lr==sum) 	return true;
		}
	return false;
	}
	
	static void sortSelect(short arr[]){
		for(int i = 0; i < arr.length-1; i++) {
			int min=i;
			for(int y = i+1; y < arr.length; y++) {
				if(arr[y]<arr[min]) min=y;
			}
			short a = arr[min];
			arr[min] = arr[i];
			arr[i] = a;
		}
	}

	
	static void showPrint(short arr[]) {
		System.out.println(" ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
