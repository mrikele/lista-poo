package questao5;

import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, java.util.Date birth){
        this.name=name;
        this.email=email;
        this.birthDate=birth;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public Date getBirth(){
        return this.birthDate;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setBirth(Date birthDate){
        this.birthDate=birthDate;
    }
}
