import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int num = sc.nextInt();
        int totalNum = num*2- 1;
         for (int i = 1; i <= totalNum; i++) {
		 int rowNum;
		 if(i<= num){
		    rowNum = num-i +1;
		 }else{
		 rowNum = i-num+1;
		 }
		 int spaces = Math.abs(num -i)*2;
		 int numbers =2*(num -Math.abs(num-i)) -1;

		 for(int s=1;s<=spaces;s++){
		 
			 System.out.print(" ");
		 }
		 for(int j=1;j<=numbers;j++){
		 
			 System.out.print(rowNum);
			 if(j < numbers){
			 
				 System.out.print(" ");
			 }
		 
            

      
       }
            System.out.println();
        }        sc.close();
    }
}


