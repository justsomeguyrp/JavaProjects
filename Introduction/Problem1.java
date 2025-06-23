class Problem1{
// Program to fine net salary of a person:
    public static void main(String args[]){
        int salary = 350;
        int fine = 30;
        int present = 25;
        salary *= present;
        int absent = 5;
        fine *= absent;
        salary -= fine;
        System.out.println(salary);
    }
}