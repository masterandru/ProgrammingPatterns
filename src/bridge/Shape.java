package Bridge;
/*
 * Created by andruschenko-ip on 19.12.2016.
*/

public abstract class Shape {

    protected Drawer drawer;

    protected Shape(Drawer drawer){
        this.drawer = drawer;
    }

    public abstract void draw();

    public abstract void enlargeRadius(int multiplier);

}
