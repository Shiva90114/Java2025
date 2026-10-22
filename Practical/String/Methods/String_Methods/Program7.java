// Code -7
// String
// Tokenizer

import java.util.*;
class StringDemo {

        public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String info = sc.nextLine();

                System.out.println(info);
		StringTokenizer st = new StringTokenizer(info," ");
		while(st.hasMoreTokens()) {
		
			System.out.println(st.nextToken());
		}
        }
}
