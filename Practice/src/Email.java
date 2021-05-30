public class Email {
	private String name;
	private String email;

	public Email(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public static Email createEmail(String name, String email) {
		return new Email(name, email);
	}
}
