import org.junit.jupiter.api.Test;

public class ProjectJavaGetSet {
    @Test
    public void workingWithOrer(){
        Order firstOrder = new Order();

        firstOrder.setTotalPrice(12.34);
        firstOrder.setAddress("HoHum 205");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(55.96);
        secondOrder.setAddress("Trey 22");
        secondOrder.setItemCount(5);

        System.out.println("Hello, world!");
        System.out.println("1st order:");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2n order");
        System.out.println(secondOrder.getTotalPrice());

    }
}
