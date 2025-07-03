import java.util.Scanner;

class Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        scanner.close();

        generatePattern(numRows);
    }

    public static void generatePattern(int numRows) {
        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0) { 
                char firstChar = (char) ('A' + numRows - 1);
                System.out.print(firstChar);

       
                if (numRows > 1) {
                    for (int j = 1; j <= numRows - 1; j++) {
                        if (j % 2 != 0) { 
                            System.out.print(numRows - j); 
                        } else { 
                            System.out.print((char) ('A' + numRows - (j + 1)));
                        }
                    }
                }
                System.out.println();

            } else { 
                System.out.print('A');

               
                if (numRows > 1) { 
                    for (int j = 2; j <= numRows; j++) { 
                    if (j % 2 == 0) { 
                            System.out.print(j);
                    } else { 
                            System.out.print((char) ('A' + (j - 1)));
                             
		    }
                    }
                }
                System.out.println();
            }
        }
    }
}
