package cash;

import java.util.Iterator;
import java.util.Scanner;

import mart.DTO;

public class CasherImpl implements Casher{
	public DTO d = new DTO();
	Scanner sc = new Scanner(System.in);
	int num,sum = 0;
	Iterator<String> it1 = d.getProduct().keySet().iterator();
	Iterator<Integer> it2 = d.getProduct().values().iterator();
	
	public void chk() {
		System.out.println("아래는 현재 물품들과 구매하실 물품의 갯수입니다.");
		while(it1.hasNext()) {
			String s = it1.next();
			if(s.equals("사과")) {
				System.out.println(it1.next() + " : " + d.getA());
			}else if(s.equals("포도")){
				System.out.println(it1.next() + " : " + d.getB());
			}else if(s.equals("복숭아")) {
				System.out.println(it1.next() + " : " + d.getC());
			}
		}
	}

	public void buy() {
		System.out.println("현재 가지고 계신 돈은" + d.getCash() +"원 입니다.");
		
		while(it1.hasNext()) {
			String s = it1.next();
			if(s.equals("사과")) {
				sum += (it2.next() * d.getA());
			}else if(s.equals("포도")){
				sum += (it2.next() * d.getB());
			}else if(s.equals("복숭아")) {
				sum += (it2.next() * d.getC());
			}
		}
		
		if(d.getCash() >= sum) {
			System.out.println("총 결제 금액은 " + sum + "원 이고 잔돈은" + (d.getCash() - sum) + "원 입니다.");
		}else {
			System.out.println("결제할 금액이 현재 가지고 계신 금액보다 큽니다.");
		}
		
	}
	
	public void menu() {
		while(true) {
			System.out.println("1. 장바구니 내용 확인");
			System.out.println("2. 물품 결제");
			System.out.println("3. 메인으로 돌아가기");
			System.out.println(">>> : ");
			num = sc.nextInt();
			switch(num) {
			case 1: 
				chk();
				break;
			case 2: 
				buy();
				break;
			case 3: return;
			}
		}
	}

}
