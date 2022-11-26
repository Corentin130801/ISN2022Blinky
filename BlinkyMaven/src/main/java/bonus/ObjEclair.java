package bonus;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjEclair extends SuperBonus {

    public ObjEclair(){
        name = "fleur";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/bonusPixel/eclair.png"));

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}


