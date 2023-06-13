interface AudioPlayer{
  void playAudio();
  void stopAudio();
  
}
interface VideoPlayer{
  void playVideo();
  void stopVideo();
  
}
class MultimediaPlayer implements AudioPlayer,VideoPlayer{
  public void playAudio(){
    System.out.println("Audio playing");
    
  }
  public void stopAudio(){
    System.out.println("Audio stopped");
}
  public void playVideo(){
    System.out.println("Video playing");
  }
  public void stopVideo(){
    System.out.println("Video stopped");
  }
}
public class Main3{
  public static void main(String[]args){
    MultimediaPlayer player=new MultimediaPlayer();
    player.playAudio();
    player.stopAudio();
  }
}
   