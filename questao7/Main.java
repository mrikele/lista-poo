package questao7;

public class Main {
    public static void main(String[] args) { 
        YoutubeVideo youtube = new YoutubeVideo(); 
        FaceVideo face= new FaceVideo(); 
        VideoPlayer videoP = new VideoPlayer(youtube);
        
        System.out.println(youtube); 
        System.out.println(face);
        System.out.println(videoP); 
    }
}
