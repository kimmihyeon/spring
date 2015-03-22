package polymorphism3;

public class LgTV implements TV {
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV1 객체 생성");
	}
		
	public LgTV(Speaker speaker) {
		System.out.println("===> LgTV2 객체 생성");
		this.speaker = speaker;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("---> setSpeaker() 메소드 호출");
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("LgTV---전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV---전원을 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}








