public class Main {
    public static void main(String[] args) {
        DatabaseOperationsAbstract dbOperations = new DatabaseOperations();
        DatabaseOperationsAbstract dbOperationsProxy = new DatabaseOperationsProxy(dbOperations);
        try {
            dbOperationsProxy.create(DatabaseOperationsAbstract.SUPERADMIN, "Person");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            dbOperationsProxy.delete(DatabaseOperationsAbstract.SUPERADMIN, "Person");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            dbOperationsProxy.delete(DatabaseOperationsAbstract.ADMIN, "Car");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            dbOperationsProxy.create(DatabaseOperationsAbstract.USER, "Car");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            dbOperationsProxy.get(DatabaseOperationsAbstract.ADMIN, "Person");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
