import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage
import java.util.Random;; // imports Random

public class MundoTortuga extends World
{
    private int lechugasRestantes;
    private boolean mangoAparecido;
    private int tiempoEsperaMango;
    private GreenfootSound winSound;
    private boolean juegoTerminado;
    //Crear el mundo
    public MundoTortuga() 
    {
        super(600, 500, 1);
        mangoAparecido = false;
        tiempoEsperaMango = 0;
        
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
        lechugasRestantes = 10;

        for (int i = 0; i < lechugasRestantes; i++) {
            Lettuce lettuce = new Lettuce();
            addObject(lettuce, random.nextInt(getWidth()), random.nextInt(getHeight()));

        }
        
        if (!mangoAparecido) {
            mangouu mango = new mangouu();
            addObject(mango, random.nextInt(getWidth()), random.nextInt(getHeight()));
            mangoAparecido = true;
        }
        
        
        for (int j = 0; j < 3; j++){
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
    
    public boolean juegoTerminado() {
        return juegoTerminado;
    }
    
    private void showEndMessage()
    {
        winSound = new GreenfootSound("OMG.mp3");
        winSound.play();
        mensajeFinal mensajeFinal = new mensajeFinal();
        addObject(mensajeFinal, getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();
        
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
    
    public void act()
    {
        super.act();
        if (tiempoEsperaMango > 0) {
            tiempoEsperaMango--;
        }
    }
    
    public boolean puedeComerMango() {
        return tiempoEsperaMango == 0;
    }

    public void reiniciarTiempoEsperaMango() {
        tiempoEsperaMango = 600; // 10 segundos (10 * 60 frames por segundo)
    }
}