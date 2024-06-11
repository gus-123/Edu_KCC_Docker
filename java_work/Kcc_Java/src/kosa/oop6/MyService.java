package kosa.oop6;

public class MyService {
	private Dao dao;
	
	public MyService() {
		
	}
	
	public MyService(Dao dao) {
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	

}
