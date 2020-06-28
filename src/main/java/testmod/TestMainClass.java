package testmod;

import arc.util.*;
import mindustry.content.*;
import mindustry.mod.*;
import mindustry.type.*;
import mindustry.world.*;

public class TestMainClass extends Mod{
    //public Block testBlock;
    //public UnitType testUnit;

    //called at game initialization, load content here
    @Override
    public void init(){
        Log.info("testmod::init() has been called.");

        /*testBlock = new TestBlock("test:testblock"){{
            requirements(Category.distribution, ItemStack.with(Items.titanium, 100));

            solid = true;
            update = true;
            rotate = true;
        }};

        testUnit = new UnitType("test:testunit", TestUnit::new){{
            speed = 0.3f;
            maxVelocity = 1.9f;
            drag = 0.01f;
            mass = 1.5f;
            flying = true;
            health = 75;
            engineOffset = 5.5f;
            range = 140f;
            weapon = new Weapon("chain-blaster"){{
                length = 1.5f;
                reload = 28f;
                alternate = true;
                ejectEffect = Fx.shellEjectSmall;
                bullet = Bullets.lancerLaser;
            }};
        }};*/
    }

    //called after all mods have been loaded
    //@Override
    /*public void postInit(){
        Log.info("testmod::postinit() has been called.");
    }*/
}
