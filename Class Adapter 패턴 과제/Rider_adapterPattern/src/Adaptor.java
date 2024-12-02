public class Adaptor extends Box implements Hexahedron,Cube{

    public Adaptor(int width, int hight, int length) {
        super(width, hight, length);
    }

    private static final double INCH_TO_CM = 2.54;

    @Override
    public double getLengthforCube() {
        return super.getHeight() * INCH_TO_CM;
    }

    @Override
    public double volumeforCube() {
        return getLengthforCube() * getLengthforCube() * getLengthforCube();
    }

    @Override
    public double getWidthtoCm() {
        return super.getWidth() * INCH_TO_CM;
    }

    @Override
    public double getHeighttoCm() {
        return super.getHeight() * INCH_TO_CM;
    }

    @Override
    public double getLengthtoCm() {
        return super.getLength() * INCH_TO_CM;
    }

    @Override
    public double volumeForHexa() {
        return getWidthtoCm() * getHeighttoCm() * getLengthtoCm();
    }
}
