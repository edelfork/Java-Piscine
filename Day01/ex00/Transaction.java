import java.util.UUID;

public class Transaction{

    private UUID Identifier;
    private User Recipient;
    private User Sender;
    private String[] category;
    private float amount;

    public Transaction(User idR, User idS, float am) {
        category = new String[2];
        setter(idR, idS, am);
        doTransaction(am);
    }

    public void doTransaction(float am) {
        this.Sender.modifyBalance(am);
        am *= -1;
        this.Recipient.modifyBalance(am);
    }

    public UUID IdGenerator() {
    
        UUID uniqueId = UUID.randomUUID();
        return uniqueId;

    }


    public void setIdentifier() {
        this.Identifier = IdGenerator();
    }

    public void setRecipient(User rec) {
        this.Recipient = rec;
    }

    public void setSender(User send) {
        this.Sender = send;
    }

    public void setCategory() {
        this.category[0] = "debits";
        this.category[1] = "credits";
    }

    public void setAmount(float am) {
        this.amount = am;
    }

    public UUID getID() {
        return this.Identifier;
    }

    public void setter(User rec, User send, float am) {
       setIdentifier();
       setRecipient(rec);
       setSender(send);
       setCategory();
       setAmount(am);
   }

    public User getRecipient() {
        return this.Recipient;
    }

    public User getSender() {
        return this.Sender;
    }

    public String[] getCategory() {
        return this.category;
    }

    public float getAmount() {
        return this.amount;
    }
}