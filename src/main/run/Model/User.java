package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int idUser;
    private String userName;
    private String passWord;
    private BookCase bookCase;
    private String authority;
}
