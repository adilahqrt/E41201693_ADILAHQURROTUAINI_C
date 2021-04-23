package com.adilah.drawshaper;

import java.awt.*;
import java.applet.*;

public class DrawShaper extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    public void init() {
        //The FOnt is Arial size, 18 and is italized
        font = new Font("Arial", Font.ITALIC, 18);

        //SOme colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;

        //Colors can be created using Red, Green, Blue values
        blueColor = new Color(0,0,122);

        //Set the background Color of the applet
        setBackground(backgroundColor);
    }

    public void stop() {
    }
    /**
     * This method paints the shapes to the screen
     */
    public void paint(Graphics graph) {
        //Set font
        graph.setFont(font);
        //Create a title
        graph.drawString("Draw Shapes",90,20);

        //Set the color for the first shape
        graph.setColor(blueColor);

        //Draw a rectangle using drawRec(int x, int y, int width, int heigth)
        graph.drawRect(120,120,120,120);

        //this will fill a rectangle
        graph.fillRect(115, 115, 90, 90);

        //Set the color for the next shape
        graph.setColor(redColor);

        //Drwa a circle using drawArd(int x, int y,int height, int StartAngle, int arcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);

        //Set color for next shape
        graph.setColor(Color.CYAN);

        //Draw anothe rectangel
        graph.drawRect(50, 50, 50, 50);

        //This will fill a rectangel
        graph.fillRect(50, 50, 60, 60);
    }
}