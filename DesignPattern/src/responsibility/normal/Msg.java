package responsibility.normal;

public class Msg {
    private String message;

    Msg(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MSG { message = '" + this.message + "\' }";
    }
}
