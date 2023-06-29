package cash;

import java.util.Iterator;
import java.util.Scanner;

import mart.DTO;

public class CasherImpl implements Casher{
	public DTO d = new DTO();
	Scanner sc = new Scanner(System.in);
	int num,sum = 0;
	
	public void chk() {
		System.out.println("아래는 현재 물품들과 구매하실 물품의 갯수입니다.");
		System.out.println("사과 : " + d.getNa());
		System.out.println("포도 : " + d.getNb());
		System.out.println("복숭아 : " + d.getNc());
	}

	public void buy() {
		System.out.println("현재 가지고 계신 돈은 " + d.getCash() +"원 입니다.");
		int ap = d.getNa() * d.getAp();
		int bp = d.getNb() * d.getBp();
		int cp = d.getNc() * d.getCp();
		sum = ap + bp + cp;
		if(d.getCash() >= sum) {
			System.out.println("총 결제 금액은 " + sum + "원이고 구매 후 잔액은 " +(sum - d.getCash()) +"입니다.");
		}else {
			System.out.println("돈이 부족합니다.");
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
