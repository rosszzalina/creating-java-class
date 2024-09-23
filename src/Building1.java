public class Building1 {

    private String name;
    private int floors;
    private double height;
    private String location;

    public Building1() {
        this.name = "null";
        this.floors = 0;
        this.height = 0.0;
        this.location = "null";
    }

    public Building1(String name, int floors, double height, String location) {
        this.name = name;
        this.floors = floors;
        this.height = height;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Building Name: " + name);
        System.out.println("Floors: " + floors);
        System.out.println("Height: " + height + " meters");
        System.out.println("Location: " + location);
    }

    public void updateHeight(double newHeight) {
        if (newHeight > height) {
            height = newHeight;
            System.out.println("The updated  height is " + height + " meters.");
        } else {
            System.out.println("The new height must be greater than the current height.");
        }
    }

    public static void main(String[] args) {
        Building1 defaultBuilding = new Building1();
        defaultBuilding.displayInfo();

        System.out.println();

        Building1 goldenFinance117 = new Building1("Golden Finance 117", 128, 597.0, "Tianjin, China");
        goldenFinance117.displayInfo();

        System.out.println();

        goldenFinance117.updateHeight(600.0);  // Successfully updates
        goldenFinance117.displayInfo();        // Displays updated info

        System.out.println();

        goldenFinance117.updateHeight(590.0);  // Error message
    }
}
