package com.wipro.abstractclasses;
abstract class Compartment {
		public abstract void notice();
	}
class FirstClass extends Compartment {

		@Override
		public void notice() {
			System.out.println("Notice: You're in FirstClass");
		}

	}
class Ladies extends Compartment {

		@Override
		public void notice() {
			System.out.println("Notice: You're in Ladies");
		}

	}
class General extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in General");
	}

}
class Luggage extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in Luggage");
	}

}
