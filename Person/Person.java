package Person;

public class Person {
    protected String firstname;
    protected String lastname;
    public Person(){
        this.firstname = "";
        this.lastname = "";
    }
    public Person(String firstname, String lastname){
        this.firstname = getFirstname();
        this.lastname = getLastname();
    }
    public void setName(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }

}


