public class Main {
    private String userName;
    private String companyName;
    private int yrOfJoining;
    private String email;
    private String emailPassword;

    public Main(String userName, String companyName, int yrOfJoining) {
        this.userName = userName;
        this.companyName = companyName;
        this.yrOfJoining = yrOfJoining;
        this.email = generateEmailID();
        this.emailPassword = generatePassword();


    }

    public static void main(String[] args) {

    }

    private String generateEmailID() {
        /*StringBuilder sb = new StringBuilder();
        sb.append(getUserName());
        sb.append("_");
        sb.append(getYrOfJoining());
        sb.append("@");
        sb.append(getCompanyName());
        sb.append(".com");*/
        return String.format("%s_%d@%s.com", getUserName(), getYrOfJoining(), getCompanyName());
    }

    private String generatePassword() {


        return "";
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
