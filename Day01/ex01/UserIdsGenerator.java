public class UserIdsGenerator {

    private int id;
    private static UserIdsGenerator instance = null;

    public int getId() {
        return this.id;
    }
    public static UserIdsGenerator getInstance() {
        if (instance == null)
            instance = new UserIdsGenerator();
        return instance;
    }

    public int generateId() {
        this.id = 1 + this.getInstance().getId();
        return this.id;
    }
}