package Course3oops;

public  class Visitor{

static int count ;

    public static void visitorCount() {
        count++;
        System.out.println("Visitors Counnt = " + count);
    }

    public static void main(String[] args) {
//        Visitor visitor = new Visitor();
//        Visitor visitor1 = new Visitor();
//        Visitor visitor2 = new Visitor();
//        visitor.visitorCount();
//        visitor2.visitorCount();
      //  visitor2.visitorCount();
      //  visitor1.visitorCount();
        Visitor.visitorCount();
        Visitor.visitorCount();
        Visitor.visitorCount();
        Visitor.visitorCount();





    }
}
