public interface UsersList {
    
    public void addUser(User u);
    public User findUserById(int id) throws UserNotFoundException;
    public User findUserByIndex(int index) throws UserNotFoundException;
    public int countUser();
}