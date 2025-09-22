// Course

class Course{

	String courseName;
	int duration;
	Course(String courseName,int duration){
	
		this.courseName = courseName;
		this.duration = duration;

	}
	void Course(){
	
		System.out.println("Course Name : "+courseName);
		System.out.println("Duration: "+duration+" months");
	}
}
class OnlineCourse extends Course{

	String platform;
	OnlineCourse(String courseName,int duration,String platform){
	
		super(courseName,duration);
		this.platform = platform;

	}
	void FullCourse(){
	
		super.Course();
		System.out.println("Platform : "+platform);
		
	}
}
class CourseName{

	public static void main(String[] args){
	
		OnlineCourse oc = new OnlineCourse("Java Programming",4,"Udemy");
		oc.FullCourse();
	}
}
