
import eatinghabit.Autotroph;
import eatinghabit.Carnivorous;
import eatinghabit.Herbivorous;
import eatinghabit.Omnivorous;
import organisms.Animal;
import organisms.OrganismAbstract;
import organisms.Plant;



public class Main {
    public static void main(String[] args) {
        OrganismAbstract organism1 = new Animal("Lion", new Carnivorous());
        OrganismAbstract organism2 = new Plant("Peepal", new Autotroph());
        OrganismAbstract organism3 = new Animal("Human", new Omnivorous());
        OrganismAbstract organism4 = new Plant("Venus Flytrap", new Carnivorous());
        OrganismAbstract organism5 = new Animal("Cow", new Herbivorous());

        organism1.showEatingHabit();
        organism2.showEatingHabit();
        organism3.showEatingHabit();
        organism4.showEatingHabit();
        organism5.showEatingHabit();
    }
}
