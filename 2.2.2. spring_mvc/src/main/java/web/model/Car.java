package web.model;

public class Car {
    private String name;
    private String model;
    private String number;
    public Car(){}
    public Car(String name, String model, String number){
        this.number=number;
        this.name=name;
        this.model=model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return name= " " + name + '\'' +
                ", model='" + model + '\'' +
                ", number='" + number;
    }
}
