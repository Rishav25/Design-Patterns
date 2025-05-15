public abstract class DatabaseOperationsAbstract {
    
    public static int USER = 1;
    public static int ADMIN = 2;
    public static int SUPERADMIN = 3;

    public abstract void create(int level, String object) throws Exception;
    public abstract void get(int level, String object) throws Exception;
    public abstract void delete(int level, String object) throws Exception;

}
