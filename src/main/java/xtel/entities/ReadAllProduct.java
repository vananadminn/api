package xtel.entities;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ReadAllProduct extends BaseResponse {

	List<Products> products;
	private String message;
	private int code = 0;
	private Object data;

	protected ReadAllProduct() {
	}

	public ReadAllProduct(String message, int code) {
		this.message = message;
		this.code = code;
	}

	public ReadAllProduct(String message, int code, Object data) {
		this.message = message;
		this.code = code;
		this.data = data;
	}

	public ReadAllProduct(String message, int code, List<Products> products) {
		this.message = message;
		this.code = code;
		this.products = products;
	}

	public List<Products> getProduct() {
		return products;
	}

	public void setProduct(List<Products> product) {
		this.products = product;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}



}
