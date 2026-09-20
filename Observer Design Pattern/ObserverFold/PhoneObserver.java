package ObserverFold;

import Observable.Observable;

public class PhoneObserver implements Observer {

    String name;

    public PhoneObserver(String name){
        this.name = name;

    }

    @Override
    public void update() {
        System.out.println("Phone Notification : Stock is Available, Hurry Up "+name);
    }
}