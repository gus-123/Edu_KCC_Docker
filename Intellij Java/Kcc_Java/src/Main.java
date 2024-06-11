public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "�Ĺ�", "�ֹν�");
		Video v2 = new Video("2", "�����Ǻ�", "Ȳ����");
		
		GeneralMember gm = new GeneralMember("a1", "ȫ�浿", "�����");
		gm.rental(v2);
		gm.show();

	}

}
