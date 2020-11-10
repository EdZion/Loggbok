public class Loggbok {
    private String time;
    private String text;
    private String log;

    public Loggbok(String time, String text, String log) {
        this.time = time;
        this.text = text;
        this.log = log;
    }

    public String getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public String getLog() {
        return log;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Override
    public String toString() {
        return "Loggbok{" +
                "log='" + log + '\'' +
                '}';
    }
}
