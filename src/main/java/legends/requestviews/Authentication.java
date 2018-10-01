package legends.requestviews;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Authentication {

	@JsonProperty(required = true) private String login;
	@JsonProperty(required = true) private String password;

	public Authentication() { }

	public boolean isValid() {
		login = login.trim();
		login = login.toLowerCase();
		return !login.isEmpty() && !password.isEmpty();
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
