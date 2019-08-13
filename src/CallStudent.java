
public class CallStudent {
    
    public static void main(String[] args) {
        System.out.println("Hello...");
        Student fah = new Student();
        System.out.println("Object fah = "+fah);
        fah.addCourse();
        fah.dropCourse();
        fah.payment();
        fah.enroollment();
        
        //crete object GraduateStudent
        GraduatesStudent jira = new GraduatesStudent();
        System.out.println("object jira = "+jira);
        jira.oralExamination();
        jira.thesisExaminnation();
        jira.enroollment();
        jira.addCourse();
        jira.dropCourse();
        jira.payment();
        
    }
}
