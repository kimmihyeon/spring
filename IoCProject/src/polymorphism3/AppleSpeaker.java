package polymorphism3;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	public void volumeUp() {
		System.out.println("AppleSpeaker---소리를 올린다.");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker---소리를 내린다.");
	}
}
