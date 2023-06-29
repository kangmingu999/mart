package mart;

import java.util.Map;

public class DTO {
	private int cash,num;	// 손님 돈 , 수량
	private Map<String, Integer> product;	// 상품 이름, 가격
	
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Map<String, Integer> getProduct() {
		return product;
	}
	public void setProduct(Map<String, Integer> product) {
		this.product = product;
	}
	

}
