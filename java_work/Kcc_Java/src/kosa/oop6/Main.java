package kosa.oop6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleDao o = new OracleDao();
		
		MyService s = new MyService() {
			@Override
			public void insertService() {
				System.out.println("»£√‚");
			}
		};
		
		s.insertService();
	}

}
