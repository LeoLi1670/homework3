public class BaseBox {

    private double length = 0;
    private double width = 0;
    private double height = 0;

    BaseBox(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public boolean validate(double length, double width, double height) {
        return length < this.length && width < this.width && height < this.height;
    }

}
