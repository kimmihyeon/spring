package polymorphism3;

public class GoogleTV implements TV {
	public GoogleTV() {
		System.out.println("===> GoogleTV ��ü ����");
	}
	public void powerOn() {
		System.out.println("GoogleTV---������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("GoogleTV---������ ����.");
	}
	public void volumeUp() {
		System.out.println("GoogleTV---�Ҹ��� �ø���.");
	}
	public void volumeDown() {
		System.out.println("GoogleTV---�Ҹ��� ������.");
	}
}
