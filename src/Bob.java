public class Bob implements Runnable {
    private int positionX, positionY, round;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor, int round) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
        this.round = round;
    }
    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        int side = 200;
        bob.penColor(this.penColor);
        bob.width(1);
        bob.speed(2);
        for(int i=0;i<this.round;i++)
        {
            bob.forward(side);
            bob.right(144);
            side = side - 2;
        }
    }
}