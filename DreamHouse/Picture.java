
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private myRectangle chimney;
    private myRectangle garage;
    private myRectangle garageDoor;
    private myRectangle grass;
    private Circle smokeOne;
    private Circle smokeTwo;
    private Circle smokeThree;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        grass = new myRectangle();
        grass.changeColor("green");
        grass.changeSize(300, 400);
        grass.moveVertical(160);
        grass.moveHorizontal(-100);
        grass.makeVisible();
        
        garage = new myRectangle();
        garage.changeSize(80, 100);
        garage.moveVertical(100);
        garage.moveHorizontal(100);
        garage.makeVisible();

        garageDoor = new myRectangle();
        garageDoor.changeSize(60, 80);
        garageDoor.moveVertical(110);
        garageDoor.moveHorizontal(110);
        garageDoor.changeColor("black");
        garageDoor.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveVertical(100);
        window.moveHorizontal(20);
        window.makeVisible();

        chimney = new myRectangle();
        chimney.moveVertical(30);
        chimney.moveHorizontal(10);
        chimney.changeSize(50, 30);
        chimney.changeColor("yellow");
        chimney.makeVisible();
        
        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.changeColor("black");
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        smokeOne = new Circle();
        smokeOne.moveVertical(-10);
        smokeOne.moveHorizontal(40);
        smokeOne.makeVisible();
        
        smokeTwo = new Circle();
        smokeTwo.moveVertical(-30);
        smokeTwo.moveHorizontal(10);
        smokeTwo.makeVisible();
        
        smokeThree = new Circle();
        smokeThree.moveVertical(-50);
        smokeThree.moveHorizontal(-20);
        smokeThree.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            chimney.changeColor("black");
            garage.changeColor("white");
            garageDoor.changeColor("black");
            grass.changeColor("white");
            smokeOne.changeColor("black");
            smokeTwo.changeColor("black");
            smokeTwo.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("black");
            chimney.changeColor("yellow");
            garage.changeColor("green");
            garageDoor.changeColor("black");
            grass.changeColor("green");
            smokeOne.changeColor("blue");
            smokeTwo.changeColor("blue");
            smokeThree.changeColor("blue");
        }
    }

}
