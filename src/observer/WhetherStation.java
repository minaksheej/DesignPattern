package observer;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements Subject {

	private int pressure;
	private int temprature;
	private int humidity;
	private List<Observer> observerList;

	public WhetherStation() {
		observerList = new ArrayList<>();
	}

	@Override
	public void addObserve(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);

	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}

	public void setTemprature(int temprature) {
		this.temprature = temprature;
		notifyAllObservers();
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}

	@Override
	public void notifyAllObservers() {
		for (Observer observer : observerList) {
			observer.update(pressure, temprature, humidity);
		}

	}

}
