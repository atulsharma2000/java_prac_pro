package Q2;

import java.util.List;

public class Singer {
	
	
	String name;
	String gender;
	int age;
	String email_id;
	long contant;
	int rating;
	public Singer(String name, String gender, int age, String email_id, long contant, int rating) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email_id = email_id;
		this.contant = contant;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public long getContant() {
		return contant;
	}
	public void setContant(int contant) {
		this.contant = contant;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Singer [name=" + name + ", gender=" + gender + ", age=" + age + ", email_id=" + email_id + ", contant="
				+ contant + ", rating=" + rating + "]";
	}
	
	


}
