import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// size call
    size(600, 400);
  }

  /** 
   * initial set up (background)
   */
  public void setup() {
    background(196, 212, 201);
  }

  /**
   * Drawn to the screen
   */
  public void draw() {
	  
    // Ellipses (Rainbow)
    fill(239, 115, 113);
    ellipse(300, 350, 400, 400);
    fill(248, 181, 129);
    ellipse(300, 375, 360, 400);
    fill(253, 230, 151);
    ellipse(300, 400, 320, 400);
    fill(151, 186, 129);
    ellipse(300, 425, 280, 400);
    fill(132, 146, 184);
    ellipse(300, 450, 240, 400);
    fill(168, 148, 186, 255);
    ellipse(300, 475, 200, 400);
    fill(196, 212, 201);
    ellipse(300, 500, 160, 400);

  	// Rectangle (Grass)
    fill(60, 171, 86);
    rect(0, 350, 600, 50);

    // Circle (Sun)
    fill(255, 245, 130);
    circle(600, 0, 150);

    // Lines (Sun Rays)
    line(500, 20, 460, 40);
    line(525, 50, 490, 75);
    line(550, 75, 525, 100);
    line(580, 90, 570, 120);

    // Quad (path)
    fill(155, 118, 83);
    quad(290, 350, 310, 350, 360, 400, 240, 400);

  }
  
}