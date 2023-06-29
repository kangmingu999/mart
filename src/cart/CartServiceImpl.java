package cart;


import java.util.Scanner;

import mart.DTO;

public class CartServiceImpl implements CartService{
	DTO dto = new DTO();
	public Scanner input = new Scanner(System.in);
	public int num, num2;
	String name;
	public void addApple(DTO dto) {
		System.out.print("사과 갯수 : ");
		dto.setNa(input.nextInt());
	}

	public void addGrape(DTO dto) {
		System.out.print("포도 갯수 : ");
		dto.setNb(input.nextInt());
	}

	public void addPeach(DTO dto) {
		System.out.print("복숭아 갯수 : ");
		dto.setNc(input.nextInt());
	}
	
	public void showObject(DTO dto) {
		System.out.println("사과 갯수 : "+dto.getNa());
		System.out.println("포도 갯수 : "+dto.getNb());
		System.out.println("복숭아 갯수 : "+dto.getNc());
	}
	
	
	public void Cart(DTO dto) {
		System.out.print("현금 : ");
		dto.setCash(input.nextInt());
		while(true) {
			System.out.println("1. 사과");
			System.out.println("2. 포도");
			System.out.println("3. 복숭아");
			System.out.println("4. 결제 상품 목록 보기");
			System.out.println("5. main으로 돌아가기");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {
			case 1 :
				addApple(dto);
				break;
			case 2 : 
				addGrape(dto);
				break;
			case 3 : 
				addPeach(dto);
				break;
			case 4 : 
				showObject(dto);
				break;
			case 5 : return;
			}
		}
		
	}

}
