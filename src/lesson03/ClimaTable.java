package lesson03;

interface Climatable {
    default void climateControle(int tempr){
        System.out.println("Air condition to " + tempr);
    }

    default void climateStop(){
        System.out.println("Climate control system is turned off");
    }
}