package ObjectsForPojo;

public class TeacherInfo {
	
	private String id;
	private String teacherId;
	private String teachername;
	private String subject;
	private TeacherClassInfo[] teacherAddinfo;

	public TeacherClassInfo[] getTeacherAddinfo() {
		return teacherAddinfo;
	}
	public void setTeacherAddinfo(TeacherClassInfo[] teacherAddinfo) {
		this.teacherAddinfo = teacherAddinfo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}	
}
