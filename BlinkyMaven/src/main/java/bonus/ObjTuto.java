package bonus;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjTuto extends SuperBonus{

    public ObjTuto(){
        name = "tuto";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/bonusPixel/tuto.png"));

        }catch(IOException e){
            e.printStackTrace();
        }
       
        collision=true;
    }
}
