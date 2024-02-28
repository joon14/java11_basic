package sec2;
//Screen 으로 선언하여 Screen, Television 로 형 변환 하여 활용하기
public class RemoteExam6 {
	public static void main(String[] args) {
		Screen r;	//RemoteControl 객체 선언
		
		System.out.println("\n****** Screen ******");
		r = new Screen() {	//Screen 으로 형 변환
			int volume;
			int lightness;
			int zoom;

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

			public int light() {
				System.out.println("밝게");
				if(this.lightness < 255 && this.lightness > 0) {
					this.lightness++;
				}
				return this.lightness;
			}

			public int dark() {
				System.out.println("어둡게");
				if(this.lightness < 255 && this.lightness > 0) {
					this.lightness--;
				}
				return this.lightness;
			}

			public int zoomin() {
				System.out.println("50% 확대");
				if(zoom <= 500 && zoom >= -500) {
					zoom+=50;
				}
				return zoom;
			}

			public int zoomout() {
				System.out.println("50% 축소");
				if(zoom <= 500 && zoom >= -500) {
					zoom-=50;
				}
				return zoom;
			}
		};
		
		RemoteControl.changeBattery();
		r.turnOn();
		r.light();
		r.light();
		r.dark();
		r.zoomin();
		r.zoomout();
		r.zoomout();
		r.setVolume(11);
		r.setMute(true);
		r.setMute(false);
		r.turnOff();
		
		System.out.println("\n****** Television ******");
		r = new Television();	//Television 으로 형 변환
		
		RemoteControl.changeBattery();
		r.turnOn();
		r.setVolume(15);
		r.setMute(true);
		r.setMute(false);
		r.light();
		r.light();
		r.dark();
		r.zoomin();
		r.zoomin();
		r.zoomout();
		r.turnOff();

	}

}
