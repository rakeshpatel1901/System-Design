import Observable.IPhoneObservable;
import Observable.Observable;
import ObserverFold.EmailObserver;
import ObserverFold.Observer;
import ObserverFold.PhoneObserver;


public class Main{
    public static void main(String args[]){

        Observable observable = new IPhoneObservable();

        Observer o1 = new PhoneObserver("Rakesh");
        Observer o2 = new EmailObserver("Dinesh");
        Observer o3 = new PhoneObserver("Prajwal");


        observable.add(o1);
        observable.add(o2);
        observable.add(o3);

        observable.setData(10);
    }
}