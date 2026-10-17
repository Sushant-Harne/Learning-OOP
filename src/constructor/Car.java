package constructor;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;

    Car(String model,String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car(String model,int maxSpeed) {
        this(model,"grey",maxSpeed);
    }

    Car(String model){
        this(model,"grey",180);
    }

    public void showCar() {
        System.out.println(String.format("This is %s color %s with maxspeed %d",this.color,this.model,this.maxSpeed));
    }
}
