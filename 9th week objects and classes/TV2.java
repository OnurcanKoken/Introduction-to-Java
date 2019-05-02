public class TV2{
	int channel;
	int volumeLevel;
	boolean on;
	int previousChannel;
	
	TV2(int newChannel, int newVolumeLevel){
		previousChannel = newChannel; 
		channel = newChannel; 
		volumeLevel = newVolumeLevel;
	}
	
	public String getState(){
		String out = "On:" + on;
		if(on)
			out = out + ",Ch:" + channel + ",Vol:" + volumeLevel;
		return out;
	}
	
	void turnToggle(){ // turn on/off TV
		if(on) on = false;
		else on = true;
	}
	
	void setChannel(int newChannel){
		previousChannel = channel; 
		channel = newChannel;
	}
	
	void gotoPreviousChannel(){
		channel = previousChannel;
	}
	
	void setVolume(int newVolumeLevel){
		volumeLevel = newVolumeLevel;
	}
	
	void channelUp(){
		if(1 < channel && channel < 120){
			previousChannel = channel;
			channel = channel + 1;
		}
	}
	
	void channelDown(){
		if(1 < channel && channel < 120){
			previousChannel = channel;
			channel = channel - 1;
		}			
	}
	
	void volumeUp(){
		if(1 < volumeLevel && volumeLevel < 7)
			volumeLevel = volumeLevel + 1;
	}
	
	void volumeDown(){
		if(1 < volumeLevel && volumeLevel < 7)
			volumeLevel = volumeLevel - 1;
	}
	
}