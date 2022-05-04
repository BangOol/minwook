package co.dev.vo;

public class MemberVO {
	private String name;
	private String passwd;
	private String email;
	private String id;
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", passwd=" + passwd + ", email=" + email + ", id=" + id + "]";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
