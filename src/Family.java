import java.util.LinkedList;
import java.util.List;

public class Family {
    private String address;
    private List<Person> members = new LinkedList<>();
    private int countOfMember = 0;

    public Family() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMembers() {
        String getMembersStr = "There are " + this.countOfMember + " members: ";
        for (Person e :
                members) {
            getMembersStr += e.toString() + "\n";
        }
        getMembersStr += "...";
        return getMembersStr;
    }

    public void addMembers(Person person) {
        this.members.add(person);
        countOfMember++;
    }

    public void deleteMember(Person person) {
        this.members.remove(person);
    }

    public int getCountOfMember() {
        return countOfMember;
    }

    public void setCountOfMember(int countOfMember) {
        this.countOfMember = countOfMember;
    }

    @Override
    public String toString() {
        return "Address: " + this.address + "; Count of members: " + this.countOfMember;
    }
}
