package Exams.Week1.ArrayLists;

import java.util.UUID;

public class person {
    private String username;
    private String sin;

    public person(String username){
        this.username = username;
        this.sin = generateSin();
    }
    private String generateSin(){
        return "!!"+username.charAt(0)+"%%"+username.substring(1,username.length()-1)+"&&"+username.charAt(username.length()-1);
    }
    public String getUsername(){
        return username;
    }
    public boolean isSamePerson(person other){
        return this.sin.equals(other.sin);
    }
}