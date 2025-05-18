package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemInterface{
    
    List<FileSystemInterface> children;
    String name;

    public Directory(List<FileSystemInterface> children, String name) {
        this.children = children;
        this.name = name;
    }

    public Directory(String name){
        this.children = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addChild(FileSystemInterface fsI){
        this.children.add(fsI);
    }

    @Override
    public void ls(){
        System.out.println("Directory: " + this.name);
        for(FileSystemInterface fsI : children){
            fsI.ls();
        }
    }
    
}
