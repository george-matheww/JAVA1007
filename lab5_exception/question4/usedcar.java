public final class usedcar {
    int vin, year, miles;
    String make;
    double price;

    public usedcar(int vin, String make, int year, int miles, double price) throws usedcarexception {
        setvin(vin);
        if (vin < 1000 && vin > 9999)
            throw (new usedcarexception());
        setmake(make);
        if (!(make.equals("Honda") || make.equals("Ford") || make.equals("Toyota") || make.equals("Chrysler") || make.equals("Other")))
            throw (new usedcarexception());
        setyear(year);
        if (year < 1997 && year > 2017)
            throw (new usedcarexception());
        setmiles(miles);
        if (miles < 0)
            throw (new usedcarexception());
        setprice(price);
        if (price < 0)
            throw (new usedcarexception());
        System.out.println(vin + " " + year + " " + miles + " " + make + " " + price);
    }

    public void setvin(int vin) {
        this.vin = vin;
    }

    public void setmake(String make) {
        this.make = make;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public void setmiles(int miles) {
        this.miles = miles;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public int getvin() {
        return vin;
    }

    public String getmake() {
        return make;
    }

    public int getyear(){
        return year;
    }
    public int getmiles(){
        return miles;
    }

    public double getprice(){
        return price;
    }
}