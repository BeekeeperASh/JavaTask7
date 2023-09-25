public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int xSpeed1, int ySpeed1, int x2, int y2, int xSpeed2, int ySpeed2) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
        System.out.println(speedTest());
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    private boolean speedTest(){
        return (this.topLeft.ySpeed == this.bottomRight.ySpeed) && (this.topLeft.xSpeed == this.bottomRight.xSpeed);
    }
}
