package enums;

/**
    Enums Type
        A special data type that enables for a variable to be set of predefined  constants
    Example
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
         }
    very flexible
 */
// THIS IS BAD APPROACH
interface  State{
    int STOPPED = 0;
    int STARTING = 1;
    int STARTED = 2;
}
class Machine {
    private  int state = State.STOPPED;

    public void setState(int state){ // modify the state
        //validation to access the state
        this.state = state;
    }

    public  int getState(){
        return this.state;
    }
}
public class EnumEx1 {

    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.setState(State.STARTING);
        System.out.println(machine.getState());//1
    }
}
