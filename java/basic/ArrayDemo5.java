public class ArrayDemo5 {
	public static void main(String[] args) {
		/*
		int[][] arr = new int[2][3];
		arr[0][0] = 20;
		arr[0][1] = 50;
		arr[0][2] = 60;
		arr[1][0] = 100;
		arr[1][1] = 90;
		arr[1][2] = 80;
		*/

		int [][] arr = {{20, 50, 60},{100, 90, 80}};

		
		for (int x=0; x<2; x++) {
			for (int y=0; y<3; y++) {
				System.out.println(arr[x][y]);
		
			}
		}
	}
}