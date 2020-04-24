PImage catPic;

int catEyeX = 117;
int catEyeY = 107;
int accelerate = 5;

void setup(){
size(500, 500);
catPic = loadImage("cat.png");
catPic.resize(width, height);
background(catPic);
}

void draw(){
   if(mousePressed){
      println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
   }
  noStroke();
  ellipse(catEyeX, catEyeY, 30, 30);
  fill(255,0,0);
  
  noStroke();
  ellipse(catEyeX + 96, catEyeY, 30, 30);
  fill(255,0,0);
  
  keyPressed();
  if(catEyeX > width){
    catEyeX = 117;
    catEyeY = 107;
    accelerate = 5;
    background(catPic);
  }
}

void keyPressed(){ 
  catEyeX+=2*accelerate;
  catEyeY+=2*accelerate;
}
