package DAL;

//Singleton,so that only one object can be created

public class UserDataBase {
    private static UserDataBase instance;
    private UserDataBase(){
        //Make the constructor private
    }
    public static synchronized  UserDataBase getInstance()
    {
    if(instance==null)
    {
        instance=new UserDataBase();
    }
    return  instance;
    }
}
