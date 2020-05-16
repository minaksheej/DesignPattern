package observer;

public class WhetherObserver  implements Observer{
	private int pressure;
	private int temprature;
	private int humidity;
	private Subject subject;
	
	public WhetherObserver(Subject subject) {
		this.subject=subject;
		this.subject.addObserve(this);
	}
	
	@Override
	public void update(int pressure, int temprature, int humidity) {
		this.pressure=pressure;
		this.humidity=humidity;
		this.temprature=temprature;
		showData();
		
	}

	private void showData() {
		System.out.println(" pressure: "+ this.pressure +" temprature:"+this.temprature+" humidity:"+this.humidity);
	}

}
