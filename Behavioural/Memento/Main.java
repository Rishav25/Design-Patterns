public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        
        Originator originator = new Originator(10, 20);
        System.out.println(originator.getHeight() + " " + originator.getWidth());

        // creating snapshot
        Memento memento1 = originator.createMemento();
        // adding to memento list
        caretaker.addMementoToList(memento1);

        originator.setHeight(50);
        originator.setWidth(40);
        System.out.println(originator.getHeight() + " " + originator.getWidth());

        // creating snapshot
        Memento memento2 = originator.createMemento();
        // adding to memento list
        caretaker.addMementoToList(memento2);

        System.out.println("\n");

        // taking the undo operation and setting the value to the most recent snapshot
        originator.restoreMemento(caretaker.undo());
        System.out.println(originator.getHeight() + " " + originator.getWidth());

        originator.restoreMemento(caretaker.undo());
        System.out.println(originator.getHeight() + " " + originator.getWidth());
    }
}
