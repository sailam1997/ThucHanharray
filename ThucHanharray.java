import java.util.Scanner;
public class ThucHanharray {
    public static void main(String[] args) {
        String[] students ={"Duc","Nghiem","Quynh","Nghiem"};
        Scanner scanner= new Scanner(System.in);
        String input_name=scanner.nextLine();
        boolean isExist = false;
        for (int i=0; i< students.length; i++){
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list "+input_name+"is:"+(i+1));
                isExist= true ;
                break;
            }
        }
        if(!isExist)
            System.out.println("Not found "+input_name+"in the list.");
    }
}
