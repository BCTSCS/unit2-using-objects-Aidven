import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordGames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordGames extends Actor
{
    private GreenfootImage img;
    private String word;
    
    public WordGames(String text){
        word = text;
        img = new GreenfootImage(word, 24, Color.BLACK, Color.WHITE);
        setImage(img);
}
    /**
     * Act - do whatever the WordGames wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        word = scramble();
        img = new GreenfootImage(word,24,Color.BLUE, Color.WHITE);
        setImage(img);
        Greenfoot.delay(100);
    
        bananaSplit("e","World");
        Greenfoot.delay(100);
    }
    
    public String scramble(){
        return word.substring(word.length()/2)+ word.substring(0,word.length()/2);
    }
    
    public String bananaSplit(int index, String insertText){
        word = word.substring(0,index) + insertText + word.substring(index);
        img = new GreenfootImage(word,24,Color.BLUE, Color.WHITE);
        setImage(img);
        return word;
    }
    
    public String bananaSplit(String insertChar, String insertText){
        word = word.substring(0,word.indexOf(insertChar)) + insertText + word.substring(word.indexOf(insertChar));
        img = new GreenfootImage(word,24,Color.BLUE, Color.WHITE);
        setImage(img);
        return word;
    }
    
    public String toString(){
        return "[" + word + "]";
    }
}
