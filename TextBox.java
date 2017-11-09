import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{   
    private GreenfootImage img;
    private boolean border = false;
    private String text;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    public TextBox( String message, int fs,boolean hasBoarder, Color fg, Color bg )
    {
        fontSize = fs;
        border = hasBoarder;
        foreground = fg;
        background = bg;
        text = message;
        
        img = new GreenfootImage( message, fontSize, foreground, background );
        
        display();
    }
    
    private void display()
    {
        if( border == true )
        {
            img.setColor( Color.BLACK );
            img.drawRect( 0,0, img.getWidth()-1, img.getHeight()-1 );
        }
        setImage( img );
    }
    
    public String getText()
    {
        return text;
    }
    
    public void setText( String message )
    {
        text = message;
        img = new GreenfootImage( text, fontSize, foreground, background );
        display();
    }
    
    
    
    /**
     * Act - do whatever the TextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}