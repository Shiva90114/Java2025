import java.util.*;
class StringDemo{
                 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Name,Company,Location");
		 String info= sc.nextLine();
		System.out.println(info); 
		 StringTokenizer st = new StringTokenizer(info," ");
		 while(st.hasMoreTokens()){
		 System.out.println(st.nextToken());
		 }
		 
		 }

}
