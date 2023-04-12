public class User{
    
    private int Identifier;
    // private String Name;
    // private float Balance;

    public User() {
        this.Identifier = UserIdsGenerator.getInstance().generateId();
        // this.Name = array[0];
        // this.Balance = array[1];
    }

    // public void modifyBalance(float am) {
    //     this.Balance +=  am;
    // }

    public int getIdentifier() {
        return this.Identifier;
    }

    // public String getName() {
    //     return this.Name;
    // }

    // public float getBalance() {
    //     return this.Balance;
    // }
}