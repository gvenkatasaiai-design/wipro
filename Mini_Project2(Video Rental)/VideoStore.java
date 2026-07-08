public class VideoStore {

    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[100];
        count = 0;
    }

    public void addVideo(String name) {
        store[count++] = new Video(name);
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    private Video findVideo(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                return store[i];
            }
        }
        return null;
    }

    public void doCheckout(String name) {
        Video v = findVideo(name);

        if (v != null) {
            v.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void doReturn(String name) {
        Video v = findVideo(name);

        if (v != null) {
            v.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video v = findVideo(name);

        if (v != null) {
            v.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {

        System.out.println("-----------------------------------------------");
        System.out.printf("%-20s %-18s %-10s\n", "Video Name", "Checkout Status", "Rating");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-18b %-10d\n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }

        System.out.println("-----------------------------------------------");
    }
}