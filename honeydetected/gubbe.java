import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gubbe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gubbe extends Actor
{   
    int speed = 1;
    int score = 0;
    /**
     * Act - do whatever the gubbe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        move();
        lookForHoney();
        lookForFly();
    }    
    public void move() {
     if(Greenfoot.isKeyDown("D"))
     {
         setRotation(0);
         move(speed);
     }
     if(Greenfoot.isKeyDown("A"))
     {
         setRotation(180);
         move(speed);
     }
     if(Greenfoot.isKeyDown("W"))
     {
         setRotation(270);
         move(speed);
     }
     if(Greenfoot.isKeyDown("S"))
     {
         setRotation(90);
         move(speed);
     }
          if(Greenfoot.isKeyDown("space"))
     {
         move(speed*2);
     }
    }
    public void lookForFly()
    {
        if(isTouching(fly.class))
        {
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().removeObject(this);
            
        }
    }
    public void lookForHoney()
    {
        if(isTouching(honung.class))
        {
            score++;
            removeTouching(honung.class);
            getWorld().showText(Integer.toString(score), 1, 1);
        }
    }
}
