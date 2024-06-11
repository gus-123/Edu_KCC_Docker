package kosa.io;

import kosa.relation.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//5.29
public class Video implements Serializable {
	private String num;
	private String title;
	private String character;
	private List<Human> humans;  // <클래스 명>
	
	public Video() {
		
	}

	public Video(String num, String title, String character) {
		super();
		this.num = num;
		this.title = title;
		this.character = character;
		humans = new ArrayList<Human>();
	}
	
	public void addHuman(Human human) {
		humans.add(human);
		
	}
	
	public void removeHuman(Human human) {
		humans.remove(human);
	}
	
	public void printHuman() {
		System.out.println("비디오 번호 : " + num);
		System.out.println("비디오 제목 : " + title);
		System.out.println("비디오 주인공 : " + character);
		for (Human human : humans) {
			System.out.println("대여자 정보 : " + human.getName());
		}
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Video [num=" + num + ", title=" + title + ", character=" + character + "]";
	}

	
}
