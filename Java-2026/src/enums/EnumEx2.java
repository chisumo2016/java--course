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

enum  StateoBJ{
    STOPPED ,
    STARTING ,
    STARTED ,
}
class MachineObj {

    private  StateoBJ state = StateoBJ.STOPPED;

    public void setState(StateoBJ state){ // modify the state
        //validation to access the state
        this.state = state;
    }

    public  StateoBJ getState(){
        return this.state;
    }
}
public class EnumEx2 {

    public static void main(String[] args) {

        MachineObj machine = new MachineObj();
        machine.setState(StateoBJ.STARTING);
        System.out.println(machine.getState());// STARTING
    }
}
