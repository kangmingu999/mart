package mart;

import java.util.Scanner;

public class inventoryImpl implements inventory{

	Scanner sc = new Scanner(System.in);
	
	DTO dto = new DTO();
	
	@Override
	public void display() {
		
		while (true) {
			System.out.println("\n== 물품 재고 관리 ==");
			System.out.println("1. 재고 수량 등록");
			System.out.println("2. 재고 확인");
			System.out.println("3. 제품 가격 설정");
			System.out.println("4. main 가기");
			int select = sc.nextInt();
			
			switch (select) {
				case 1 : 
					modInven();
					break;
				case 2 :
					checkInven();
					break;
				case 3 :
					priceInven();
					break;
				case 4 :
					return;
			}
		}
	}
	
	private void modInven() {
		while(true) {
			System.out.println("\n=== 수량 수정 ===");
			System.out.print("\n1.사과\n2.포도\n3.복숭아\n4.main 나가기\n>>>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.println("사과 수량 : ");
				dto.setA(sc.nextInt());
				break;
			case 2:
				System.out.println("포도 수량: ");
				dto.setB(sc.nextInt());
				break;
			case 3:
				System.out.println("복숭아 수량 : ");
				dto.setC(sc.nextInt());
				break;
			case 4:
				return;
			}
		}
	}

	private void priceInven() {
		while(true) {
			System.out.println("=== 가격 설정 ===");
			System.out.println("1. 사과");
			System.out.println("2. 포도");
			System.out.println("3. 복숭아");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("사과 가격 : ");
				dto.setAp(sc.nextInt());
				break;
			case 2:
				System.out.println("포도 가격 : ");
				dto.setBp(sc.nextInt());
				break;
			case 3:
				System.out.println("복숭아 가격 : ");
				dto.setCp(sc.nextInt());
				break;
			default:
				return;
			}
			
		}
	}
	
	private void checkInven() {
			System.out.println("\n=== 재고 수량 확인 ===");
			System.out.println("1.사과 (" + dto.getAp() + "): " + dto.getA());
			System.out.println("2.포도 (" + dto.getBp() + ") : " + dto.getB());
			System.out.println("3.복숭아 (" + dto.getCp() + ") : " + dto.getC());
	}

	

}
