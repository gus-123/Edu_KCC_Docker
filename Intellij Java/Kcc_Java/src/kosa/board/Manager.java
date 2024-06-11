package kosa.board;

import java.util.Scanner;
//5.29
public class Manager {

	private board[] arr;
	private Scanner sc;
	private int count;

	public Manager() {
		arr = new board[10];
		sc = new Scanner(System.in);
	}

	public void List() {
		for (int i = 0; i < count; i++) {
			arr[i].list();
		}
	}

	public void insert() {
		System.out.print("글 번호 : " + (count));
		System.out.println();
		System.out.print("글 제목 : ");
		String title = sc.nextLine();
		System.out.print("작성자 : ");
		String name = sc.nextLine();
		System.out.print("글 내용 : ");
		String content = sc.nextLine();

		arr[count++] = new board((count), title, name, content);
	}

	public void update() {
		System.out.println("검색할 글 번호를 검색하시오 : ");
		int SearchNum = sc.nextInt();

		boolean check = false;
		for (int i = 0; i < count; i++) {
			if (SearchNum == i) {
				System.out.print("글 번호 : " + (count));
				sc.nextLine();
				System.out.print("글 제목 : ");
				String title = sc.nextLine();
				System.out.print("작성자 : ");
				String name = sc.nextLine();
				System.out.print("글 내용 : ");
				String content = sc.nextLine();
				arr[SearchNum] = new board(SearchNum, title, name, content);
				check = true;
				break;
			}
		}

		if (!check) {
			System.out.println("결과를 검색할수 없습니다.");
		}

	}

	public void delete() {
		System.out.println("검색할 글 번호를 검색하시오 : ");
		int SearchNum = sc.nextInt();

		if (SearchNum <= 0 || SearchNum > count) {
	        System.out.println(SearchNum + "번 게시글을 찾을 수 없습니다.");
	        return;
	    }

	    arr[SearchNum] = null;
	    System.out.println(SearchNum + "번 게시글이 삭제되었습니다.");

	}

}
