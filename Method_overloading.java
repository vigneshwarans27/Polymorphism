package Polymorphism;

	class mathoperation{
		int add(int a,int b) {
			return a+b;
		}
		
		double add(double a,double b) {
			return a+b;
		}
	}

public class Method_overloading {

	public static void main(String[] args) {
		mathoperation m = new mathoperation();
		
		System.out.println(m.add(5,3));
		System.out.println(m.add(2.5,3.5));
	}

}
