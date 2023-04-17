public class User{
    
    private int Identifier;
    private String Name;

    public User() {
        this.Identifier = UserIdsGenerator.getInstance().generateId();
        setName(this.Identifier);
    }

    public int getIdentifier() {
        return this.Identifier;
    }

    public void setName(int i) {
        this.Name = "User " + i;
    }

    public String getName() {
        return this.Name;
    }
}