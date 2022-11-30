package bonus;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjFlower extends SuperBonus {

    public ObjFlower(){
        name = "fleur";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/bonusPixel/fleur.png"));

        }catch(IOException e){
            e.printStackTrace();
        }
        
        collision=true;
    }
}
