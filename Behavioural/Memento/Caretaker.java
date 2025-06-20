import java.util.Stack;

public class Caretaker {
    
    Stack<Memento> mementos = new Stack<>();

    public void addMementoToList(Memento memento){
        mementos.push(memento);
    }

    public Memento undo(){
        if(!mementos.isEmpty()){
            Memento lastMemento = mementos.pop();
            return lastMemento;
        }

        return null;
    }

}
