package OOP.Lection10;

public class Teacher extends User {
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects = 0;

    public Teacher() {}

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void addSubject (String subject) {
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    public String showSubjects () {
        String s = "";
        for (int i=0; i<sizeOfSubjects; i++) {
            s = s + "\n\t" + subjects[i];
        }
        return s;
    }


    @Override
    public String getUserData() {
        return id + ". " + " " + login + " " + password + " " + nickName + " " + status + " " + subjects + showSubjects();
    }
}




