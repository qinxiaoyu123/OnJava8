public class EnumTest {
    Course takeCourse;

    EnumTest(Course takeCourse) {
        this.takeCourse = takeCourse;
    }


    public static void main(String[] args) {
        Course course1 = Course.CHINESE;
        System.out.println(course1);
        for (Course c1 : Course.values())
            System.out.println(c1.ordinal());

        EnumTest test1 = new EnumTest(Course.CHINESE);
        EnumTest test2 = new EnumTest(Course.ENGLISH);
        EnumTest test3 = new EnumTest(Course.MATH);

        test1.printTakeCourse();
        test2.printTakeCourse();
        test3.printTakeCourse();
    }

    private void printTakeCourse() {
        switch (this.takeCourse) {
            case ENGLISH:
                System.out.println("take english");
                break;
            case CHINESE:
                System.out.println("take chinese");
                break;
            default:
                System.out.println("take other courses");
                break;
        }
    }
}

