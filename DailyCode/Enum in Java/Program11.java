class Parent {
    @Deprecated
    void m1() {
        System.out.println("Parent M1");
    }
}


class Client {
        @SuppressWarnings({"deprecation", "unchecked"})
	public static void main(String[] args) {
        Parent p = new Parent();

	p.m1();
   
    }
}

