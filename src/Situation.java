public class Situation {
    public String text;
    public Situation[] dir;
    Situation(String text, int variants){
        this.text = text;
        this.dir = new Situation[variants];
    }
}
