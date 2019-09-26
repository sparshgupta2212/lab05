

import java.util.Scanner;
public class User {
    private String userName;
    private String companyName;
    private int yrOfJoining;
    private String email;
    private String emailPassword;

    public User(String userName, String companyName, int yrOfJoining) {
        this.userName = userName;
        this.companyName = companyName;
        this.yrOfJoining = yrOfJoining;
        this.email = generateEmailID();
        this.emailPassword = generatePassword();


    }


    private String generatePassword() {
        StringBuilder sb = new StringBuilder();
        sb.append(generateRandomCharacter());
        for (int i = 0; i < 4; i++) {
            sb.append(generateRandomIntegerFromLimit(10));
        }
        sb.append(getFirst5CharacterFromUserName());
        return sb.toString();
    }

    private int generateRandomIntegerFromLimit(int limit) {
        return (int) (Math.random() * limit);
    }

    private char generateRandomCharacter() {
        return (char) ('a' + generateRandomIntegerFromLimit(26));

    }

    private String getFirst5CharacterFromUserName() {
        if (getUserName().length() < 5) {
            StringBuilder sb = new StringBuilder();
            int diffrence = 5 - getUserName().length();
            for (int i = 0; i < diffrence; i++) {
                sb.append("0");
            }
            return sb.toString();
        } else {
            return getUserName().substring(0, 5);
        }

    }

    private String generateEmailID() {
        /*StringBuilder sb = new StringBuilder();
        sb.append(getUserName());
        sb.append("_");
        sb.append(getYrOfJoining());
        sb.append("@");
        sb.append(getCompanyName());
        sb.append(".com");*/
        return String.format("%s_%d@%s.com", getUserName().toLowerCase(), getYrOfJoining(), getCompanyName().toLowerCase());
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getYrOfJoining() {
        return yrOfJoining;
    }

    public void setYrOfJoining(int yrOfJoining) {
        this.yrOfJoining = yrOfJoining;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }
}

class Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String companyName = scanner.nextLine();
        int yearOfJoining = scanner.nextInt();
        User user = new User(userName, companyName, yearOfJoining);
        System.out.println("Email: " + user.getEmail() + "\nPassword: " + user.getEmailPassword());
        scanner.close();
    }
}
