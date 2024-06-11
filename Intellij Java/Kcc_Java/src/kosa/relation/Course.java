package kosa.relation;

import java.util.ArrayList;
import java.util.List;
//5.29
public class Course {
	private String name; // 과목명
	private List<Student> students; // 리스트에 학생 한명 넣기
	
	public Course() {  // default 생성자
		
	}
	
	public Course(String name) {  // 
		super();
		this.name = name;
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {  // 한명의 학생 매개변수
		students.add(student);
	}
	
	public void removeStudent(Student student) {  // 수강 취소한 학생을 과목에서 취소
		students.remove(student);
	}
	
	public void printCourse() {
		System.out.println("과목명 : " + name);
		for(Student student : students) {
			System.out.println("수강신청 학생명 : " + student.getName());
		}
	}
	
	// get, set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
