// Array
// Code - 1
// Define Array
class ArrayDemo {

	public static void main(String[] args){
	
		int arr[] ={10,20,30};
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		float fArr[] ={10.5f,20.2f,30.7f,40.6f};
                for(int i =0;i<fArr.length;i++){
                        System.out.print(fArr[i]+" ");
                }
                System.out.println();

		char cArr[] ={'A','B','C','D','E'};
                for(int i =0;i<cArr.length;i++){
                        System.out.print(cArr[i]+" ");
                }
                System.out.println();

		String sArr[] ={"Shiva","Ram","Prasad","Raju"};
                for(int i =0;i<sArr.length;i++){
                        System.out.print(sArr[i]+" ");
                }
                System.out.println();
	}
}
