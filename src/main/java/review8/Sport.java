package review8;

public class Sport {

    static boolean fan;

    String type, teamName;
    int numberOfPlayers;
    String location;
    String coach;

    Sport(String type, String teamName){
        this.type=type;
        this.teamName=teamName;
    }

    Sport(String type, String teamName, String coach, String location, int numberOfPlayers){
        this(type, teamName);
        this.numberOfPlayers=numberOfPlayers;
        this.coach=coach;
        this.location=location;

    }

    public void play(){
        System.out.println("Playing "+type);
    }

    void watch(String stream){
        System.out.println("Watching "+type+" on "+stream);
    }

}
