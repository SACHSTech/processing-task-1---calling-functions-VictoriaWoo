import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// size call (ratio is 1.5:1)
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
	  
    // Rainbow
    fill(239, 115, 113);
    ellipse(300, 350, 400, 400);
    fill(248, 181, 129);
    ellipse(300, 375, 360, 400);
    fill(253, 230, 151);
    ellipse(300, 400, 320, 400);
    fill(151, 186, 129);
    ellipse(300, 425, 280, 400);
    fill(132, 146, 184);
    ellipse(300, 450, 260, 400);
    fill(168, 148, 186, 255);
    ellipse(300, 475, 220, 400);
    fill(196, 212, 201);
    ellipse(300, 500, 180, 400);

  	// Grass
    fill(60, 171, 86);
    rect(0, 350, 600, 50);

    // Sun
    fill(255, 245, 130);
    circle(600, 0, 150);
    line(500, 20, 460, 40);
    line(525, 50, 490, 75);
    line(550, 75, 525, 100);
    line(580, 90, 570, 120);

    // Path
    fill(155, 118, 83);
    quad(290, 350, 310, 350, 360, 400, 240, 400);

  }
  
}