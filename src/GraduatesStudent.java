public class GraduatesStudent extends Student{
    
    private String studyLevel;
    private String thesisAdviser;
    
    public void oralExamination(){
        System.out.println("oralExamination");
    }
    public void thesisExaminnation(){
        System.out.println("thesisExaminnation");
    }

    @Override
    public void payment() {
        System.out.println("payment by credit");
    }
    
    }

