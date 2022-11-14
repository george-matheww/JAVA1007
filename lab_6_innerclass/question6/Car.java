public class Car {
    int num;
    private class Engine{
        public void print(){
            System.out.println("this is Engine class inside the CAR class");
        }
    }
    void display_Inner(){
        Engine zenengine = new Engine();
        zenengine.print();
    }
}
