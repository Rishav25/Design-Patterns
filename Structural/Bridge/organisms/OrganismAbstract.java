package organisms;

import eatinghabit.EatingHabitI;

public abstract class OrganismAbstract{
    EatingHabitI eatingHabit;
    String name;

    public OrganismAbstract(String name, EatingHabitI eatingHabit) {
        this.name = name;
        this.eatingHabit = eatingHabit;
    }

    public EatingHabitI getEatingHabitI(){
        return this.eatingHabit;
    }

    public abstract void showEatingHabit();
    
}