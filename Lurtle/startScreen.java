import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends World
{
    private GreenfootSound backgroundMusic;
    private GreenfootSound menuSound;
    
    public startScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        backgroundMusic = new GreenfootSound("Jeremy Blake  Powerup  NO COPYRIGHT 8bit Music.mp3");
        backgroundMusic.playLoop();
        

    }
    
    public void act(){
        
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MundoTortuga());
            menuSound = new GreenfootSound("8 BIT MENU SELECT  Gaming Sound Effects HD FREE NO Copyright.mp3");
            menuSound.play();
            Greenfoot.delay(60); 
        }
    }
}
