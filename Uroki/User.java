package JAV;

public class User {

        private String username;
        private String password;
private String email;
private int Phone;

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

