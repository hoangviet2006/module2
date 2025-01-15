package ss4_oop.thuc_hanh;

public class Rectangle {
    double width;
    double height;

    public Rectangle( double width, double height){
        this.height= height;
        this.width = width;
    }
    public double getArea(){
        return  this.width *  this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }
    public String displayRectangle(){
        return "Rectangle: width="+ this.width + "height="+this.height;
    }
    public Rectangle(){

    }
}
