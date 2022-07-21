package example;

public class Day05_EX7 {

	public static void main(String[] args) {
		
		int num = 3;
		
		while(true) { // 네
			System.out.println("hi");
			
			if(num == 5) {
				break; // switch, while 
			}			
			num++;
		}
		
		System.out.println("break 걸려서 나옴");
	}

}
