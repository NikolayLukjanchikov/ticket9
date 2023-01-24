public class Main {
    public static void main(String[] args) {
        try {
            ///....
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Выпало исключение Ill или NPE");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}