package homework_Week7;

public class WallArea {
    double width;
    double height;

    public WallArea(){

    }
    public WallArea(double width, double height){
        this.height = height;
        this.width = width;
        if (this.height <0 ){
            height = 0;
        }else if (this.width <0)
            width = 0;
    }
    public double getWidth(){

        return width;
    }
    public double getHeight(){

        return height;
    }

    public void setWidth(double width1){
        width = width1;

        if(width <0){
            width = 0;
        }

    }
    public void setHeight(double height1){
        height = height1;
        if (height<0){
            height = 0;

        }

    }
    public double getArea(){
        return width*height;
    }




}