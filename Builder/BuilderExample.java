import java.util.Scanner;

public class BuilderExample {

    public static void main(String[] args) {

        Boolean is_break = false;
        BrickCreator creator = new BrickCreator();

        System.out.println("Builder pattern");
        System.out.println("Example theme - bricks builer");
        System.out.println("Available input commands:");
        System.out.println("s - Simple brick");
        System.out.println("r - Rock brick");
        System.out.println("d - Decorated brick");
        System.out.println("q - Quit");

        Scanner reader = new Scanner(System.in);

        while(!is_break) {
            System.out.println("Please, enter command:");
            String c = reader.nextLine();
            if (c.equals("q")) {
                is_break = true;
            } else {
                switch (c) {
                    case "s":
                        creator.setFactory(new SimpleBrickFactory());
                        break;
                    case "r":
                        creator.setFactory(new RockBrickFactory());
                        break;
                    case "d":
                        creator.setFactory(new DecoratedBrickFactory());
                        break;
                }
                creator.createBrick();
                AbstractBrick brick = creator.getBrick();

                System.out.println("Brick was created:");
                System.out.println(brick.getDescription());
                System.out.println("");
            }
        }

        reader.close();

    }
}