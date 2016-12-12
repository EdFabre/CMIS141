package discussions.wk6;

public class TestToaster {
    public static void main(String[] args) {
        Toaster toaster1 = new Toaster();
        Toaster toaster2 = new Toaster("Blue");
        Toaster toaster3 = new Toaster("Red");

        toaster1.toast();
        toaster2.toast();

        System.out.println(toaster1.toString());
        System.out.println(toaster2.toString());
        System.out.println(toaster3.toString());
    }
}
