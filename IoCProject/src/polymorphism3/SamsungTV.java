package polymorphism3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	@Autowired
//	@Qualifier("sonySpeaker")
//	@Resource(name="appleSpeaker")
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV ��ü ����");
	}
	public void powerOn() {
		System.out.println("SamsungTV---������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---������ ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
