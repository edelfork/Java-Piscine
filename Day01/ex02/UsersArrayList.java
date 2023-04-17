import java.util.ArrayList;


public class UsersArrayList implements UsersList{
    
    private int size = 10;
    private ArrayList<User> users;

    public UsersArrayList() {
        users = new ArrayList<User>(this.size);
    }
    
    public void reSize(int s) {
        this.size += (s / 2);
    }

    public void addUser(User u) {
        int i = 0;

        
        while (i < this.size) {
            if (users.isEmpty()) {
            users.add(u);
            return ;
        }
            i++;
        }
        if (i == users.size())
            reSize(i);
        users.add(u);
    }

        public void printElem() {
            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i).getName());
            }
        }

    public User findUserById(int id) throws UserNotFoundException{
        int i;
        for (i = 0; i < users.size(); i++) {
            if (users.get(i).getIdentifier() == id) {
                return users.get(i);
            }
        }
        throw new UserNotFoundException("User not found");
        
    }

    public User findUserByIndex(int index) throws UserNotFoundException{
        if (index > users.size() || users.isEmpty())
            throw new UserNotFoundException("User not found");
        return (users.get(index));
    }

    public int countUser() {
        return users.size();
    }

    public int getSize() {
        return this.size;
    }
}