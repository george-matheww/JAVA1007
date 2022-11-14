import java.util.*;
public class TeeShirt {
    private int orderNumber;
    private String size;
    private String color;
    private double price;

    public void setOrderNumber(int num) {
        orderNumber=num;
    }

    public void setSize(String sz) {
        size=sz;
    }

    public void setColor(String colour) {
        color=colour;
    }

    public int getOrderNumber() {
        return(orderNumber);
    }

    public String getSize() {
        return(size);
    }

    public String getColor() {
        return(color);
    }

    public double getPrice(){
        double xx=22.88;
        double rest=18.88; 
        if (size.equals("XXL") || size.equals("XXXL")){
            return(xx);
        }
        else {
            return(rest);
        }
    }
}
