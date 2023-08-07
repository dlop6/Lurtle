import greenfoot.*; // Asegúrate de importar la librería Greenfoot

public class mensajeFinal extends Actor {
    private GreenfootSound menuSound;
    
    public mensajeFinal() {
        setImage(new GreenfootImage("¡Ganaste! ", 36, Color.WHITE, new Color(0, 0, 0, 0)));
        if (Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MundoTortuga());
            menuSound = new GreenfootSound("8 BIT MENU SELECT  Gaming Sound Effects HD FREE NO Copyright.mp3");
            menuSound.play();
            Greenfoot.delay(60); 
        }
    }
}
