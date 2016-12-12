package homeworks.hw3;

/**
 * This class represents a pair of headphones and it's behaviors.
 *
 * @author Ed Fabre
 */
public class HeadPhone {

    // Class variables
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    private int volume = MEDIUM;
    private boolean pluggedIn = false;
    private boolean bluetoothEnabled;
    private boolean noiseCancelling;
    private String manufacturer;
    private String headPhoneColor;

    /**
     * This is the default no argument constructor which creates generic
     * headphone.
     */
    public HeadPhone() {
        this.manufacturer = "Radio Shack";
        this.headPhoneColor = "Black";
        this.bluetoothEnabled = false;
        this.noiseCancelling = false;
    }

    /**
     * This constructor takes arguments to create custom headphone.
     *
     * @param manufacturer
     * @param headPhoneColor
     * @param bluetoothEnabled
     * @param noiseCancelling
     */
    public HeadPhone(String manufacturer, String headPhoneColor,
            boolean bluetoothEnabled, boolean noiseCancelling) {

        this.manufacturer = manufacturer;
        this.headPhoneColor = headPhoneColor;
        this.bluetoothEnabled = bluetoothEnabled;
        this.noiseCancelling = noiseCancelling;
    }

    /**
     * Changes the volume of the headphone.
     *
     * @param value
     */
    public void changeVolume(int value) {
        setVolume(value);
    }

    /**
     * Returns the volume of the headphone.
     *
     * @return
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the headphone.
     *
     * @return
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Returns whether or not the headphone is plugged in.
     *
     * @return
     */
    public boolean isPluggedIn() {
        return pluggedIn;
    }

    /**
     * Sets whether or not the headphone is plugged in.
     *
     * @return
     */
    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    /**
     * Returns whether or not the headphone is bluetooth enabled. This
     * particular method is public only because we want users to grab this info.
     *
     * @return
     */
    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    /**
     * Sets whether or not the headphone is bluetooth enabled. This
     * particular method is private because the manufacturer decides this.
     *
     * @return
     */
    private void setBluetoothEnabled(boolean bluetoothEnabled) {
        this.bluetoothEnabled = bluetoothEnabled;
    }

    /**
     * Returns whether or not the headphone is noise canceling. This
     * particular method is public only because we want users to grab this info.
     *
     * @return
     */
    public boolean isNoiseCancelling() {
        return noiseCancelling;
    }

    /**
     * Sets whether or not the headphone is noise canceling. This
     * particular method is private because the manufacturer decides this.
     *
     * @return
     */
    private void setNoiseCancelling(boolean noiseCancelling) {
        this.noiseCancelling = noiseCancelling;
    }

    /**
     * Returns the name of the headphone's manufacturer.
     *
     * @return
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the name of the headphone's manufacturer.
     *
     * @return
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Returns the color of the headphone.
     *
     * @return
     */
    public String getHeadPhoneColor() {
        return headPhoneColor;
    }

    /**
     * Sets the color of the headphone.
     *
     * @return
     */
    public void setHeadPhoneColor(String headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }

    /**
     * Returns a neatly formatted string that calls on all the getters of this
     * class.
     *
     * @return
     */
    @Override
    public String toString() {
        return "HeadPhone{" + "\n"
                + "Volume: " + getVolume() + "\n"
                + "Plugged In: " + isPluggedIn() + "\n"
                + "Manufacturer: " + getManufacturer() + "\n"
                + "Color of Headphones: " + getHeadPhoneColor() + "\n"
                + "Bluetooth Ready: " + isBluetoothEnabled()+ "\n"
                + "Noise Canceling: " + isNoiseCancelling()+ "\n"
                + '}';
    }

}
