package sec2;

public class RemoteExam1 {
	public static void main(String[] args) {
		RemoteControl r1;
		
		r1 = new RemoteControl() {
			int volume;
			public void turnOff() {
				System.out.println("전원 OFF");
			}

			public void turnOn() {
				System.out.println("전원 ON");
			}

			public void setVolume(int volume) {
				if(volume > MAX) {
					this.volume = RemoteControl.MAX;
					System.out.println("현재 볼륨 : "+ MAX);
				}
				else if(volume < MIN) {
					this.volume = RemoteControl.MIN;
					System.out.println("현재 볼륨 : "+ MIN);
				}
				else {
					this.volume = volume;
					System.out.println("현재 볼륨 : "+ volume);
				}
			}
		};
		
		RemoteControl.changeBattery();
		r1.turnOn();
		r1.setVolume(7);
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
	}
}
