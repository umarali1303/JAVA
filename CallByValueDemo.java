public class CallByValueDemo {
    int data=10;
    void change (){
        data=data+100;
        System.out.println(data);
    }
    public static void main(String[] args){
        CallByValueDemo ob= new CallByValueDemo();
        System.out.println(ob.data);
        ob.change();
        System.out.println(ob.data);
    }
}
