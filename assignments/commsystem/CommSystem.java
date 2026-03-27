import java.util.ArrayList;

public class CommSystem {

    // TODO: private талбаруудыг зарлана уу
    // - stationNer (String)
    // - log (ArrayList<String>) — мессежүүдийн лог
    // - signalHvch (int, анхны утга 100)
    // - offline (boolean, анхны утга false)

    // TODO: Constructor бичнэ үү
    // CommSystem(String stationNer)
    // - log-ийг шинэ ArrayList-ээр үүсгэнэ

    // TODO: ilgeeh(String hvleenAvagch, String mesg) method бичнэ үү
    // - Хэрэв offline бол "📡 Офлайн!" буцаана
    // - signalHvch -= 5
    // - Хэрэв signalHvch < 10 бол автоматаар offline = true болгоно
    // - log-д "→ hvleenAvagch: mesg" нэмнэ
    // - "Илгээлээ: hvleenAvagch" буцаана

    // TODO: hvleenAvah(String ilgeegch, String mesg) method бичнэ үү
    // - log-д "← ilgeegch: mesg" нэмнэ

    // TODO: signalSergemjuuleh() method бичнэ үү
    // - signalHvch = 100
    // - offline = false

    // TODO: logHarah(int n) method бичнэ үү
    // - Сүүлийн n мессежийг буцаана
    // - StringBuilder ашиглана
    // - Мөр бүрийг шинэ мөрөөр тусгаарлана (\n)
    // - Хэрэв n > log.size() бол бүх лог-ийг буцаана

    // TODO: toString() method бичнэ үү
    // Формат: "📡 [нэр] [ONLINE/OFFLINE] Signal: X% | Лог: Y мессеж"

}
import java.util.ArrayList;

public class CommSystem {

    // private талбарууд
    private String stationNer;
    private ArrayList<String> log;
    private int signalHvch = 100;
    private boolean offline = false;

    // Constructor
    public CommSystem(String stationNer) {
        this.stationNer = stationNer;
        this.log = new ArrayList<>();
    }

    // Илгээх method
    public String ilgeeh(String hvleenAvagch, String mesg) {
        if (offline) {
            return "📡 Офлайн!";
        }

        signalHvch -= 5;

        if (signalHvch < 10) {
            offline = true;
        }

        log.add("→ " + hvleenAvagch + ": " + mesg);

        return "Илгээлээ: " + hvleenAvagch;
    }

    // Хүлээн авах method
    public void hvleenAvah(String ilgeegch, String mesg) {
        log.add("← " + ilgeegch + ": " + mesg);
    }

    // Signal сэргээх
    public void signalSergemjuuleh() {
        signalHvch = 100;
        offline = false;
    }

    // Лог харах
    public String logHarah(int n) {
        StringBuilder sb = new StringBuilder();

        int start = Math.max(0, log.size() - n);

        for (int i = start; i < log.size(); i++) {
            sb.append(log.get(i)).append("\n");
        }

        return sb.toString();
    }

    // toString method
    @Override
    public String toString() {
        String status = offline ? "OFFLINE" : "ONLINE";
        return "📡 " + stationNer + " [" + status + "] Signal: "
                + signalHvch + "% | Лог: " + log.size() + " мессеж";
    }
}