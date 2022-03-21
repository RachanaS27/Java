public class ball {
    
    String color;
    int size;
    String material;
    String game;


    static ball b1 = new ball("White", 180, "Rubber", "Football");

    public ball() {
    }

    public ball(String color, int size, String material, String game) {
        this.color = color;
        this.size = size;
        this.material = material;
        this.game = game;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getGame() {
        return game;
    }
    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "ball [color=" + color + ", game=" + game + ", material=" + material + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        
        ball b2 = new ball("Red", 80, "Leather", "Cricket");
        System.out.println(b1);
        System.out.println(b2);
        b1.setColor("Yellow");
        b2.setColor("white");
        b2.setGame("Baseball");
        System.out.println( b1.getGame());
        System.out.println(b1);
        System.out.println(b2);
    }

    
}
