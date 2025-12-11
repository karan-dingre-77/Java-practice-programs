package OOPs;

interface Play{
    void videoPlayer();
    void musicPlayer();
    default void playable(){
        System.out.println("default playable method in the Play interface ");
        play();
    }
    static void playing(){
        System.out.println("static playing method in the play interface");
    }
    private void play(){
        System.out.println("private play method in the paly interface");
    }
}
class PlayClass implements Play{
    public void videoPlayer(){
        System.out.println("videoPlayer");
    }
    public void musicPlayer(){
        System.out.println("musicPlayer");
    }
}

public class eg15 {
    public static void main(String[] args) {
        PlayClass playClass = new PlayClass();
        playClass.playable();
        playClass.musicPlayer();
        Play.playing();
        playClass.musicPlayer();
        playClass.videoPlayer();
    }
}
