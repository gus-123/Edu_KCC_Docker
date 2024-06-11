package kosa.oop;

public class BookStore {

	int java;
	int jsp;
	int oracle;
	
	public BookStore () {
		
	}
	
	public BookStore (int java, int jsp, int oracle) {
		this.java = java;
		this.jsp = jsp;
		this.oracle = oracle;
	}
	
	public int dc (double num) {
		
		if (num >= 30000) {
			num = num * 0.75;
		}
		else if (num >= 20000) {
			num = num * 0.8;
		}
		else {
			num = num * 0.85;
		}
		
		return (int)num;
	}

}
