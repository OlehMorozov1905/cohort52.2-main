package homework_16.luts.student;


public class StudenAppl {

    //

    public static void main(String[] args) {

        Student std1 = new Student(1,"Lion", "Smit", 2006, "Computer Science");
        Student std2 = new Student(2,"Gans", "Fritz", 2005,"Mathematics");
        Student std3 = new Student(3,"Leo", "Gluck", 2009, "Physics");

        System.out.println("Students in the system:");
        System.out.println (std1.displayStudent());
        System.out.println (std3.displayStudent());
        System.out.println(std2.displayStudent());

        System.out.println("\nProcess of studying:");

        std1.study();
        std2.passExam();
        std3.takeVacation();
    }

}
