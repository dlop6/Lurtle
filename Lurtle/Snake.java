import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Animal
{
    public void act()
    {
        move(4);
        randomTurn();
        turnAtEdge();
        tryToEatTurtle();
    }
    
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn( Greenfoot.getRandomNumber(40)-20 );
        }        
    }
    
    public void turnAtEdge()
    {
        if (atWorldEdge())
        {
            turn(7);
        }
    }
    
    public void tryToEatTurtle()
    {
        if (canSee(Turtle.class) )
        {
            eat(Turtle.class);
        }
    }
}
