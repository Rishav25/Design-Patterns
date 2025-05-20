package organisms;

import eatinghabit.EatingHabitI;
import organisms.OrganismAbstract;

public class Plant extends OrganismAbstract{

    public Plant(String name, EatingHabitI eatingHabit) {
        super(name, eatingHabit);
    }
    
    public void showEatingHabit(){
        super.getEatingHabitI().getEatingHabit();
    }

}
