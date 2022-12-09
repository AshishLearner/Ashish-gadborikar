package multyarray;

public class multyarray1 {
	public static void main(String[] args) {
		// declairing and initializing 2d array
		int[][] arr = new int[3][3];// 3row and 3column
		System.out.println("array row size " + arr.length);
		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr[i].length; j++) {// cell count of current row
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("******");
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		// prining 2d array
		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr[i].length; j++) {// cell count of current row
				System.out.println(arr[i][j] + " ");// ouput matrix form mai nahi ayega q ki println se ln nikalnapadega
			}
			System.out.println();
		}

	}

}
