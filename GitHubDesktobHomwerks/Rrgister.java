package GitHubDesktobHomwerks;

public class Rrgister {
    private String username;
    private String email;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void showProfile(){
        System.out.println("Ваш прикрасное имя:" + username );
        System.out.println("Ваш Email" + email);
        System.out.println("И ваш пороль" + ".......");
    }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("В емаиле должно быть символ сабачки по другому не получается !");

        }

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Пороль маленький огроничение больше 8 символов");
            this.password = null;
        }

    }

}
