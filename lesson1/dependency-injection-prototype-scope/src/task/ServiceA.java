package task;

public class ServiceA{

    private final String string;

    public ServiceA(String string) {
        this.string = string;
    }

    public String getResponse() {
        return string;
    }
}
