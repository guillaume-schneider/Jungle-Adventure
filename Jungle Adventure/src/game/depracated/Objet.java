package game.depracated;

@Deprecated
public class Objet {
    private int height, width, x, y;

    public Objet(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*public void deplacement () {
        if(Main.scene.getxPos()>=0){
            this.x = this.x - Main.scene.getxEcran();
        }
    }*/
}
