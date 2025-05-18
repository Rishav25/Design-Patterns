import filesystem.*;

public class Main {
    public static void main(String[] args) {
        FileSystemInterface fsI1 = new Directory("Parent");
        FileSystemInterface fsI2 = new File("File1");
        FileSystemInterface fsI3 = new File("File2");
        FileSystemInterface fsI4 = new Directory("Current");
        FileSystemInterface fsI5 = new File("File3");
        FileSystemInterface fsI6 = new File("File4");
        FileSystemInterface fsI7 = new Directory("Child");

        fsI1.addChild(fsI2);
        fsI1.addChild(fsI3);
        fsI1.addChild(fsI4);
        fsI1.addChild(fsI5);
        fsI1.addChild(fsI6);
        fsI1.addChild(fsI7);
        
        fsI1.ls();
    }
}
