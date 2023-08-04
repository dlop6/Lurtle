import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage
import java.util.Random;; // imports Random

public class MundoTortuga extends World
{
    //Crear el mundo
    public MundoTortuga() 
    {
        super(600, 480, 1);

        preparar();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void preparar()
    {
        Random random = new Random();
        Turtle turtle = new Turtle();
        addObject(turtle, 0, 0);

        for (int i = 0; i < 17; i++) {
            Lettuce lettuce = new Lettuce();
            addObject(lettuce, random.nextInt(500)-500, random.nextInt(300)-300);
        }

        Snake snake = new Snake();
        addObject(snake, 456, 73);
        Snake snake2 = new Snake();
        addObject(snake2, 72, 396);
        Snake snake3 = new Snake();
        addObject(snake3, 484, 296);
    }
}