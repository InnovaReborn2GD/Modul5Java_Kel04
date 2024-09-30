package id.pajerosportdakar.praktikum.modul5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);
        System.out.print("username: ");
        username = input.nextLine();
        System.out.print("password: ");
        password = input.nextLine();

        AuthService authService = new AuthService(username, password);
        authService.login();
    }
}
