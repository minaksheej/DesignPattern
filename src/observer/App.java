package observer;

public class App {

	public static void main(String[] args) {
		WhetherStation station=new WhetherStation();
		WhetherObserver observer=new WhetherObserver(station);
		station.setHumidity(100);
		station.setPressure(200);
		station.setTemprature(300);
	}

}
