class Outer {
              int x = 10;
              static int y = 20;
           	class Inner {
	        int x = 30;
		final static int y = 40;
                
		void disp() {
		System.out.println(Outer.this.x);
		System.out.println(Outer.this.y);
	
		System.out.println(y);
		System.out.println(x);
		
		}
	}
}
