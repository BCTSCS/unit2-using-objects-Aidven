import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Actor{
    private Actor toppings;
    private String type;
    private int size;
    
    public Pizza(String theType, int theSize){
        type = theType;
        size = theSize;
        getImage().scale(10*size, 10*size);
        getImage().setColor(Color.BLUE);
        getImage().drawString(type,0,0);
    }
    @Override  
    protected void addedToWorld(World world){
        toppings= new Cheese();
        world.addObject( toppings, getX(), getY());

}   
}
