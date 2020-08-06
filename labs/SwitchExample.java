public class SwitchExample {
  public static void main(String[] args){
    char grade;
    grade = 'B';

    switch (grade) {
    case 'A':
    case 'a':
      System.out.println("Fantastic Job!");
      break;
    case 'B':
    case 'b':
      System.out.println("Good Job!");
      break;
    case 'C':
    case 'c':
      System.out.println("You're doing okay.");
      break;
    case 'D':
    case 'd':
      System.out.println("Please schecdule a conference.");
      break;
    case 'F':
    case 'f':
      System.out.println("Start finishing the homework and showing up to class.");
      break;
    default:
      System.out.println("Invalid grade");
    }
  }
}
