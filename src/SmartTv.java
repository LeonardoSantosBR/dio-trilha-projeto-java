public class SmartTv {
    public boolean isOn = false;
    public int channel = 1;
    public int volume = 0;
    public String name;

    public SmartTv(boolean isOn, int channel, int volume, String name) {
        this.isOn = isOn;
        this.channel = channel;
        this.volume = volume;
        this.name = name;
    }

    public void turnOnOrOff(boolean state) {
        isOn = state;
    }

    public void changeChannelTo(int newChannel) {
        channel = newChannel;
    }

    public void incrementOrDecrementChannel(String action) {
        switch (action) {
            case "INCREMENT":
                channel++;
                break;
            case "DECREMENT":
                channel--;
                break;
        }
    }

    public void incrementOrDecrementVolume(String action) {
        switch (action) {
            case "INCREMENT":
                volume++;
                break;
            case "DECREMENT":
                volume--;
                break;
        }
    }
}
