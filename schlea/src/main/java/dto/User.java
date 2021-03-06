package dto;

public class User {
	
	private String Email;
	private String Password;
	private String Name;
	private String Subject;
	private String Teacher;
	private String Teacsub;
	
	public User()
	{
		
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getTeacher() {
		return Teacher;
	}

	public void setTeacher(String teacher) {
		Teacher = teacher;
	}

	public String getTeacsub() {
		return Teacsub;
	}

	public void setTeacsub(String teacsub) {
		Teacsub = teacsub;
	}

	@Override
	public String toString() {
		return "User [Email=" + Email + ", Password=" + Password + ", Name=" + Name + ", Subject=" + Subject
				+ ", Teacher=" + Teacher + ", Teacsub=" + Teacsub + "]";
	}
	
	
	
}