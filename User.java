public class User implements Comparable<User> {
    private String UserName;

    public User(String UserName) throws InputValidationException {
        setUserName(UserName);
    }

    public User() {

    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String toString() {
        return getUserName();
    }


    @Override
    public int compareTo(User o) {
        return 0;
    }
}
