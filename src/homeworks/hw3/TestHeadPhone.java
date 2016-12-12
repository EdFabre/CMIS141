package homeworks.hw3;

/**
 * This class will be used to test the HeadPhone class and it's behaviors. I am
 * using some real headphones and their manufacturers for some added realism.
 *
 * @author Ed Fabre
 */
public class TestHeadPhone {
    public static void main(String[] args) {
        // Create the headphones.
        HeadPhone hesh2 = new HeadPhone();
        HeadPhone soundLink = new HeadPhone("Bose", "White", true, true);
        HeadPhone btStudio = new HeadPhone("Beats", "Rose Gold", true, true);

        // Test Setters on each headphone.
        hesh2.setHeadPhoneColor("Red");
        hesh2.setManufacturer("Skull Candy");
        hesh2.setPluggedIn(true);
        hesh2.setVolume(3);

        soundLink.setHeadPhoneColor("Purple");
        soundLink.setManufacturer("Sony");
        soundLink.setPluggedIn(false);
        soundLink.setVolume(1);

        btStudio.setHeadPhoneColor("Green");
        btStudio.setManufacturer("Sennheiser");
        btStudio.setPluggedIn(true);
        btStudio.setVolume(2);

        // Now that the setter has been used on all objects, we can now call
        // toString() on each object which invokes all the getter methods.

        System.out.println(hesh2.toString());
        System.out.println(soundLink.toString());
        System.out.println(btStudio.toString());

    }
}
