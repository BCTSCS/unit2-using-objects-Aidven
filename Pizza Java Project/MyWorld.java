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
        Pizza pizza1 = new Pizza("Pepperoni", 5);
        Pizza pizza2 = new Pizza("Veggie", 8);
        addObject(pizza1, 100, 100);
        addObject(pizza2, 250, 300);
    }
}
