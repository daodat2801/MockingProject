package Model;

import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userName;
    private String passWord;
    private BookCase bookCase;
    private String authority;
}
