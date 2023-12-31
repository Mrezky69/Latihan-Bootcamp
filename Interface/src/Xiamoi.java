import interfaces.Phone;

public class Xiamoi implements Phone{

	private int volume;
	private boolean isPowerOn;
	
	public Xiamoi() {
		this.volume = 50; // volume default
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Handphone menyala ...");
		System.out.println("Selamat datang di Xiamoi");
		System.out.println("Android Version 10");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		isPowerOn = false;
		System.out.println("Mematikan Handphone");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(isPowerOn) {
			if(this.volume == MAX_VOLUME) {
				System.out.println("Volume = 100%");
			}else {
				this.volume += 10;
				System.out.println("Volume Sekarang " + this.volume);
			}
		}else {
			System.out.println("Handphone mati, silahkan nyalakan dulu!!!");
		}
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(isPowerOn) {
			if(this.volume == MIN_VOLUME) {
				System.out.println("Volume = 100%");
			}else {
				this.volume -= 10;
				System.out.println("Volume Sekarang " + this.volume);
			}
		}else {
			System.out.println("Handphone mati, silahkan nyalakan dulu!!!");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	 public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
		
}
