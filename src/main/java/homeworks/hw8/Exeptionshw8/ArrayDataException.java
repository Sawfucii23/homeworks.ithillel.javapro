package homeworks.hw8.Exeptionshw8;

public class ArrayDataException extends Exception{
    public ArrayDataException(int column, int row){
    super("Element at row [" + row + "]  \n" + "and column [" + column + "]  \n" + "is not a number");
    }
}
