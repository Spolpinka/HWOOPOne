public class Human {
    private String name = "Информация не указана";
    private String city = "Информация не указана";
    private int birthYear = 0;
    private String post = "Информация не указана";


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

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty() && !city.isBlank()) {
            this.city = city;
        }
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear >= 0) {
            this.birthYear = birthYear;
        }
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        if (post != null && !post.isBlank() && !post.isEmpty()) {
            this.post = post;
        }
    }
}
