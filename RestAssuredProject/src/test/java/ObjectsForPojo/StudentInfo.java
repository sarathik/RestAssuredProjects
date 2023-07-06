package ObjectsForPojo;

public class StudentInfo {
	
	private String id;
	private String name;
	private String city;
	private String age;
	StudentAddtionalInfo stAddinfo;
	
	public StudentAddtionalInfo getStAddinfo() {
		return stAddinfo;
	}
	public void setStAddinfo(StudentAddtionalInfo stAddinfo) {
		this.stAddinfo = stAddinfo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
