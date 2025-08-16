package LLD.DesignPatterns.creationalDP.Builder;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    private Car(Builder builder){
        this.engine=builder.engine;
        this.wheels=builder.wheels;
        this.seats=builder.seats;
        this.color=builder.color;
        this.sunroof=builder.sunroof;
        this.navigationSystem=builder.navigationSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                '}';
    }

    public static class Builder{
        private String engine;
        private int wheels;
        private int seats;
        private String color;
        private boolean sunroof;
        private boolean navigationSystem;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheels(int wheels) {
            this.wheels = wheels;

            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;

            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }
        
        public Car build(){
            return new Car(this);
        }
    }
}
