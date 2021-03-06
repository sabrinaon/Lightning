import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 150; 
int startY = 0;
int endX = 150; 
int endY = 0;

public void setup()
{
  size(300,300);
  background(0);
  strokeWeight(1);
}
public void draw()
{
	stroke((int)(random(255)),(int)(random(255)),(int)(random(255)));
	while(endY<300)
	{
		endX = startX + (int)(random(-9,9));
		endY = startY + (int)(random(0,9));
		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
	}
}

public void mousePressed()
{
	startX = 150; 
 	startY = 0;
	endX = 150; 
	endY = 0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
