package hk.com.novare.timekeeping.signup;

import org.hibernate.validator.constraints.*;

import hk.com.novare.timekeeping.account.Account;

public class SignupForm {

	private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
	private static final String EMAIL_MESSAGE = "{email.message}";

    @NotBlank(message = SignupForm.NOT_BLANK_MESSAGE)
	private String name;


	@Email(message = SignupForm.EMAIL_MESSAGE)
	private String email;

    @NotBlank(message = SignupForm.NOT_BLANK_MESSAGE)
	private String password;
	
    
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public Account createAccount() {
        return new Account(getName(),getEmail(), getPassword(), "ROLE_USER");
	}
}
