package kosa.oop2;

public class MyService {
    private OracleDao dao;
//    private MySQLDao dao1;

    public MyService() {}

    public MyService(OracleDao dao) {
        super();
        this.dao = dao;  // 의존
    }

//    public MyService(MySQLDao dao1) {
//        super();
//        this.dao1 = dao1;
//    }

    public void insertService() {
        dao.insert();
    }

//    public void insertService1() {
//        dao1.insert();
//    }

    public OracleDao getDao() {
        return dao;
    }
    public void setDao(OracleDao dao) {
        this.dao = dao;
    }

//    public MySQLDao getDao1() {
//        return dao1;
//    }
//    public void setDao1(MySQLDao dao1) {
//        this.dao1 = dao1;
//    }
}
