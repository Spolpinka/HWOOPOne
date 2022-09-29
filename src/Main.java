import org.w3c.dom.ls.LSOutput;
import transport.Auto;
import transport.Bus;
import transport.TRANSMISSION;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {task1on28092022(); } {

    }

    public static void task1and2(){
        Human[] humans;

        Human max = new Human("Максим", "Минск", 2022 - 35, "бренд-менеджер");
        Human anya = new Human("Анна", "Москва", 2022 - 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 2022 - 28, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 2022 - 27, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2022 - 21, "");

        humans = new Human[]{max, anya, katya, artem, vladimir};

        for (Human human: humans) {
            System.out.println(human);
        }
    }

    public static void task3on2609(){
        Auto[] autos;



        Auto lada = new Auto("Lada", "Grande", 1.7f,
                "желтый", 2015, "Россия",
                TRANSMISSION.MANUAL, "hatchback", "a012vc43", 5, false);
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0f,
                "Черный", 2020, "Германия",
                TRANSMISSION.AUTOMATIC, "classic", "o000oo00", 5, true);
        Auto bmw = new Auto("BMW", "Z8", 3.0f,
                "Черный", 2021, "Германия",
                TRANSMISSION.AUTOMATIC, "crossover", "х999хх99", 5, true);
        Auto kia = new Auto("Kia", "Sportage", 2.4f,
                null, 2018, "Южная Корея",
                TRANSMISSION.VARIATE, "crossover", "а578ос99", 5, true);
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6f,
                "Оранжевый", 2016, "Южная Корея",
                TRANSMISSION.MANUAL, "classic", "в464ус01", 5, false);

        lada.setKey(lada.new Key(false, false));
        lada.setInsurance(lada.new Insurance(LocalDate.now().plusMonths(4), 1976.22f, "АБС000ВВВ"));

        audi.setKey(audi.new Key(true, true));
        audi.setInsurance(audi.new Insurance(LocalDate.now().plusYears(1), 3986f, "1111FFF11"));

        bmw.setKey(bmw.new Key(true, true));
        bmw.setInsurance(bmw.new Insurance(LocalDate.now().plusMonths(11), 3546.77f, "2345DFGH1"));

        kia.setKey(kia.new Key(true, false));
        kia.setInsurance(kia.new Insurance(LocalDate.now().plusMonths(8), 3087.54f, "443563554"));

        hyundai.setKey(hyundai.new Key(false, true));
        hyundai.setInsurance(hyundai.new Insurance(LocalDate.now().plusMonths(7), 2879f, "347982347"));

        autos = new Auto[]{lada, audi, bmw, kia, hyundai};

        for (Auto auto :
                autos) {
            System.out.println(auto);
        }

        lada.setTires(lada.setSeasonTyres(4));//4 - апрель, будет зимняя резина
        System.out.println(lada);

        System.out.println(hyundai.isRegNumCorrect());
    }

    public static void task1on2609(){
        Flower rose = new Flower("Роза обыкновенная","Голландия", 35.59f);

        Flower chrysanthemum = new Flower("Хризантема", 15f, 5);

        Flower pion = new Flower("Пион", "Англия", 69.90f, 1);

        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.50f, 10);

        Flower[] bouquet1 = {rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                gypsophila};
        Bouquet bouquet = new Bouquet(bouquet1);

        System.out.println("Состав букета: " + bouquet.getBouquetComposition() + "\n" +
                "Стоимость букета - " + bouquet.getBouquetCost() + " рублей\n" +
                "Срок стояния - " + bouquet.getBouquetSpan() + " дней.");

    }

    public static void task1on28092022(){
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия",
                301, 3500, "Белорусский вокзал", "Минск-Пассажирский",
                11);

        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                270, 1700, "Ленинградский вокзал", "Ленинград-Пассажирский",
                8);

        System.out.println(lastochka);
        //заправляем ласточку
        lastochka.refill();
        //и смотрим, что с остатком топлива
        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus minsk = new Bus("Минск", "М-11", 1995, "Белоруссия", "Красный");
        Bus gas = new Bus("ГАЗ", "ГБ-324", 1989, "Россия", "Синий");
        Bus hyundai = new Bus("Hyundai", "BS3946", 2008, "Южная Корея", "Кофе с молоком");

        System.out.println(minsk);
        System.out.println(gas);
        //заправляем ГАЗ
        gas.refill();
        //и смотрим что с остатком топлива
        System.out.println(gas);
        System.out.println(hyundai);
    }



}