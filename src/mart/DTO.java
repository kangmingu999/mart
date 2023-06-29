package mart;

import java.util.LinkedHashMap;
import java.util.Map;

public class DTO {
	private int cash, a, b, c;	// 손님 돈 , 수량
	
	private LinkedHashMap<String, Integer> product;	// 상품 이름, 가격
	
	public int getCash() {return cash;}
	public void setCash(int cash) {this.cash = cash;}

	public int getA() {return a;}
	public void setA(int a) {this.a = a;}
	
	public int getB() {return b;}
	public void setB(int b) {this.b = b;}
	
	public int getC() {return c;}
	public void setC(int c) {this.c = c;}
	
	public Map<String, Integer> getProduct() {return product;}
	public void setProduct(LinkedHashMap<String, Integer> product) {this.product = product;}
	

}
