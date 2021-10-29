package Bai1;

public class Person {
    private String name, gender, hobby;
    private int age;

    public Person(){
        this.name = "Nguyễn Xuân Trường";
        this.age = 19;
        this.gender =  "Men lì";
        this.hobby = "Chạy pộ";
    }

    public Person(String name, int age, String gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getHobby(){
        return hobby;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String toString(){
        return name + " " + age + " " + gender + " " + hobby;
    }

}
