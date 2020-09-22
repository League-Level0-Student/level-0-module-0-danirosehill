int myVariable = 100;
int speed = 4;
int yaxis= 250;
int yspeed= 4;

void setup() {
  size(500, 500);
}
void draw() {
  background(#D73BE0);
  fill(#72E380);
  ellipse(myVariable, yaxis, 100, 100);
  myVariable = myVariable + speed;
  if (myVariable>=500) {
    speed=-speed;
  }
  if (myVariable<=0) {
    speed=-speed;
  }
  yaxis = yaxis + yspeed;
  if (yaxis>=500) {
    yspeed=-yspeed;
  }
   yaxis = yaxis + yspeed;
  if (yaxis<=0) {
    yspeed=-yspeed;
  }
 
}
