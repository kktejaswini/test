package interfaces;

import com.wipro.interfaces.Playable;
import com.wipro.interfaces.Saxophone;
import com.wipro.interfaces.Veena;

public class problem1 {
	public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps;
        pv = new Veena();
        ps = new Saxophone();
        
        v.play(); 
        s.play(); 
        pv.play();
        ps.play();
        
    }
}
class Veena implements Playable {
	public void play() {
        System.out.println("Violin is being played");
    }
}
class Saxophone implements Playable {
	public void play() {
        System.out.println("Saxophone is being played");
    }
}
interface Playable {
	public void play();
}
