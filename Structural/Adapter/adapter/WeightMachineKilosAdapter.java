package adapter;

import existingadaptee.WeightMachinePounds;

public class WeightMachineKilosAdapter implements WeightMachineAdapterInterface{

    WeightMachinePounds adapteeWeight;

    public WeightMachineKilosAdapter(WeightMachinePounds wmp) {
        this.adapteeWeight = wmp;
    }

    @Override
    public float getWeightFromAdapter(){
        float oldWeight = this.adapteeWeight.getWeightInPounds();
        return oldWeight*0.45F;
    }
}
