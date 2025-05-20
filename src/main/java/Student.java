public class Student implements Comparable<Student>{

    private String name;
    private int age;
    private String studentNumber;

    public Student(String n, int age, String sn){
        this.name = n;
        this.age = age;
        this.studentNumber = sn;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setStudentNumber(String sn){
        this.studentNumber = sn;
    }

    @Override
    public String toString(){
        return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
    }

    @Override
    public int compareTo(Student dude){
        return this.studentNumber.compareTo(dude.getStudentNumber());
    }

}

