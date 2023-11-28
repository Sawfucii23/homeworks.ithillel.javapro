package homeworks;

import homeworks.hw10.ValueCalculator;
import homeworks.hw12.CollectionMethodsHw12;
import homeworks.hw3.Car;
import homeworks.hw4.Animal;
import homeworks.hw4.Cat;
import homeworks.hw4.Dog;
import homeworks.hw5.frst.Circle;
import homeworks.hw5.frst.ForFigure;
import homeworks.hw5.frst.Square;
import homeworks.hw5.frst.Triangle;
import homeworks.hw5.scnd.Barrier;
import homeworks.hw5.scnd.Participant;
import homeworks.hw5.scnd.Racetrack;
import homeworks.hw5.scnd.Wall;
import homeworks.hw6.HomeWorkApp;
import homeworks.hw7.StringMethods;
import homeworks.hw8.ArrayValueCalculator;
import homeworks.hw8.Exeptionshw8.ArrayDataException;
import homeworks.hw8.Exeptionshw8.ArraySizeExeption;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application {
    public static void main(String[] args)  {

        System.out.println("HW4");
        System.out.println();

        List<Animal>animals = new ArrayList<Animal>();
        animals.add(new Cat("cat1", "black"));
        animals.add(new Cat("cat2", "white"));
        animals.add(new Cat("cat3", "blue"));
        animals.add(new Dog("dog1", 3));
        animals.add(new Dog("dog2", 7));
        animals.add(new Dog("dog3", 10));

        for (int x  = 0; x < animals.size(); x++){
            System.out.println(animals.get(x).show());
            animals.get(x).run();
            animals.get(x).swim();
        }

        Animal.howMany();
        Cat.howMany();
        Dog.howMany();


        System.out.println();
        System.out.println("HW3");
        System.out.println();

        Car audir8 = new Car("audir8", 380);

        System.out.println(audir8.show());
        audir8.start();

        System.out.println();
        System.out.println("hw5(1)");
        System.out.println();
        ArrayList<ForFigure>figures = new ArrayList<ForFigure>();
        figures.add(new Circle(1.5));
        figures.add(new Triangle(12,13,14));
        figures.add(new Square(5));

        System.out.println(squareOfAllFigurehw5(figures));


        System.out.println();
        System.out.println("hw5(2)");
        System.out.println();


        ArrayList<Participant>participants = new ArrayList<Participant>();
        ArrayList<Barrier>barriers = new ArrayList<Barrier>();

        participants.add(new Participant("Cat",10, 2.0, true));
        participants.add(new Participant("Person",15, 1.0, true));
        participants.add(new Participant("Robot",5,1.5, true));

        barriers.add(new Racetrack("racetrack1", 0.5));
        barriers.add(new Racetrack("racetrack2", 0.75));
        barriers.add(new Wall("wall1", 1.5));
        barriers.add(new Wall("wall1", 1.2));

        System.out.println(race1(participants,barriers));

        soutFellNotFell(participants);

        System.out.println();
        System.out.println("hw7");
        System.out.println();
        System.out.println(StringMethods.findSymbolOccurance("sssttsss", 's'));
        System.out.println(StringMethods.findWordPosition("Hello", "ello"));
        System.out.println(StringMethods.findWordPosition("Hello", "y"));
        System.out.println(StringMethods.stringReverse("Hello"));
        System.out.println(StringMethods.isPalindrome("ugu"));
        System.out.println(StringMethods.isPalindrome("uuuuuu"));
        System.out.println(StringMethods.isPalindrome("1234"));
        //StringMethods.stringGame();

        System.out.println();
        System.out.println("hw8");
        System.out.println();
        String[][] example = {{"1", "2", "3","3"}, {"4", "5", "6", "5"}, {"7", "8", "9", "4"}, {"4", "5", "6", "6"}};
        try {
            System.out.println(ArrayValueCalculator.doCalc(example));
        }
        catch (NumberFormatException e){

        }
        catch (ArrayDataException e) {
            System.out.println(e.getMessage());
        }
        catch (ArraySizeExeption e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("hw10");
        System.out.println();

        try {
            ValueCalculator vc = new ValueCalculator(1230000);
            vc.method();
        } catch (ArraySizeExeption e) {
            throw new RuntimeException(e);
        }

    }




    public static double squareOfAllFigurehw5(ArrayList<ForFigure>figures){
        double squareSum = 0;

        for (int x = 0; x < figures.size(); x ++){
            if (figures.get(x) instanceof Circle){
                squareSum += ((Circle) figures.get(x)).square();
            }
            else if (figures.get(x) instanceof Square){
                squareSum += ((Square) figures.get(x)).square();
            }
            else if (figures.get(x) instanceof Triangle){
                squareSum += ((Triangle) figures.get(x)).square();
            }
        }
        return squareSum;
    }
    public static ArrayList<Double>race(ArrayList<Participant>participants, ArrayList<Barrier>barriers, int raceDistance){
        ArrayList<Double>raceTimeInfo = new ArrayList<Double>();
        double time = 0;

        for (int x = 0; x < participants.size(); x++){
            time = 0;
            for (int y = 0; y < barriers.size(); y++){
                if (barriers.get(y) instanceof Racetrack){
                    participants.get(x).run(((Racetrack)barriers.get(y)));

                }
                else if (barriers.get(y) instanceof  Wall){
                    participants.get(x).jump( ((Wall)barriers.get(y)),time  );
                }
            }
            time += raceDistance/participants.get(x).getSpeedKmPH();
            raceTimeInfo.add(time);
            System.out.println(participants.get(x).getName());
        }

        return raceTimeInfo;
    }

    public static HashMap<String,Double> race1(ArrayList<Participant>participants, ArrayList<Barrier>barriers){
        HashMap<String,Double>raceTimeInfo = new HashMap<String,Double>();
        double time = 0;

        for (int x = 0; x < participants.size(); x++){
            time = 0;
            for (int y = 0; y < barriers.size(); y++){
                if (barriers.get(y) instanceof Racetrack){
                    if (participants.get(x).isStand()) {
                        participants.get(x).run(((Racetrack) barriers.get(y)));
                        time += (((Racetrack) barriers.get(y)).getDistance() /participants.get(x).getSpeedKmPH());
                    }
                }
                else if (barriers.get(y) instanceof  Wall){
                    if (participants.get(x).isStand()) {
                        participants.get(x).jump1(((Wall) barriers.get(y)));
                        if (participants.get(x).isStand()){
                            time += 0.1;
                        }
                        else {
                            time += 0.2;
                        }
                    }
                }
            }

            raceTimeInfo.put(participants.get(x).getName(), time);
            System.out.println(participants.get(x).getName());

        }

        return raceTimeInfo;
    }

    public static void soutFellNotFell(ArrayList<Participant>participants){
        String tmp = "";
        for (int x = 0; x < participants.size(); x++){
            if (participants.get(x).isStand()){
                tmp = "стоїть";
            }
            else tmp = "не встояв";
            System.out.println(participants.get(x).getName() + ": " + tmp);
        }
    }






}
