public class Main {
    public static void main(String[] args) {task1and2(); task3();} {

    }

    public static void task1and2(){
        Human[] humans;

        Human max = new Human("Максим", "Минск", 2022 - 35, "бренд-менеджер");
        Human anya = new Human("Анна", "Москва", 2022 - 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 2022 - 28, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 2022 - 27, "директор по развитию бизнеса");

        humans = new Human[]{max, anya, katya, artem};

        for (Human human: humans) {
            System.out.println(human);
        }
    }

    public static void task3(){
        Auto[] autos;

        Auto lada = new Auto("Lada", "Grande", 1.7f,
                "желтый", 2015, "Россия");
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 3.0f,
                "Черный", 2020, "Германия");
        Auto bmw = new Auto("BMW", "Z8", 3.0f,
                "Черный", 2021, "Германия");
        Auto kia = new Auto("Kia", "Sportage", 2.4f,
                "Красный", 2018, "Южная Корея");
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6f,
                "Оранжевый", 2016, "Южная Корея");

        autos = new Auto[]{lada, audi, bmw, kia, hyundai};

        for (Auto auto :
                autos) {
            System.out.println(auto);
        }

    }
}