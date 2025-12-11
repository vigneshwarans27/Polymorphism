package Polymorphism;

	class animal{
		void sound() {
			System.out.println("animal makw a sound");
		}
	}
	
	class dog extends animal{
		void sound() {
			System.out.println("dog barks");
		}
	}

public class Method_overriding {

	public static void main(String[] args) {
		animal a = new dog();
		
		a.sound();
	}

}
