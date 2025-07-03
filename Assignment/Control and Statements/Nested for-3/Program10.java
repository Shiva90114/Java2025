import java.util.*;

class Decrease {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of rows - ");
        int num = scanner.nextInt();

        int currentNumber = (num * num) + num;
        
        if (num == 1) {
            currentNumber = 2; 
        }


      
        for (int i = 0; i < num; i++) { 
            for (int j = 0; j < num; j++) { 
                System.out.print(currentNumber + " ");
                currentNumber--; 
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
