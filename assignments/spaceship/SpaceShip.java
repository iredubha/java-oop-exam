public class SpaceShip {

    // TODO: private талбаруудыг зарлана уу
    // - ner (String)
    // - tulsh (int, анхны утга 100)
    // - zorchigch (int, анхны утга 0)
    // - km (double, анхны утга 0)

    // TODO: Constructor бичнэ үү
    // SpaceShip(String ner)

    // TODO: zorchigchAvah(int too) method бичнэ үү
    // - Зорчигч нэмнэ
    // - Хэрэв нийт зорчигч 10-аас хэтэрвэл "Багтаамж хэтэрлээ!" буцаана
    // - Амжилттай бол "X зорчигч нэмэгдлээ" буцаана

    // TODO: nisleg(double zai) method бичнэ үү
    // - Түлшний зарцуулалт: zai * 0.5
    // - Хэрэв түлш хүрэлцэхгүй бол "Түлш дутуу!" буцаана
    // - Амжилттай бол km нэмэгдэж, "Нислэг амжилттай! X км нисэв" буцаана

    // TODO: tulshTsenegleh(int hemjee) method бичнэ үү
    // - Түлш нэмнэ, гэхдээ 100-аас хэтрэхгүй (Math.min ашиглах)

    // TODO: toString() method бичнэ үү
    // Формат: "🚀 [нэр] | Түлш: X% | Зорчигч: Y | Нийт: Z км"

}
public class SpaceShip {

    // private талбарууд
    private String ner;
    private int tulsh = 100;
    private int zorchigch = 0;
    private double km = 0;

    // Constructor
    public SpaceShip(String ner) {
        this.ner = ner;
    }

    // Зорчигч авах
    public String zorchigchAvah(int too) {
        if (zorchigch + too > 10) {
            return "Багтаамж хэтэрлээ!";
        }

        zorchigch += too;
        return too + " зорчигч нэмэгдлээ";
    }

    // Нислэг хийх
    public String nisleg(double zai) {
        double heregteiTulsh = zai * 0.5;

        if (tulsh < heregteiTulsh) {
            return "Түлш дутуу!";
        }

        tulsh -= heregteiTulsh;
        km += zai;

        return "Нислэг амжилттай! " + zai + " км нисэв";
    }

    // Түлш цэнэглэх
    public void tulshTsenegleh(int hemjee) {
        tulsh = Math.min(100, tulsh + hemjee);
    }

    // toString
    @Override
    public String toString() {
        return "🚀 " + ner + " | Түлш: " + tulsh + "% | Зорчигч: "
                + zorchigch + " | Нийт: " + km + " км";
    }
}