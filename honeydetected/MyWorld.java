import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    honung honung = new honung();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(80, 70, 10); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        gubbe gubbe = new gubbe();
        addObject(gubbe,65,87);
        gubbe.setLocation(8,8);
        fly fly = new fly();
        addObject(fly,35,9);
        fly.setLocation(31,9);
        fly.setLocation(33,9);
        gubbe.setLocation(40,58);
        fly.setLocation(5,8);
        honung honung = new honung();
        addObject(honung,39,9);
        honung.setLocation(38,8);
        removeObject(honung);
    }

    public void act()
    {
        addObject(honung, Greenfoot.getRandomNumber(70), Greenfoot.getRandomNumber(70));
    }
}
