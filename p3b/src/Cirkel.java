public class Cirkel {
    private final int radius;
    private final int xPositie;
    private final int yPositie;

    public Cirkel(int radius, int xPositie, int yPositie) {
        if (radius == 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn");
        }

        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "radius=" + radius +
                ", xPositie=" + xPositie +
                ", yPositie=" + yPositie +
                '}';
    }
}
