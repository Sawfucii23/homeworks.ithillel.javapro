package homeworks.hw8.Exeptionshw8;

public class ArraySizeExeption extends Exception{
    public ArraySizeExeption(int size){
        super("Wrong size [" + size + "].  \n" + "Array size must be 4x4");
    }
}
