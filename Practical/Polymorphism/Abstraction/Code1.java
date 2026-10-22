// Code - 1
// Abstration
//
abstract class Vehicle {

	abstract void start();	

	void stop() {
	
	
	System.out.println("Vehicle Stopped");
}}
class Car extends Vehicle {

        void start(){

                System.out.println("car starts with Key");
        };
        void stop() {

        
        System.out.println("Vehicle Stopped");
	}
}
class Main {

        public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
        v.stop();

        }
}
