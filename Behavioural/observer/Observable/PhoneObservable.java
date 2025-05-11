package observable;

import java.util.*;
import observer.INotificationObserver;

public class PhoneObservable implements IProductObservable{
    
    List<INotificationObserver> observerList = new ArrayList<>();
    String productName;
    boolean newStockAdded;

    public PhoneObservable(String productName){
        this.productName = productName;
    }

    @Override
    public void add(INotificationObserver observerObject){
        observerList.add(observerObject);
    }

    @Override
    public void remove(INotificationObserver observerObject){
        observerList.remove(observerObject);
    }

    @Override
    public void notifyObservers(){
        for(INotificationObserver observerObject : observerList){
            observerObject.updateObserver();
        }
    }

    @Override
    public void setData(boolean newStockAdded){
        if(newStockAdded){
            notifyObservers();
        }
    }

    @Override
    public String getProductName(){
        return productName;
    }

}
