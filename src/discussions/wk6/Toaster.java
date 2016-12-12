package discussions.wk6;

public class Toaster {

    // Feilds
    private boolean isOn;
    private int durability, cookTime;
    private String color;

    /**
     * Default no arg constructor.
     */
    public Toaster() {
        isOn = false;
        durability = 100;
        color = "Black";
    }

    /**
     * This constructor allows user to select color.
     * @param isOn
     * @param durability
     * @param color
     */
    public Toaster(String color) {
        isOn = false;
        durability = 100;
        this.color = color;
    }

    /**
     * This method acts as an on off switch for the toaster object.
     */
    private void turnOnOff() {
        isOn = isOn == false;
    }

    /**
     * This method handles toasting a piece of toast. If the toaster is not
     * already on, this method will turn it on.
     */
    public void toast() {
        if (!getIsOn()) {
            turnOnOff();
        }
        // With each use durability of toaster is reduced.
        setDurability(durability-1);
        // Default toast time is 1 minute or 60 seconds.
        setCookTime(60);
    }

    // Getters and setters for this project.
    private boolean getIsOn() {
        return isOn;
    }

    private int getDurability() {
        return durability;
    }

    private void setDurability(int durability) {
        this.durability = durability;
    }

    private int getCookTime() {
        return cookTime;
    }

    private void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    private String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    /**
     * This method overrides the native toString() which will aid in testing.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Toaster{" + "isOn=" + isOn + ", durability=" + durability + ", cookTime=" + cookTime + ", color=" + color + '}';
    }
}
