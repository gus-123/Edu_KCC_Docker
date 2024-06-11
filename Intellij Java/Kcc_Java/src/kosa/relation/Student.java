package kosa.relation;
//5.29
//리스트
import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; // 학생이 수강신청한 과목들 => List<원하는 목록> 이름  /// Course 한과목  // courses는 리스트

	public Student() {  //default 생성자

	}

	public Student(String name) { 
		super();
		this.name = name;
		courses = new ArrayList<Course>();
	}
	
	// 등록 메서드 과목을 추가하면 학생도 과목에 추가(한학생 기준)
	public void register(Course course) {
		courses.add(course);  // 과목 추가
		course.addStudent(this);  // this는 register라는 메서드를 호출하는 student 객체 (과목에서 학생이 추가됬다는 것을 알려주는것임)
	}
	
	// 삭제 메서드 과목을 삭제하면 학생도 삭제 (한학생 기준)
	public void dropCourse(Course course) {  // 과목 수강 취소
		if(courses.contains(course)) {  // course가 있기만 하면
			courses.remove(course);
			course.removeStudent(this);  // 코스안에서 해당하는 학생들의 제거
		}
	}
	
	public void printMember() {
		System.out.println("학생이름: " + name);
		for(Course course : courses) {
			System.out.println("수강과목 : " + course.getName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
