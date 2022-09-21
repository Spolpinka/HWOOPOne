public class Human {
    String name = "Информация не указана";
    String city = "Информация не указана";
    int birthYear = 0;
    String post = "Информация не указана";
    ;

    public Human(String name, String city, int birthYear, String post) {
        if (name != null) {
            this.name = name;
        }
        if (city != null) {
            this.city = city;
        }
        if (birthYear >= 0) {
            this.birthYear = birthYear;
        }
        if (post != null) {
            this.post = post;
        }
    }

    @Override
    public String toString() {
        return "Привет! " +
                "Меня зовут " + name +
                ". Я из города " + city +
                ". Я родился в " + birthYear + " году" +
                ". Я работаю на должности " + post +
                ". Будем знакомы!";
    }
}
