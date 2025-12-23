package after;

public class ShapeLine extends Shape{
    @Override
    public int getTypecode() {
        return 0;
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine" + this.toString());
    }

    protected ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }
}
