package kosa.board;

import java.util.Scanner;
//5.29
public class board {
	// 글 제목, 작성자, 글 내용
	private int num;
	private String title;
	private String name;
	private String content;
	private Scanner sc;

	public board() {
		sc = new Scanner(System.in);
	}

	public board(int num ,String title, String name, String content) {
		this.num = num;
		this.title = title;
		this.name = name;
		this.content = content;
	}
	
	public void list() {
		System.out.println("글 번호 : " + num);
		System.out.println("글 제목 : " + title);
		System.out.println("작성자 : " + name);
		System.out.println("글 내용 : " + content);
		System.out.println("---------------------------");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
