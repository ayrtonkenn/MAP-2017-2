package map.comport.observer;

import java.util.ArrayList;
import java.util.List;

class AnyObserver {
	abstract class Observer {
	    protected Subject subject;
	    public abstract void update();
	}

	public class Subject {
	    private List<Observer> observers = new ArrayList<>();
	    private int state;

	    public void add(Observer o) {
	        observers.add(o);
	    }

	    public int getState() {
	        return state;
	    }

	    public void setState(int value) {
	        this.state = value;
	        execute();
	    }

	    private void execute() {
	        for (Observer observer : observers) {
	            observer.update();
	        }
	    }
	}

	class HexObserver extends Observer {
	    public HexObserver(Subject subject) {
	        this.subject = subject;
	        this.subject.add(this);
	    }

	    public void update() {
	        System.out.print(" " + Integer.toHexString(subject.getState()));
	    }
	}

	class OctObserver extends Observer {
	    public OctObserver(Subject subject) {
	        this.subject = subject;
	        this.subject.add( this );
	    }

	    public void update() {
	        System.out.print(" " + Integer.toOctalString(subject.getState()));
	    }
	}

	class BinObserver extends Observer {
	    public BinObserver(Subject subject) {
	        this.subject = subject;
	        this.subject.add(this);
	    }

	    public void update() {
	        System.out.print(" " + Integer.toBinaryString(subject.getState()));
	    }
	}
}
