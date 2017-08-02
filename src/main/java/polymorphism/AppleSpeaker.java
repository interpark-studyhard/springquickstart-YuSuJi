package polymorphism;

import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("====> AppleSpeaker 按眉 积己");
	}
	public void VolumeUp(){
		System.out.println("AppleSpeaker---家府 棵赴促.");	
	}
	public void VolumeDown(){
		System.out.println("AppleSpeaker---家府 郴赴促.");	
	}
}
