package observable;

import observer.INotificationObserver;

public interface  IProductObservable {
    public void add(INotificationObserver observer);
    public void remove(INotificationObserver observer);
    public void notifyObservers();
    public void setData(boolean stockAdded);
    public String getProductName();
}
