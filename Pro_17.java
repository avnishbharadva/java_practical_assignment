import Exam.Result;

class Pro_17 {
    public static void main(String[] args) {
        try {
            Result r = new Result();
            r.calcResult();
            System.out.println(r);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}