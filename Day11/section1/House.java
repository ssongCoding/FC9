package section1;

import section2.Coffee; // = 이 클래스가 public이라는 얘기

public class House {
	public static void main(String[] args) {
		Machine wash = new Machine("세탁기", 300);
		Machine dry = new Machine("건조기", 500);
		
		Coffee americano = new Coffee("마끼아또", "핫");
		
		wash.powerOn();
		dry.powerOn();
		wash.powerOn();
		dry.powerOn();
	}
}
