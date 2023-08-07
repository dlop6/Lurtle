import greenfoot.*; 

public class Turtle extends Animal
{
    private int tiempoInmunidad; 
    private int contadorMensajeInmunidad;   
    private GreenfootSound eatSound;
     public void act()
    {
        move(4);
        checkKeys();
        tryToEatLettuce();
        tryToEatMango();
        
        if (tiempoInmunidad > 0)
        {
            tiempoInmunidad--;
            if (tiempoInmunidad == 0)
            {
                getWorld().showText("", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            }
        }

        // Actualizar el contador del mensaje de inmunidad
        if (contadorMensajeInmunidad > 0)
        {
            contadorMensajeInmunidad--;
            if (contadorMensajeInmunidad == 0)
            {
                getWorld().showText("", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            }
        }       
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
    
        public Turtle()
    {
        tiempoInmunidad = 0;
    }
     
    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class) )
        {
            eatSound = new GreenfootSound("slurp.wav");
            eatSound.play();
            eat(Lettuce.class);
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            MundoTortuga mundo = (MundoTortuga) getWorld();
            mundo.decrementarLechugasRestantes();
 
        }
    }
    
    public void tryToEatMango()
    {
        if (canSee(mangouu.class) && ((MundoTortuga)getWorld()).puedeComerMango())
        {
            eatSound = new GreenfootSound("slurp.wav");
            eatSound.play();
            eat(mangouu.class);
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(5);
            MundoTortuga mundo = (MundoTortuga) getWorld();
            mundo.reiniciarTiempoEsperaMango();
            
            setTiempoInmunidad(300); // 5 segundos (5 * 60 frames por segundo)
            getWorld().showText("Inmunidad por 5s", getWorld().getWidth() / 2, getWorld().getHeight() / 2);

            // Mostrar el mensaje de inmunidad por 2 segundos (120 frames)
            contadorMensajeInmunidad = 120;
        }
    }
    
    public void setTiempoInmunidad(int tiempo)
    {
        tiempoInmunidad = tiempo;
    }

    public int getTiempoInmunidad()
    {
        return tiempoInmunidad;
    }
    
    public boolean esInmune()
    {
        return tiempoInmunidad > 0;
    }
}