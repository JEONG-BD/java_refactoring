package after;

public class ShapeRectangle extends Shape{
    @Override
    public int getTypecode() {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public void draw() {
        System.out.println("drawRectangle" + this.toString());
    }

    protected ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }


}
