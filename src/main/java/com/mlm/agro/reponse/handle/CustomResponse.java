package com.mlm.agro.reponse.handle;

public class CustomResponse {
	
	private String message;
	public CustomResponse() {
		
	}

	
	public CustomResponse(String msg) {
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
