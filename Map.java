import java.util.ArrayList;
import java.util.List;

public class Map {

    private String levelName;
    private int sizeX;
    private int sizeY;
    private String[][] board;
    public List<Element> elements;

    public Map(String levelName, int sizeX, int sizeY) {
        this.levelName = levelName;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.board = new String [sizeX][sizeY];
        this.elements = new ArrayList<Element>();
        generateMap();
    }
    public List<Element> getElements() {
        this.elements = elements;
        return elements;
    }
    public String[][] getBoard() {
        return board;
    }

    public void generateObstracles() {
        int minWeight = 1;
        int maxWeight = 150;
        int minX = 1;
        int minY = 1;
        int maxX = sizeX - 1;
        int maxY = sizeY - 1;
        int numberOfElements = 20;

        int elementWeight = (int)(Math.random() * ((maxWeight - minWeight) + 1)) + minWeight;
        
        boolean randomBoolean = Math.random() > 0.5;

        for (int i = 0; i < numberOfElements; i++) {
            int elementX = (int)(Math.random() * ((maxX - minX) + 1)) + minX;
            int elementY = (int)(Math.random() * ((maxY - minY) + 1)) + minY;

            elements.add(new Rock("RRR", elementWeight, elementX, elementY, randomBoolean, randomBoolean));
        }   
    }
    
    public String[][] generateMap() {
        String sand = " . ";
        String frameHorizontal = "---";
        String frameVertical = " | ";
        
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                if (x == 0 || x == sizeX - 1) {
                    this.board[x][y] = frameHorizontal;
                }
                else if (y == 0 || y == sizeY - 1) {
                    this.board[x][y] = frameVertical;
                }
                else {
                    this.board[x][y] = sand;
                }
                
                // add StaticElements here -- create class to reflect that
                for (Element element : elements) {
                     int xR = element.getX();
                     int yR = element.getY();
                     this.board[xR][yR] = element.getLook();
                 }
            }
        }

        return this.board;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

}
