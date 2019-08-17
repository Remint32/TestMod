package testmod;

import io.anuke.arc.graphics.g2d.*;
import io.anuke.mindustry.*;
import io.anuke.mindustry.world.*;

public class TestBlock extends Block{

    public TestBlock(String name){
        super(name);
    }

    @Override
    public void draw(Tile tile){
        //draw this block's rotated region
        Draw.rect(region, tile.drawx(), tile.drawy(), Vars.tilesize, Vars.tilesize, tile.rotation() * 90);
    }
}
