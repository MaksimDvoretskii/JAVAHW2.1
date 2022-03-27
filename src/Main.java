public class Main {
    public static void main(String[] args) {
        // входные даанные
        int bonusLevel = 20; // единица начисления бонусов (1 миля за каждые 20 рублей)
        int ticketPrice = 50_000; // цена билета
        System.out.println("Количество накопленных миль составляет");
        System.out.println(ticketPrice / bonusLevel);
    }
}
