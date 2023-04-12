import java.util.UUID;

public class Program {

    public static User     trRecipient;
    public static User     trSender;
    public static UUID     trIdentifier;
    public static float    trAmount;
    public static String[]   trCategory;

    public static void initTransaction(Transaction tr) {
        trRecipient = tr.getRecipient();
        trSender = tr.getSender();
        trIdentifier = tr.getID();
        trAmount = tr.getAmount();
        trCategory = tr.getCategory();
    }

    public static void printTransaction() {
        if (trAmount > 0) {
            System.out.println(trSender.getName() + " -> " +  trRecipient.getName() + ", +" + trAmount + ", " + trCategory[1] + ", " + trIdentifier.toString());
            trAmount *= -1;
            System.out.println(trRecipient.getName() + " -> " +  trSender.getName() + ", " + trAmount + ", " + trCategory[0] + ", " + trIdentifier.toString());
        }
        else {
            System.out.println(trSender.getName() + " -> " +  trRecipient.getName() + ", " + trAmount + ", " + trCategory[0] + ", " + trIdentifier.toString());
            trAmount *= -1;
            System.out.println(trRecipient.getName() + " -> " +  trSender.getName() + ", +" + trAmount + ", " + trCategory[1] + ", " + trIdentifier.toString());
        }
        System.out.println("Balance " + trRecipient.getName() + "= " + trRecipient.getBalance());
        System.out.println("Balance " + trSender.getName() + "= " + trSender.getBalance());
    }
    
    public static void main(String[] args) {

        User bob = new User(0, "Bob", 10);
        User carl = new User(1, "Carl", 20);
        User george = new User(2, "George", 7);
        User helen = new User(3, "Helen", 5);

        Transaction bobToGeorge = new Transaction(bob, george, 2);
        initTransaction(bobToGeorge);
        printTransaction();

        Transaction georgeToHelen = new Transaction(george, helen, -5);
        initTransaction(georgeToHelen);
        printTransaction();

    }
}