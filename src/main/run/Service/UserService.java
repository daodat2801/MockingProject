package Service;

import Model.User;

public interface UserService {
    User login();
    void viewBookList(User user);
    void viewBookDetail(User user);
    void searchBook();
    void viewBookCase(User user);
    void editBookCase(User user);
}
