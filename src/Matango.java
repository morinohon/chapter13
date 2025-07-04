public class Matango {
    private int hp;
    final int LEVEL = 10;
    char suffix;
    private String name;
    final int basePower = 10;
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void attack(){
        int attack = LEVEL * basePower;
        this.attack();
    }
}
