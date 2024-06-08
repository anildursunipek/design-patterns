public class Client {
    public static void main(String[] args) {
        Swordsman s1 = new Swordsman();
        System.out.println(s1);
        s1.move(new Point3D(-10,0,0), 20);
        System.out.println(s1);
        s1.attack();
        System.out.println(s1);

        try{
            Swordsman s2 = (Swordsman)s1.clone();
            System.out.println(s2);
        }catch (CloneNotSupportedException exception){
            System.out.println(exception.getMessage());
        }

    }
}
