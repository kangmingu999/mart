package cart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import mart.DTO;

public class CartServiceImpl implements CartService{
	DTO dto = new DTO();
	public Scanner input = new Scanner(System.in);
	public int num, num2;
	String name;
	public void addObject() {
		ArrayList<String> arr = (ArrayList<String>) dto.getProduct().keySet();
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+dto.getProduct().get(key));
		}
		System.out.print("제품명 : ");
		name = input.next();
		for(int i=1;i<dto.getProduct().size();i++) {
			if(dto.getProduct().containsKey(name)==true) {
				System.out.print("갯수 : ");
				num = input.nextInt();
				int n = arr.indexOf(name);
				switch (n) {
				case 0 :
					
					break;
				case 1 :
					
					break;
				case 2 : 
					
					break;
				default : return;
				}
			}
		}
		
	}

	public void updateObject() {
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.print("제품 : ");
		num = input.nextInt();
		System.out.print("갯수 : ");
		num2 = input.nextInt();
		switch (num) {
		case 1 :
			
			break;
		case 2 : 
			
			break;
		case 3 : 
			
			break;
		case 4 : return;
		}
	}

	public void delObject() {
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.print("제품 : ");
		num = input.nextInt();
		System.out.print("갯수 : ");
		num2 = input.nextInt();
		switch (num) {
		case 1 :
			
			break;
		case 2 : 
			
			break;
		case 3 : 
			
			break;
		case 4 : return;
		}
	}
	
	public void showObject() {
		ArrayList<String> arr = (ArrayList<String>) dto.getProduct().keySet();
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+dto.getProduct().get(key));
		}
	}
	public void Cart() {
		
		System.out.println("1. 결제 상품 추가");
		System.out.println("2. 결제 상품 수정");
		System.out.println("3. 결제 상품 삭제");
		System.out.println("4. 결제 상품 목록 보기");
		System.out.println("5. main으로 돌아가기");
		System.out.print(">>>");
		num = input.nextInt();
		switch (num) {
		case 1 :
			addObject();
			break;
		case 2 : 
			updateObject();
			break;
		case 3 : 
			delObject();
			break;
		case 4 : 
			showObject();
			break;
		case 5 : return;
		}
	}

}
