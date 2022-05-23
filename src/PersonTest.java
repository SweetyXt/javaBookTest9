 abstract class  Person {
    private int basepay;
    private int teachtime;
    private int teachpay;

    public int getBasepay() {
        return basepay;
    }

    public void setBasepay(int basepay) {
        this.basepay = basepay;
    }

    public int getTeachtime() {
        return teachtime;
    }

    public void setTeachtime(int teachtime) {
        this.teachtime = teachtime;
    }

    public int getTeachpay() {
        return teachpay;
    }

    public void setTeachpay(int teachpay) {
        this.teachpay = teachpay;
    }
    public int pay(){
        return basepay+teachpay*teachtime;
    }
}

class Assistant extends Person{
    @Override
    public void setBasepay(int n) {
        super.setBasepay(800);
    }
    public void setTeachpay(int n){
        super.setTeachpay(25);
    }
    public int pay(){
        return super.pay();
    }
}


public class PersonTest{

}
