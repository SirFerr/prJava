package _3pr;


public class MovebleRectangle implements Movable{
    MovablePoint topLeft, bottomRight;
    MovebleRectangle(int x1, int y1,int x2, int y2, int xSpeed,int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public boolean speedTest(){
     return topLeft.xSpeed==topLeft.ySpeed && bottomRight.xSpeed==bottomRight.ySpeed;
    }
    @Override
    public String toString() {
        return "MovebleRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y=topLeft.y+topLeft.ySpeed;
        bottomRight.y=bottomRight.y+topLeft.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y=topLeft.y-topLeft.ySpeed;
        bottomRight.y=bottomRight.y-topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x=topLeft.x-topLeft.xSpeed;
        bottomRight.x=bottomRight.x-topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x=topLeft.x+topLeft.xSpeed;
        bottomRight.x=bottomRight.x+topLeft.xSpeed;
    }
}
