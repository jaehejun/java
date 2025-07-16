package java0716;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@Data
@AllArgsConstructor
class Account {
    private String id;
    private String name;
    private int balance;

}
public class AccountEx {
    public static void main(String[] args) throws IOException {
        Account a1 = new Account("1111","conan",10000);
        Account a2 = new Account("2222","rose",20000);
        File file = new File("account.txt");
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(file);
            pw.println(a1);
            pw.println(a2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            pw.close();
        }
    }
}
