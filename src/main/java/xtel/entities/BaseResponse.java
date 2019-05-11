package xtel.entities;

import org.springframework.stereotype.Component;

@Component
public class BaseResponse {
	private String message = "Success";
	private int code = 0;

	public void Result(String message, int code) {
		this.message = message;
		this.code = code;
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
