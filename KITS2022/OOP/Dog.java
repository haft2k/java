package OOP;


class Dog extends Animals {
	void eat() {
		System.out.println("Dog is eating......");
	}
	
}

class Dog2 extends Animals {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d instanceof Animals);
	}
}

class Dog3 extends Animals {

static void method(Animals a) {
	if (a instanceof Dog3) {
		Dog3 d3 = new Dog3();
		System.out.println("ok downcasting performed");
	}
}
	
}