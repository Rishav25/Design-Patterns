public class Originator {
    
    int height;
    int width;

    public Originator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Memento createMemento(){
        return new Memento(this.height, this.width);
    }

    public void restoreMemento(Memento memento){
        this.height = memento.height;
        this.width = memento.width;
    }

    public int getHeight(){
        return this.height;
    }

    public int getWidth(){
        return this.width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }
}
