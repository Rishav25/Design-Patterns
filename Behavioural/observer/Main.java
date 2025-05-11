import observable.*;
import observer.*;

class Main {
    public static void main(String[] args){
        IProductObservable laptopObservable1 = new LaptopObservable("MacBook Air M1");
        IProductObservable laptopObservable2 = new LaptopObservable("Toshiba Dynabook");
        IProductObservable phoneObservable = new PhoneObservable("iPhone 16");
        
        INotificationObserver obs1 = new EmailNotificationObserver(laptopObservable1, "mail1@mail.com");
        INotificationObserver obs2 = new EmailNotificationObserver(laptopObservable1, "mail2@mail.com");
        INotificationObserver obs3 = new SMSNotificationObserver(laptopObservable1, "1234567890");

        INotificationObserver obs4 = new EmailNotificationObserver(phoneObservable, "mail1@mail.com");
        INotificationObserver obs5 = new EmailNotificationObserver(phoneObservable, "mail2@mail.com");
        INotificationObserver obs6 = new SMSNotificationObserver(phoneObservable, "1234567890");

        INotificationObserver obs7 = new EmailNotificationObserver(laptopObservable2, "mail1@mail.com");
        INotificationObserver obs8 = new EmailNotificationObserver(laptopObservable2, "mail2@mail.com");
        INotificationObserver obs9 = new SMSNotificationObserver(laptopObservable2, "1234567890");

        laptopObservable1.add(obs1);
        laptopObservable1.add(obs2);
        laptopObservable1.add(obs3);

        phoneObservable.add(obs4);
        phoneObservable.add(obs5);
        phoneObservable.add(obs6);

        phoneObservable.setData(true);
        System.out.println("\n");
        laptopObservable1.setData(true);
        System.out.println("\n");
        phoneObservable.remove(obs6);

        phoneObservable.setData(true);
        System.out.println("\n");
        laptopObservable2.add(obs7);
        laptopObservable2.add(obs8);
        laptopObservable2.add(obs9);

        laptopObservable2.setData(true);
        System.out.println("\n");
    }
}
