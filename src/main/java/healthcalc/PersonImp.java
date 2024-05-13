package healthcalc;

public class PersonImp implements Person{
    private float weight;
    private float height;
    private Gender gender;
    private int age;
    public PersonImp(float weight, float height,Gender gender, int age){
        this.weight=weight;
        this.height=height;
        this.gender=gender;
        this.age=age;
    }
    public PersonImp(float height, Gender gender){
        this.height= height;
        this.gender= gender;
    }
    @Override
    public float weight() {
        return weight;
    }

    @Override
    public float height() {
        return height;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public int age() {
        return age;
    }

}
