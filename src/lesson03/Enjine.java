package lesson03;

class Engine {
    private double volume;

    public Engine(double volume) {
        this.volume = volume;
    }

    public void startEngine(){
        System.out.println("Engine is starting...");
    }

    public void stopEngine(){
        System.out.println("Engine is stopped...");
    }
}