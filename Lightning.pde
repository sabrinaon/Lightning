int startX = 150; 
int startY = 0;
int endX = 150; 
int endY = 0;

void setup()
{
  size(300,300);
  background(0);
  strokeWeight(1);
}
void draw()
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

void mousePressed()
{
	startX = 150; 
 	startY = 0;
	endX = 150; 
	endY = 0;
}

