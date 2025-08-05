class Demo extends Exception {
    Demo(String str) {
        super(str);
    }
}

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
    void m1() throws Demo {
        System.out.println("Parent M1");
        throw new Demo("Exception thrown");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
    void m1() {
        System.out.println("Child M1");
     }
}

class Client {
    public static void main(String[] args) {
        Parent p = new Parent();
        try {
            p.m1();
        } catch (Demo e) {
            System.out.println(e);
        }
    }
}

