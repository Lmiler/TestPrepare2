public class Main {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.insert(4,1);
        System.out.println(da);
    }
}