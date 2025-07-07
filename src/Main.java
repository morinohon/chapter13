public class Main {
    public static void main(String[] args) {
       Hero h = new Hero();
        h.setHp(40);
        h.setName("ミナト");
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());

        King k = new King();
        k.talk(h);

        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        System.out.println(h.getName() + "は、眠って回復した！");



        Matango m = new Matango();
        m.setName("お化けキノコA");

        System.out.println(h.getName() + "の攻撃！");
        System.out.println(m.getName() + "から100ポイントの反撃を受けた");
        h.setHp(h.getHp() - 100);
        if(h.getHp() <= 0){
         System.out.println(h.getName() + "は死んでしまった！" + "\n" + "GAME OVERです。");
        }

        //h.hp = 100;// エラーが出る
        /*h.name = "ミナト";

        h.sleep();
        h.seppuku();*/

    }
}
