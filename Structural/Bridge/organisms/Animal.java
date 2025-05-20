package organisms;

import eatinghabit.EatingHabitI;
import organisms.OrganismAbstract;

public class Animal extends OrganismAbstract{

    public Animal(String name, EatingHabitI eatingHabit) {
        super(name, eatingHabit);
    }
    
    public void showEatingHabit(){
        super.getEatingHabitI().getEatingHabit();
    }

}
