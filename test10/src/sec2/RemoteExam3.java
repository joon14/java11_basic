package sec2;

public class RemoteExam3 {
	public static void main(String[] args) {
		Television t1 = new Television();
		
		RemoteControl.changeBattery();
		t1.turnOn();
		t1.setVolume(15);
		t1.setMute(true);
		t1.setMute(false);
		t1.light();
		t1.light();
		t1.dark();
		t1.zoomin();
		t1.zoomin();
		t1.zoomout();
		t1.turnOff();
	}
}
