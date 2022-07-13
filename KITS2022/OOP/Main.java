package OOP;


public class Main {

	public static void main(String[] args) {
		Animals a1, a2, a3;
		a1 = new Animals();
		a2 = new Dog();
		a3 = new BabyDog();

		a1.eat();
		a2.eat();
		a3.eat();

		Dog d = new Dog();
		System.out.println(d instanceof Animals);
		
		Dog3 d3 = new Dog3();
		d3.method(d3);
	}
}
