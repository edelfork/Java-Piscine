public class Program {

    public static void main(String[] args) throws UserNotFoundException{
        
        UsersArrayList arr = new UsersArrayList();

        for (int i = 0; i < 12; i++) {
			User tmp;
		    tmp = new User();
			arr.addUser(tmp);
            System.out.println("Size of List of users: " + arr.getSize());
		}
            System.out.println("\nList of users:");
            arr.printElem();
        System.out.println("\nFindUserById (1): " + arr.findUserById(1));
        System.out.println("\nFindUserByIndex (0): " + arr.findUserByIndex(0));
        System.out.println("\nCountUsers: " + arr.countUser());

        arr.findUserById(20);

    }
}