package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	//@Autowired
	//@Qualifier("sony")
	@Resource(name="apple")
	private Speaker speaker;
	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}
	public void volumeUp() {
		System.out.println("LgTV---�Ҹ� �ø���.");
		speaker.VolumeUp();
	}
	public void volumeDown() {
		System.out.println("LgTV---�Ҹ� ������.");
		speaker.VolumeDown();
	}
}
