package observer;

import observable.IProductObservable;

public class EmailNotificationObserver implements INotificationObserver{
    IProductObservable observable;
    String emailId;

    public EmailNotificationObserver(IProductObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void updateObserver(){
        sendEmail(emailId, observable.getProductName());
    }

    private void sendEmail(String emailId, String productName){
        System.out.println(productName + " now available. Email sent to " + emailId);
    }
    
}
