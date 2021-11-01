package lessonlesson1;

public class Main2 {
    public static void main(String[] args) {
        University university = new University();
        Group group = new Group("ФизМат");
        Group group2 = new Group("Физкульт");

        Student ivan = new Student("Иван", 23, true);
        Student ira = new Student("Ира", 22, false);

        Student ignat = new Student("Игнат", 23, true);
        Student igor = new Student("Игорь", 43, true);
        Student oleg = new Student("Олег", 33, true);

        university.addGroup(group);
        university.addGroup(group2);

        university.addStudent(ira, "ФизМат");
        university.addStudent(ignat, "Физкульт");
        university.addStudent(igor, "ФизМат");
        university.addStudent(oleg, "История");
        university.addStudent(ivan, "История");
    }
}
