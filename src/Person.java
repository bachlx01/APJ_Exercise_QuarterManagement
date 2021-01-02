import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private Date birthday;
    private String job;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Date birthday, String job) {
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(int date, int month, int year) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String birthdayStr = date + "-" + month + "-" + year;
        Date birthday1 = format.parse(birthdayStr);
        this.birthday = birthday1;
    }

    public void setBirthday(Date date) {
        this.birthday = date;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        String birthdayFm = format.format(this.birthday);
        return "Name: " + this.name + "; Birthday: " + birthdayFm + "; Job: "+ this.job;
    }
}
