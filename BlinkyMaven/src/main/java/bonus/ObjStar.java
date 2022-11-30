package bonus;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjStar extends SuperBonus{

    public ObjStar(){
        name = "etoile";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/bonusPixel/etoile.png"));

        }catch(IOException e){
            e.printStackTrace();
        }
       
        collision=true;
    }
}


