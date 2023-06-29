package cart;

import mart.DTO;

public interface CartService {
	public void addApple(DTO dto);
	public void addGrape(DTO dto);
	public void addPeach(DTO dto);
	public void showObject(DTO dto);
}
