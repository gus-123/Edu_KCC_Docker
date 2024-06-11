package kosa.relation;

import java.util.ArrayList;
import java.util.List;
//5.29
public class Human {
	private String id;
	private String name;
	private String addr;
	private List<Video> videos;
	
	public Human () {
		
	}
	
	public Human(String id ,String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		videos  = new ArrayList<Video>();
	}
	
	public void addVideo(Video video) {
		videos.add(video);
		video.addHuman(this);
	}
	
	public void removeVideo(Video video) {
		if(videos.contains(video)) {
			videos.remove(video);
			video.removeHuman(this);
		}
	}
	
	public void printVideo() {
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + addr);
		for(Video video : videos) {
			System.out.println("회원이 대여한 비디오 번호 : " + video.getNum());
			System.out.println("회원이 대여한 비디오 제목 : " + video.getTitle());
			System.out.println("회원이 대여한 비디오 주인공 : " + video.getCharacter());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
