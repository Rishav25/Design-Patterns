package filesystem;

public class File implements FileSystemInterface{
    String name;

    public File(String fileName) {
        this.name = fileName;
    }

    @Override
    public void ls(){
        System.out.println("File: "+this.name);
    }

    @Override
    public void addChild(FileSystemInterface fsI){
        System.out.println("Cannot add anything to file.");
    }
}
