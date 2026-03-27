    import java.util.ArrayList;

    public class FoodStation {

        // TODO: private талбаруудыг зарлана уу
        // - ner (String)
        // - menu (ArrayList<String>) — хоолны нэрсийн жагсаалт
        // - uneNuud (ArrayList<Integer>) — хоолны үнүүдийн жагсаалт (menu-тэй ижил индекстэй)
        // - niitOrlogo (int, анхны утга 0)

        // TODO: Constructor бичнэ үү
        // FoodStation(String ner)
        // - menu болон uneNuud-ийг шинэ ArrayList-ээр үүсгэнэ

        // TODO: tsesNemeh(String hool, int une) method бичнэ үү
        // - menu-д хоолны нэр, uneNuud-д үнийг нэмнэ

        // TODO: zahialga(String hool) method бичнэ үү
        // - menu.indexOf(hool) ашиглан хоол хайна
        // - Олдохгүй бол "❌ Цэсэнд байхгүй" буцаана
        // - Олдвол niitOrlogo-д үнийг нэмж, "✅ hool бэлтгэж байна" буцаана

        // TODO: hamgiinHvnstei() method бичнэ үү
        // - uneNuud дотроос хамгийн их утгыг олж, тухайн индексийн хоолны нэрийг буцаана
        // - Хэрэв цэс хоосон бол "Цэс хоосон" буцаана

        // TODO: toString() method бичнэ үү
        // Формат: "🍜 [нэр] | Цэс: X хоол | Орлого: Y₮"

    }
import java.util.ArrayList;

    public class FoodStation {

        // private талбарууд
        private String ner;
        private ArrayList<String> menu;
        private ArrayList<Integer> uneNuud;
        private int niitOrlogo = 0;

        // Constructor
        public FoodStation(String ner) {
            this.ner = ner;
            this.menu = new ArrayList<>();
            this.uneNuud = new ArrayList<>();
        }

        // Цэс нэмэх
        public void tsesNemeh(String hool, int une) {
            menu.add(hool);
            uneNuud.add(une);
        }

        // Захиалга
        public String zahialga(String hool) {
            int index = menu.indexOf(hool);

            if (index == -1) {
                return "❌ Цэсэнд байхгүй";
            }

            int une = uneNuud.get(index);
            niitOrlogo += une;

            return "✅ " + hool + " бэлтгэж байна";
        }

        // Хамгийн үнэтэй хоол
        public String hamgiinHvnstei() {
            if (menu.isEmpty()) {
                return "Цэс хоосон";
            }

            int maxIndex = 0;

            for (int i = 1; i < uneNuud.size(); i++) {
                if (uneNuud.get(i) > uneNuud.get(maxIndex)) {
                    maxIndex = i;
                }
            }

            return menu.get(maxIndex);
        }

        // toString
        @Override
        public String toString() {
            return "🍜 " + ner + " | Цэс: " + menu.size()
                    + " хоол | Орлого: " + niitOrlogo + "₮";
        }
    }
    // bagshaa ai iin argalj chaddgue uuchlaarai unher amjsangue visual der chaddgue tgd untellj der hiisen hbur
    // tsagnda amjhgu bna oilgod uguuch bagshaa guujin

