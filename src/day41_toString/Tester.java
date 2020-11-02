package day41_toString;
/*
   Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
        create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
        create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
        create a class called MyScrumTeam:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
                    Answer the interview question "Tell me about your scrum team"
 */
public class Tester {

    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, char gender,long employeeID, String jobTitle, double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name+" smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitle+", Salary: "+salary+", Employee ID: "+employeeID;
    }

}
//Create next class here