package ObserverFold;

import Observable.Observable;

public class EmailObserver implements Observer {

    String name;

    public EmailObserver(String name){
        this.name = name;

    }

    @Override
    public void update() {
        System.out.println("Email Notification : Stock is Available, Hurry Up "+name);
    }
}