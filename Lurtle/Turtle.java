import greenfoot.*; 

public class Turtle extends Animal
{
    public void act()
    {
        move(4);
        checkKeys();
        tryToEatLettuce();
    }
    
    //Recibir entrada
    public void checkKeys()
    {
        if ( Greenfoot.isKeyDown("left") )
        {
            turn(-5);
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            turn(5);
        }
    }
    

    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class) )
        {
            eat(Lettuce.class);
        }
    }
}
