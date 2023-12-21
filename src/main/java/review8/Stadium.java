package review8;

public class Stadium {
    public static void main(String[] args) {

        Sport sport1=new Sport("Football", "Inter");
        sport1.numberOfPlayers=11;
        sport1.watch("iPhone");
        sport1.play();

        Sport sport2=new Sport("Basketball", "Chicago Bulls", "McNeal", "Chicago", 15);

        sport2.play();
    }
}
