package super_team;

import java.util.Scanner;

public class Lorry {

    private int id;
    private String nameOfLorry;
    private String nameOfDriver;
    private State state;
    public Lorry() {
    }

    public static Lorry makeLorry(int id, String nameOfLorry, String nameOfDriver, State states) {
        Lorry lorry = new Lorry();
        lorry.id = id;
        lorry.nameOfLorry = nameOfLorry;
        lorry.nameOfDriver = nameOfDriver;
        lorry.state= states;
        return lorry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfLorry() {
        return nameOfLorry;
    }

    public void setNameOfLorry(String nameOfLorry) {
        this.nameOfLorry = nameOfLorry;
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void drivers(){
        System.out.printf(id + "   " + nameOfDriver +"            " + nameOfLorry+"\n");
    }

    public void changeDriver(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Замена водителя - " + id + "\n Введите имя нового водителя:");
        setNameOfDriver(sc.nextLine());
        System.out.printf(id + "   " + nameOfDriver +"            " + nameOfLorry+"\n");
    }

    public void startDriving(){
        System.out.printf(getNameOfDriver() + " start Driving: " + getNameOfLorry());
    }

    public void startRepair(){

    }
    @Override
    public String toString() {
        return id + "   " + nameOfLorry +"                  " + state;
    }
}
