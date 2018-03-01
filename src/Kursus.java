public class Kursus {

    private String navn;
    private Ugedage ugedag;
    private KursusType kursusType;
    private int startTime, startMinut;
    private Unge[] brugereArray;
    private Underviser underviser;

    public Kursus(String navn) {
        this.navn = navn;
    }

}
