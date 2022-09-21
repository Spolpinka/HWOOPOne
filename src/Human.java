public class Human {
    String name;
    String city;
    int birthYear;
    String post;

    public Human(String name, String city, int birthYear, String post) {
        this.name = name;
        this.city = city;
        this.birthYear = birthYear;
        this.post = post;
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
