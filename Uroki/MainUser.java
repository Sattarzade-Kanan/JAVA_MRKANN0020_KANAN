package JAV;

public class MainUser {
    public static void main(String[] args) {
        User u = new User();

        u.setPassword("464757");
        u.setEmail("sigmakanan@gmail.com");
        u.setUsername("Kanan464");

        System.out.println("Username" + u.getUsername());
        System.out.println("-------------------------------");
        System.out.println("Email" + u.getEmail());
        System.out.println("-------------------------------");
        System.out.println("Password" + u.getPassword());
        System.out.println("-------------------------------");
        System.out.println("Your Phone" + u.getPhone());
    }
}
