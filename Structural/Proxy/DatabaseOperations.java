public class DatabaseOperations extends DatabaseOperationsAbstract{
    @Override
    public void create(int level, String obj){
        System.out.println("Created: "+ obj);
    }

    @Override
    public void get(int level, String obj){
        System.out.println("Get: "+ obj);
    }

    @Override
    public void delete(int level, String obj){
        System.out.println("Deleted: "+ obj);
    }
}
