public class Account {
    private String userName;
    private String password;

    public void setUserName(String userName){
        char [] characters = userName.toCharArray();
        int numberOfDigits=0;
        int numberOfUpperLetters=0;
        int numberOfSpaces=0;
        int numberOfCharacters=0;
        for (int i = 0; i<characters.length;i++){
            if (Character.isDigit(characters[i])){
                numberOfDigits++;
            }else if (Character.isUpperCase(characters[i])){
                numberOfUpperLetters++;
            }else if (characters[i]=='_' || Character.isLetter(characters[i])){
                numberOfSpaces++;
            }else {
                numberOfCharacters++;
            }
            if (numberOfDigits>=2 && numberOfUpperLetters>=1&& numberOfCharacters==0){
                this.userName=userName;
            }else {
                this.userName=null;
            }

        }

    }
    public String getUserName(){
        return this.userName;
    }

    public void setPassword(String password){

        char [] passwordCharacters = password.toCharArray();
        int passwordLetters=0;
        int passwordDigits=0;
        int passwordUpperCase=0;
        int passwordSpaces=0;

        for (int i = 0; i <passwordCharacters.length; i++) {
            if (Character.isUpperCase(passwordCharacters[i])) {
                passwordUpperCase++;
                passwordLetters++;
            } else if (Character.isDigit(passwordCharacters[i])) {
                passwordDigits++;
            } else if (Character.isLetter(passwordCharacters[i])) {
                passwordLetters++;
            } else if (passwordCharacters[i] == ' ') {
                passwordSpaces++;
            }
            if (passwordLetters >= 7 && passwordDigits >= 1 && passwordUpperCase >= 1 && passwordSpaces == 0) {
                this.password = password;
            } else {
                this.password = null;
            }
        }

    }
    public String getPassword(String password){
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
