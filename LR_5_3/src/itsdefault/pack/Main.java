package itsdefault.pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface IObserver {
    String alert();
}

class Savers {
    private List<IObserver> obs;

    public void registerObserver(IObserver o) {
        obs.add(o);
    }

    public void removeObserver(IObserver o) {
        obs.remove(o);
    }

    public Savers() {
        obs = new LinkedList<>();
    }

    public void notifyObservers() {
        for (IObserver observer : obs)
            System.out.println(observer.alert());
    }
}

class CurrentSaver implements IObserver{
    @Override
    public String alert() {
        return "ALERT";
    }
}

public class Main {

    public static void main(String[] args) {
	    Savers sv = new Savers();

	    IObserver cur1 = new CurrentSaver();
        IObserver cur2 = new CurrentSaver();
        IObserver cur3 = new CurrentSaver();
        IObserver cur4 = new CurrentSaver();

	    sv.registerObserver(cur1);
        sv.registerObserver(cur2);
        sv.registerObserver(cur3);
        sv.registerObserver(cur4);

	    sv.notifyObservers();
    }
}
