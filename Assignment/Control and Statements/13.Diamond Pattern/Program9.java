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
	 int spaces =(num -rowMax)*2;
		 

	 for(int s=0;s<=spaces;s++){
		 
			 System.out.print(" ");
		 }
          if (rowMax < num) {
                for (int j = num - rowMax + 1; j < num; j++) {
                    System.out.print(j + " ");
                }
                System.out.print(num);
           for (int j = num - 1; j >= num - rowMax + 1; j--) {
                    System.out.print(" " + j);
                }
            } else { 
           for (int j = 1; j < num; j++) {
                    System.out.print(j + " ");
                }
                System.out.print(num);
          for (int j = num - 1; j >= 1; j--) {
                    System.out.print(" " + j);
                }         

	 }
            System.out.println();
        }        sc.close();
    }
}
