public class Main {
    public static void main(String[] args) {
        DBConnectionPoolManager dBConnectionPoolManager = DBConnectionPoolManager.getInstance();
        
        DBConnection db1 = dBConnectionPoolManager.getDBConnection();
        DBConnection db2 = dBConnectionPoolManager.getDBConnection();
        DBConnection db3 = dBConnectionPoolManager.getDBConnection();
        DBConnection db4 = dBConnectionPoolManager.getDBConnection();
        DBConnection db5 = dBConnectionPoolManager.getDBConnection();
        DBConnection db6 = dBConnectionPoolManager.getDBConnection();
        DBConnection db7 = dBConnectionPoolManager.getDBConnection();

        dBConnectionPoolManager.removeDBConnection(db1);
        dBConnectionPoolManager.removeDBConnection(db2);
        dBConnectionPoolManager.removeDBConnection(db3);
        dBConnectionPoolManager.removeDBConnection(db4);

    }
}
