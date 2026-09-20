package Observable;

import ObserverFold.Observer;

public interface Observable{
    void add(Observer observer);
    void remove(Observer observer);
    void notifying();
    void setData(int data);
}