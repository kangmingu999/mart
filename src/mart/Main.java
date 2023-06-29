package mart;

import java.util.Scanner;

import cash.Casher;
import cash.CasherImpl;
import cart.CartServiceImpl;

public class Main {
public static void main(String[] args) {
	
	DTO dto = new DTO();
	
	Casher ca = new CasherImpl();
	inventory inven = new inventoryImpl();
	CartServiceImpl cart = new CartServiceImpl();

	Scanner input = new Scanner(System.in);
	int num;
	
	while(true) {
		System.out.println("1. 관리자");
		System.out.println("2. 소비자");
		System.out.println("3. 캐셔");
		System.out.println("4. 나가기");
		num = input.nextInt();
		
		switch(num) {
		
		case 1:
			inven.display(dto);
			break;
		case 2: 
			cart.Cart(dto);
			break;
		case 3: 
			ca.menu(dto);
			break;
		case 4: 
			return;
		
	}
}
}
}
