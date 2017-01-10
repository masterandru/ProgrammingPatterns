package Bridge;

/*
 * Created by andruschenko-ip on 19.12.2016.
 */

public class SmallCircleDrawer implements Drawer{

    public static final double radiusMultiplier = 0.25;

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
    }

}
