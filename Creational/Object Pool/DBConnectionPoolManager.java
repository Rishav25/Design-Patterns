import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    
    List<DBConnection> freeConnections = new ArrayList<>(); 
    List<DBConnection> inUseConnections = new ArrayList<>();
    static final int INTIAL_POOL_SIZE = 3;
    static final int MAX_POOL_SIZE = 6;
    static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager(){
        for(int i=0;i<INTIAL_POOL_SIZE;i++)
            freeConnections.add(new DBConnection());
    }

    // making it thread safe using synchronized
    public static DBConnectionPoolManager getInstance(){
        if(dbConnectionPoolManagerInstance == null){
            synchronized (DBConnectionPoolManager.class) {
                if(dbConnectionPoolManagerInstance == null){
                    dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConnection getDBConnection(){
        if(freeConnections.isEmpty()){
            if(inUseConnections.size() == MAX_POOL_SIZE){
                System.out.println("No available resources\n");
                return null;
            }
            else{
                System.out.println("Allocating a new DBConnection to the pool");
                freeConnections.add(new DBConnection());
            }
        }
        DBConnection dbConnection = freeConnections.get(freeConnections.size()-1);
        freeConnections.remove(freeConnections.size()-1);
        System.out.println("Checking free list");
        inUseConnections.add(dbConnection);
        System.out.println("Currently in use\n");
        return dbConnection;
    }

     public synchronized void removeDBConnection(DBConnection dBConnection){
        if(dBConnection != null){
            inUseConnections.remove(dBConnection);
            System.out.println("Freeing Resource");
            freeConnections.add(dBConnection);
            System.out.println("Resource Free\n");
        }
    }

}
