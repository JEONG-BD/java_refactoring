package step1;

public abstract class Shape {

    protected final int _startx;
    protected final int _starty;
    protected final int _endx;
    protected final int _endy;

    protected Shape(int startx, int starty, int endx, int endy) {
        this._startx = startx;
        this._starty = starty;
        this._endx = endx;
        this._endy = endy;
    }

    public static Shape createLine(int startx, int starty, int endx, int endy){
        return new ShapeLine(startx, starty, endx, endy);
    }
    public static Shape createRectangle(int startx, int starty, int endx, int endy){
        return new ShapeRectangle(startx, starty, endx, endy);
    }
    public static Shape createOval(int startx, int starty, int endx, int endy){
        return new ShapeOval(startx, starty, endx, endy);
    }



    public abstract String getName();

    public abstract void draw();

    @Override
    public String toString() {
        return "Main{" +
                " " + getName() +
                ", (" + _startx +
                ", " + _starty + ") ," +
                " (" + _endx +
                ", " + _endy + ")" +
                '}';
    }


}
