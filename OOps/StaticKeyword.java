public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolname="rdskfl";
        Student s2=new Student();
        System.out.println(s2.schoolname);
        
        //school name is static so same print as it for every class so if this is empety for student 2 then this is not a big deal are you understand that what am i trying to say thankyou so much !
    Student s3=new Student();
    System.out.println(s3.schoolname="vidyawati");
    //after this all the school name after updation will become vidyawati and now when we call school name for any student after this it will print vidyawati.
   
        
    }
    
}
class Student{
    String name;
    int rollno;
    static String schoolname;
    void SetName(String name){
        this.name=name;
    }
    String GetName(){
        return this.name;
    }
}
