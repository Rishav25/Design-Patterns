import adapter.*;
import existingadaptee.WeightMachinePounds;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapterInterface wmai = new WeightMachineKilosAdapter(new WeightMachinePounds());
        System.out.println("Weight in Kilos : "+wmai.getWeightFromAdapter());
    }
}
