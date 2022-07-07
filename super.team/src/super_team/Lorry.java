package super_team;

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

//    public Lorry(int id, String nameOfLorry, String nameOfDriver, State state) {
//        this.id = id;
//        this.nameOfLorry = nameOfLorry;
//        this.nameOfDriver = nameOfDriver;
//        this.state = state;
//    }


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

    @Override
    public String toString() {
        return id + "   " + nameOfLorry +"                  " + state;
    }
}
