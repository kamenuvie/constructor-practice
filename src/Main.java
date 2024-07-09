public class Main extends Vendor {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Vendor vendor1 = new Vendor(
               1,
                "King",
                "king@gmail.com",
                30

        );
         Vendor vendor2 = new Vendor(
                 2,
                 "Beatrice",
                 "bea@gmail.com",
                 20
         );
        vendor1.setName("Zainab");
        System.out.println(
                vendor1.getId() +"\n"+
                vendor1.getName() + " \n "+
                vendor1.getEmail()+ "\n " +
                vendor1.getAge());
        System.out.println(
                vendor2.getId() +"\n"+
                vendor2.getName() + " \n "+
                vendor2.getEmail()+ "\n " +
                vendor2.getAge());


    }

}