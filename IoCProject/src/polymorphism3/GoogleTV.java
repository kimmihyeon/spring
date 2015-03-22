package polymorphism3;

public class GoogleTV implements TV {
	public GoogleTV() {
		System.out.println("===> GoogleTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("GoogleTV---전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("GoogleTV---전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("GoogleTV---소리를 올린다.");
	}
	public void volumeDown() {
		System.out.println("GoogleTV---소리를 내린다.");
	}
}
