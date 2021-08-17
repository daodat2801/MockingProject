package Model;

import lombok.Data;

@Data
public class User {
    private String userName;
    private String passWord;
    private BookCase bookCase;
    private String authority;
}
