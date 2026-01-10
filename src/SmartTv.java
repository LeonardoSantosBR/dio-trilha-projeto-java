/**
 * @author Leonardo Santos
 * @version 1.0
 * @since 09/01/2026
 *
 */
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

    /**
     * @param state estado atual da Tv.
     */
    public void turnOnOrOff(boolean state) {
        isOn = state;
    }

    /**
     * @param newChannel novo canal selecionado.
     */
    public void changeChannelTo(int newChannel) {
        channel = newChannel;
    }

    /**
     * @param action aumentar ou diminuir o canal, (INCREMENT,DECREMENT).
     */
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

    /**
     * @param action aumentar ou diminuir o volume, (INCREMENT,DECREMENT).
     */
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
