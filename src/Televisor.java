public class Televisor {
    boolean isWorking;

    void turnOn() {
        isWorking = true;
    }

    void turnOff() {
        isWorking = false;
    }

    boolean showStatus() {
        return isWorking;
    }
}
