public class Human {
    String name;
    String city;
    int birthYear;
    String post;
    String noInfo = "Информация не указана";

    public Human(String name, String city, int birthYear, String post) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = noInfo;
        }
        if (city != null) {
            this.city = city;
        } else {
            this.city = noInfo;
        }
        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = 0;
        }
        if (post != null) {
            this.post = post;
        } else {
            this.post = noInfo;
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
