import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Animal
{
    private boolean gameOver;
    private GreenfootSound loseSound;
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
            gameOver();
        }
        
        if (canSee(Turtle.class) && !((Turtle) getOneIntersectingObject(Turtle.class)).esInmune())
        {
            eat(Turtle.class);
            gameOver();
        }
    }
    
    public void gameOver()
    {
        // Cambiar el estado del juego a "game over"
        gameOver= true;

        // Mostrar pantalla de "Game Over"
        getWorld().showText("Game Over, presiona 'R' para volver a jugar", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
        loseSound = new GreenfootSound("hell na.mp3");
        loseSound.play();
        
        // Esperar a que se presione la tecla "r" para reiniciar
        while (!Greenfoot.isKeyDown("r"))
        {
            Greenfoot.delay(1);
        }
        
        // Reiniciar el juego
        Greenfoot.setWorld(new MundoTortuga());
    }
    
}