public class StudentMarksReport {
    public static boolean check(int[] mks){
        boolean t=true;
        for (int i : mks) {
            if (i<0 || i>100) {
                t=false;
            }
        }return t;
    }
    public static void main(String[] args) {
        String[] names = {"Asha", "Ravi", "Meera", "Karan", "Neha"};
        int[] marks = {72, 85, 91, 60, 58};
        if (!check(marks)) {
            System.exit(0);
        }
        
        int total = 0;
        int highest = Integer.MIN_VALUE;
        int highestIndex = 0;
        int lowest = Integer.MAX_VALUE;
        int lowestIndex = 0;
        int passed = 0;

        // Defect: loop starts from the wrong index.
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
                highestIndex = i;
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
                lowestIndex = i;
            }
            // Defect: the pass mark is 60 or above.
            if (marks[i] >= 60) {
                passed++;
            }
        }

        // Defect: integer arithmetic is used for a fractional result.
        double average = (double)total / marks.length;

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Highest : " + highest + " (" + names[highestIndex] + ")");//here it was highest it should be highest index
        System.out.println("Lowest  : " + lowest + " (" + names[lowestIndex] + ")");
        System.out.println("Passed  : " + passed + " of " + marks.length);

        for (int i = 0; i < marks.length; i++) {
            char grade = 'F';
            // Defect: the cases do not stop after a match.
            switch (marks[i] / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
                    break;
            }
            System.out.println(names[i] + " -> " + grade);
        }
    }
}
