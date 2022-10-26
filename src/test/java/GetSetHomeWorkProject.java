import org.junit.jupiter.api.Test;
import projectJava1HW.*;

public class GetSetHomeWorkProject {
    @Test

    public void workingWithBox(){
        Box firstBox = new Box();

        firstBox.setWidth(15.45);
        firstBox.setColor("Grey");

        Box secondBox = new Box();

        secondBox.setWidth(24.52);
        secondBox.setColor("White");

        System.out.println("Find box!");
        System.out.println("1st box:");
        System.out.println(firstBox.getWidth());

        System.out.println("2n box");
        System.out.println(secondBox.getWidth());

    }
@Test

    public void workingWithCalendar(){
        Calendar firstCalendar = new Calendar();

        firstCalendar.setNumberMonths(12);
        firstCalendar.setTitle("I like calendar");

        Calendar secondCalendar = new Calendar();

        secondCalendar.setNumberMonths(24);
        secondCalendar.setTitle("Two year in one");

        System.out.println("New year!");
        System.out.println("1st calendar:");
        System.out.println(firstCalendar.getNumberMonths());

        System.out.println("2n calendar");
        System.out.println(secondCalendar.getNumberMonths());

    }
@Test
    public void workingWithCap(){

        Cap firstCap = new Cap();

        firstCap.setBrandName("Nike");
        firstCap.setTypeCap("sport");

        Cap secondCap = new Cap();

        secondCap.setBrandName("Adidas");
        secondCap.setTypeCap("winter cap");

        System.out.println("What cap i want to used");
        System.out.println("1st cap");
        System.out.println(firstCap.getBrandName());

        System.out.println("2n cap");
        System.out.println(secondCap.getBrandName());

    }

    @Test
    public void workingWithFolder(){
        Folder firstFolder = new Folder();

        firstFolder.setColor("Black");
        firstFolder.setNumberCompartments(25);

        Folder secondFolder = new Folder();

        secondFolder.setColor("Red");
        secondFolder.setNumberCompartments(15);

        System.out.println("organizer in the folder");
        System.out.println("1st folder");
        System.out.println(firstFolder.getColor());

        System.out.println("2n folder");
        System.out.println(secondFolder.getColor());
    }

    @Test
    public void workingWithHeadphones(){
        Headphones firstHeadphones = new Headphones();

        firstHeadphones.setPrice(29.99);
        firstHeadphones.setColor("blue");

        Headphones secondHeadphones = new Headphones();

        secondHeadphones.setPrice(15.99);
        secondHeadphones.setColor("white");

        System.out.println("Headphones");
        System.out.println("1st headphones:");
        System.out.println(firstHeadphones.getPrice());

        System.out.println("2n headphones:");
        System.out.println(secondHeadphones.getColor());
    }

    @Test
    public void workingWithPhoto(){

        Photo firstPhoto = new Photo();

        firstPhoto.setPrice(8);
        firstPhoto.setColor("Black/White");

        Photo secondPhoto = new Photo();

        secondPhoto.setPrice(12);
        secondPhoto.setColor("color");

        System.out.println("OrderPhoto");
        System.out.println("1st photo:");
        System.out.println(firstPhoto.getPrice());

        System.out.println("2n Photo:");
        System.out.println(secondPhoto.getColor());
    }

    @Test
    public void workingWithPrinter(){

        Printer firstPrinter = new Printer();

        firstPrinter.setName("Puntum");
        firstPrinter.setTypePrint("wireless");

        Printer secondPrinter = new Printer();

        secondPrinter.setName("HP");
        secondPrinter.setTypePrint("wired");

        System.out.println("We love print");
        System.out.println("1st printer:");
        System.out.println(firstPrinter.getName());

        System.out.println("2n printer");
        System.out.println(secondPrinter.getTypePrint());

    }

    @Test
    public void workingWithTable(){

        Table firstTable = new Table();

        firstTable.setBrandName("Okyra");
        firstTable.setTypeTable("wood");

        Table secondTable = new Table();

        secondTable.setPrice(89);
        secondTable.setHeight(56.66);

        System.out.println("Buy table");
        System.out.println("1st table:");
        System.out.println(firstTable.getBrandName());

        System.out.println("2n table:");
        System.out.println(secondTable.getPrice());


    }
    @Test
    public void workingWithWindow(){

        Window firstWindow = new Window();

        firstWindow.setPieceWindow(799);
        firstWindow.setBrandName("Avrora");

        Window seconndWindow = new Window();

        seconndWindow.setBrandName("Lidia");
        seconndWindow.setPieceWindow(788);

        System.out.println("Buy window");
        System.out.println("1st window:");
        System.out.println(firstWindow.getBrandName());

        System.out.println("2n window:");
        System.out.println(seconndWindow.getPieceWindow());

    }
}

