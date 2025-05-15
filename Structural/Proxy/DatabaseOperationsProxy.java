public class DatabaseOperationsProxy extends DatabaseOperationsAbstract{
    
    DatabaseOperationsAbstract databaseOperationsObj;

    public DatabaseOperationsProxy(DatabaseOperationsAbstract databaseOperationsObj) {
        this.databaseOperationsObj = databaseOperationsObj;
    }

    @Override
    public void create(int level, String obj) throws Exception{
        if(level >= ADMIN){
            databaseOperationsObj.create(level, obj);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void get(int level, String obj) throws Exception{
        if(level >= USER){
            databaseOperationsObj.get(level, obj);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void delete(int level, String obj) throws Exception{
        if(level >= SUPERADMIN){
            databaseOperationsObj.delete(level, obj);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

}
