package testmod;


import io.anuke.arc.graphics.g2d.*;
import io.anuke.mindustry.entities.type.base.*;

public class TestUnit extends FlyingUnit{

    //draw this unit's sprite
    @Override
    public void draw(){
        Draw.rect("test:testunit", x, y, rotation - 90);
    }
}
