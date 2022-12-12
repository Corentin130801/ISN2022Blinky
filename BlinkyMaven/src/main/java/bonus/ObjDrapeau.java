package bonus;
import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjDrapeau extends SuperBonus{ 
	 public ObjDrapeau(){
	name = "drapeau";
try {
    image = ImageIO.read(getClass().getResourceAsStream("/bonusPixel/Flag_2_.png"));

}catch(IOException e){
    e.printStackTrace();
}
	
	collision=true;
}
}


