import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage
import java.util.Random;; // imports Random

public class MundoTortuga extends World
{
    private int lechugasRestantes;
    //Crear el mundo
    public MundoTortuga() 
    {
        super(600, 500, 1);
        
        
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
        lechugasRestantes = 1;

        for (int i = 0; i < lechugasRestantes; i++) {
            Lettuce lettuce = new Lettuce();
            addObject(lettuce, random.nextInt(getWidth()), random.nextInt(getHeight()));

        }
        
        for (int j = 0; j < 2; j++){
            Snake snake = new Snake();
            addObject(snake, random.nextInt(getWidth()), random.nextInt(getHeight()));
            
        }
        
    }
    
    public void decrementarLechugasRestantes() {
        lechugasRestantes--;
        if (lechugasRestantes == 0) {
            showEndMessage();
        }
    }
    
    private void showEndMessage()
    {
        // Muestra el mensaje final en el centro del mundo
        mensajeFinal mensajeFinal = new mensajeFinal();
        addObject(mensajeFinal, getWidth() / 2, getHeight() / 2);
        Greenfoot.stop(); // Detiene el juego
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
        counter.setLocation(456,145);
        counter.setLocation(305,17);
    }
}