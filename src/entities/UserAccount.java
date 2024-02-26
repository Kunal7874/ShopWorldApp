package entities;

public class UserAccount {
    private String username;
    private String password;

    private  UserAccount(userAccountBuilder builder)
    {
    this.username=builder.username;
    this.password=builder.password;
    }
    public static class userAccountBuilder{
        private final String username;
        private final String password;


        public userAccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public UserAccount build()
        {
            return new UserAccount(this);
        }
    }

}
