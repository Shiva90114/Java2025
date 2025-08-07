import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int num = sc.nextInt();
        int totalNum = num*2- 1;
         for (int i = 1; i <= totalNum; i++) {
		 int rowMax;
		 if(i<= num){
		    rowMax=i;
		 }else{
		 rowMax = totalNum -i+1;
		 }
		 int spaces = Math.abs(num -i)*2;
		 

	 for(int s=1;s<=spaces;s++){
		 
			 System.out.print(" ");
		 }
         for(int j=1;j<rowMax;j++){
		        System.out.print(j+" ");
		 }
	 for(int j = rowMax;j>=1;j--){
			 System.out.print(j);
			 if(j>1){
			 System.out.print(" ");		 
			 }                }
            System.out.println();
        }        sc.close();
    }
}
