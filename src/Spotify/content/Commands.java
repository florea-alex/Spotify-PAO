package Spotify.content;

public abstract class Commands {

    protected int duration;
    protected int currentMinute;
    protected int currentSecond;

    public Commands() {
    }

    public Commands(int duration, int currentMinute, int currentSecond) {
        this.duration = duration;
        this.currentMinute = currentMinute;
        this.currentSecond = currentSecond;
    }

    public int getduration() {
        return duration;
    }

    public void setduration(int duration) {
        this.duration = duration;
    }

    public int getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(int currentMinute) {
        this.currentMinute = currentMinute;
    }

    public int getCurrentSecond() {
        return currentSecond;
    }

    public void setCurrentSecond(int currentSecond) {
        this.currentSecond = currentSecond;
    }

    public void skip(){
        System.out.println(">>");
        this.currentSecond += 15;
        if (this.currentSecond > 59) {
            this.currentSecond %= 60;
            ++this.currentMinute;
        }
        System.out.println("Current minute is " + this.currentMinute + " and the current second is " + this.currentSecond);
    }

    public void back() {
        System.out.println("<<");
        this.currentSecond -= 0.15;
        if (this.currentSecond < 0) {
            this.currentSecond = 60 - this.currentSecond;
            --this.currentMinute;
        }
        System.out.println("Current minute is " + this.currentMinute + " and the current second is " + this.currentSecond);
    }

    public void pause() {
        System.out.println("|>");
        System.out.println("Current minute is " + this.currentMinute + " and the current second is " + this.currentSecond);
    }

    public void resume() {
        System.out.println("||");
        System.out.println("Current minute is " + this.currentMinute + " and the current second is " + this.currentSecond);
    }

    @Override
    public String toString() {
        return "From class Commands {" +
                " the duration is " + duration +
                ", the minute is " + currentMinute +
                ", the second is " + currentSecond +
                "} ";
    }
}
