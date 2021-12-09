public class instance {
    static int count = 0;
    {
        count++;
    }

}
class main{
    public static void main(String ...args){
        instance obj1 = new instance();
        instance obj2 = new instance();
        instance obj3 = new instance();
        instance obj4 = new instance();
        instance obj5 = new instance();

        System.out.println(instance.count);
    }
}
