// Code - 1
// Jagged Array

class JaggedArray {

	public static void main(String[] args) {
	
		//int arr[][] = new int[][]; // Define

		int arr[][] = new int[3][2];
		
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		//arr[3]=new int[3]; // error //.ArrayIndexOutOfBoundsException

		for(int i =0;i<arr[i].length;i++) {
		
			for(int j=0;j<arr[j].length;j++){
			
				System.out.println(arr[i][j]);
			}
		}
	}
}
