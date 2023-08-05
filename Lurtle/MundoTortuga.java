import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage
import java.util.Random;; // imports Random

public class MundoTortuga extends World
{
    //Crear el mundo
    public MundoTortuga() 
    {
        super(800, 700, 1);
        
        
        preparar();
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void preparar()
    {
        Random random = new Random();
        Turtle turtle = new Turtle();
        addObject(turtle, 200, 200);

        for (int i = 0; i < 10; i++) {
            Lettuce lettuce = new Lettuce();
            addObject(lettuce, random.nextInt(getWidth()), random.nextInt(getHeight()));

        }

        Snake snake = new Snake();
        addObject(snake, 456, 73);
        Snake snake2 = new Snake();
        addObject(snake2, 72, 396);
        Snake snake3 = new Snake();
        addObject(snake3, 484, 296);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,299,459);
        counter.setLocation(405,673);
        counter.setLocation(428,675);
    }
}