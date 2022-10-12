package javacore.net;

public class JavaThePillars {
    static void run() {
        Car myLamborghini = new Car(
                "Lamborghini",
                "Aventador S.",
                "yellow",
                "V12 6.5L",
                4,
                100,
                4e9);
        myLamborghini.print();
        myLamborghini.move(105);
        myLamborghini.print();
        myLamborghini.move(50);
        myLamborghini.print();
    }
}
