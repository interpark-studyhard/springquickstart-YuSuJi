package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("====> SonySpeaker ��ü ����");
	}
	public void VolumeUp(){
		System.out.println("SonySpeaker---�Ҹ� �ø���.");	
	}
	public void VolumeDown(){
		System.out.println("SonySpeaker---�Ҹ� ������.");	
	}
}
