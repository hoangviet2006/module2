package ss6_ke_thua.thuc_hanh;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }
    public double getSize(){
        return getWidth();
    }
    public void setSize(double size){
        setWidth(size);
        setLength(size);
    }
    @Override
    public void setWidth(double with){
        setSize(with);
    }
    @Override
    public void setLength(double length){
        setSize(length);
    }
    @Override
    public String toString(){
        return "A Square with size: "+ getSize()+ ", which is a subclass of "+ super.toString();
    }


}
