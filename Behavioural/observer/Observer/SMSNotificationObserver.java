package observer;

import observable.IProductObservable;

public class SMSNotificationObserver implements INotificationObserver{
    IProductObservable observable;
    String mobileNumber;

    public SMSNotificationObserver(IProductObservable observable, String mobileNumber) {
        this.observable = observable;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void updateObserver(){
        sendSMS(mobileNumber, observable.getProductName());
    }

    private void sendSMS(String mobileNumber, String productName){
        System.out.println(productName + " now available. SMS sent to " + mobileNumber);
    }
    
}
