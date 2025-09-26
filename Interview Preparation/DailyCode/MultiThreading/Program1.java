import java.io.*;

interface Inter1 {
    void print();
}
interface Inter2 {
    void show();
}

class Demo implements Inter1, Inter2 {
      public void print() {
        System.out.println("In 1st Interface");
        }

    public void show() {
        System.out.println("In 2nd Interface");
        }

    public void readInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.close(); 
            br.readLine();
        } catch (IOException io) {
            System.out.println("In IOException");
            }
        }
}

class Main {
    public static void main(String[] args) {
      Demo obj = new Demo();

        obj.print();     
        obj.show();        
        obj.readInput();  
        }
}

