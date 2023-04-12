public class User {
    
    private int Identifier;
    private String Name;
    private float Balance;

    public User(int id, String name, float balance) {
        this.Identifier = id;
        this.Name = name;
        this.Balance = balance;
    }

    public void modifyBalance(float am) {
        this.Balance +=  am;
    }

    public int getIdentifier() {
        return this.Identifier;
    }

    public String getName() {
        return this.Name;
    }

    public float getBalance() {
        return this.Balance;
    }
}