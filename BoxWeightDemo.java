public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight bw1 = new BoxWeight();
        System.out.println("Aryaveer Sharma 24csu306");
        System.out.println("Box 1 Volume: " + bw1.volume());
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(2.5f, 3.0f, 4.0f, 10.5f);
        System.out.println("Box 2 Volume: " + bw2.volume());
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight(bw2);
        System.out.println("Box 3 Volume: " + bw3.volume());
        bw3.displayWeight();

        bw1.setWidth(5.0f);
        bw1.setHeight(4.0f);
        bw1.setDepth(3.0f);
        bw1.setWeight(8.0f);
        System.out.println("Updated Box 1 Volume: " + bw1.volume());
        bw1.displayWeight();
    }
}
