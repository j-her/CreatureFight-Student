import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pikachu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pikachu extends Creature
{
    public Pikachu(World w)
    {
       super(700,true,"Electric");
       getImage().scale( 150, 100);
       w.addObject(getHealthBar(),100,25);
    }
    
    public void act()
    {
       CreatureWorld playerWorld=(CreatureWorld) getWorld();
         if(getHealthBar().getCurrent()<=0)
       {
            getWorld().showText("Pikachu has fainted...",getWorld().getWidth()/2,getWorld().getHeight()/2+26);
            Greenfoot.delay(30);
       }
         
    }
    
     /**
     * Act - do whatever the Pikachu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void attack( int idx ) 
    {
       CreatureWorld world=(CreatureWorld) getWorld();
       Creature enemy = world.getPlayerOne();
       String enemyType = enemy.getType();
       
        if( idx == 0 )
        {
           enemy.getHealthBar().add( -30 );
 
        }
        else
       {
            enemy.getHealthBar().add( -65 );

        }
       world.setTurnNumber(false);
    } 
}    

