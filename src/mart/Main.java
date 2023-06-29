package mart;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	inventory inven = new inventoryImpl();
	int num;
	
	/*
	 	1.사과 2.포도 3.복숭아
	*/
	
	while(true) {
		System.out.println("1. 관리자");
		System.out.println("2. 소비자");
		System.out.println("3. 캐셔");
		System.out.println("4. 나가기");
		num = input.nextInt();
		
		switch(num) {
		
		case 1:
			inven.display();
			break;
		case 2: break;
		case 3: break;
		case 4: break;
		
	}
}
}
}
