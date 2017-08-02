package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("====> AppleSpeaker ��ü ����");
	}
	public void VolumeUp(){
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");	
	}
	public void VolumeDown(){
		System.out.println("AppleSpeaker---�Ҹ� ������.");	
	}
}
