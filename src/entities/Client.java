package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String name;
	private String email;
	private LocalDate birthDate;

	public Client() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: ").append(name);
		sb.append(", Birth Date: ").append(birthDate.format(dtf));
		sb.append(", Email: ").append(email);
		return sb.toString();
	}

}
