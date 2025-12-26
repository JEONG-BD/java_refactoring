package factory;

public class ShapeOval extends Shape {
    protected ShapeOval(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public int getTypecode() {
        return Shape.TYPECODE_OVAL;
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        System.out.println("drawOval" + this.toString());

    }

}
