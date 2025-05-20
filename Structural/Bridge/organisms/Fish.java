package organisms;

import eatinghabit.EatingHabitI;
import organisms.OrganismAbstract;

public class Fish extends OrganismAbstract{

    public Fish(String name, EatingHabitI eatingHabit) {
        super(name, eatingHabit);
    }
    
    public void showEatingHabit(){
        super.getEatingHabitI().getEatingHabit();
    }

}
