import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fly extends Actor
{
    /**
     * Act - do whatever the fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(1);
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(90));
        }
    }    
}
