import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Shark shark = new Shark("Greg", 10);
        Shark Daddyshark = new Shark("Daddy", 16);
        Shark Mommyshark = new Shark("Mommy", 13);
        addObject(shark,255,173);
        addObject(Daddyshark, 150,150);
        addObject(Mommyshark, 200, 200);
        FastFish fastFish = new FastFish();
        addObject(fastFish,158,96);
        FastFish fastFish2 = new FastFish();
        addObject(fastFish2,408,104);
        FastFish fastFish3 = new FastFish();
        addObject(fastFish3,466,80);
        SlowFish slowFish = new SlowFish();
        addObject(slowFish,538,266);
        SlowFish slowFish2 = new SlowFish();
        addObject(slowFish2,152,293);
        SlowFish slowFish3 = new SlowFish();
        addObject(slowFish3,312,301);
        SlowFish slowFish4 = new SlowFish();
        addObject(slowFish4,129,284);
        SlowFish slowFish5 = new SlowFish();
        addObject(slowFish5,283,291);
    }
}
