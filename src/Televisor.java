public class Televisor {
    boolean isWorking;

    public Televisor() {
        this.isWorking = false;
    }

    boolean turnOn() {
        return isWorking = true;
    }

    boolean turnOff() {
        return isWorking = false;
    }

    boolean showStatus(){
        return isWorking;
    }
}
