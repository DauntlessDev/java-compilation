package brave;
import leuterio.*;
public class SportsCar extends Car implements SoundSystem, Engine{
    @Override
    public void createPlaylist(){
        System.out.println("brave");
    }
    @Override
    public void setVolume(){
        System.out.println("brave");
    }
    public void setVolume(int brave){
        System.out.println("brave");
    }
    @Override
    public void accelerate(){
        System.out.println("Brave");
    }
    @Override
    public void run(){
        System.out.println("Brave");
    }
}
