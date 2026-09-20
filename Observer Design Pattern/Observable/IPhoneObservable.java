package Observable;

import ObserverFold.Observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements Observable{
    int data;
    List<Observer> observerList;
    public IPhoneObservable(){
        this.observerList = new ArrayList<>();
        this.data = 0;
    }
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifying() {
        for(Observer o : observerList){
            o.update();
        }
    }

    @Override
    public void setData(int data) {
        if(this.data == 0){
            notifying();
        }
        System.out.println("DATA : "+ this.data);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }
}
