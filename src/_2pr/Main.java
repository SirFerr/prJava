package _2pr;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Anne","Anee@gmail.com",'F');
        System.out.println(author1.toString());
        author1.setEmail("Anne@gmail.com");
        System.out.println(author1.getEmail());
        System.out.println(author1.getName());
        System.out.println(author1.getGender());
    }
}
