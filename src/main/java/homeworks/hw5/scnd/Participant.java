package homeworks.hw5.scnd;

public class Participant implements Jumper, Runner{
    private String name;
    private double speedKmPH;
    private double jumpHigh;
    private boolean stand;


    public boolean isStand() {
        return stand;
    }

    public void setStand(boolean stand) {
        this.stand = stand;
    }

    public double getJumpHigh() {
        return jumpHigh;
    }

    public void setJumpHigh(double jumpHigh) {
        this.jumpHigh = jumpHigh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedKmPH() {
        return speedKmPH;
    }

    public void setSpeedKmPH(double speedKmPH) {
        this.speedKmPH = speedKmPH;
    }

    public Participant(String name, double speedKmPH, double jumpHigh, boolean stand) {
        this.name = name;
        this.speedKmPH = speedKmPH;
        this.jumpHigh = jumpHigh;
        this.stand = stand;
    }
    public String show(){
        return this.name + " " + this.speedKmPH;
    }

    @Override
    public void jump(Wall wall, double time) {
        if (this.jumpHigh < wall.getHigh()){
            time += 0.2;
            //System.out.println("fall");
        }
        //else System.out.println("jump");
        else time += 0.1;
    }



    @Override
    public void jump1(Wall wall) {
        if (this.jumpHigh < wall.getHigh()){

            //System.out.println("fall");
            this.stand = false;
        }
        //else System.out.println("jump");

    }


    @Override
    public void run(Racetrack racetrack) {
        //System.out.println("run");

    }

}
