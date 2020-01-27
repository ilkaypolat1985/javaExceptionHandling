public class Main {

    public static void main(String[] args) {
        try {
            int[] numbers = new int[]{1, 2, 3};

            System.out.println(numbers[3]);
            System.out.println("Başarıyla çalıştı");
        }catch (StringIndexOutOfBoundsException exc){
            System.out.println("StringIndexOutOfBoundsException : " + exc.getMessage());
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("ArrayIndexOutOfBoundsException : " + exc.getMessage());
        }catch (Exception exc){
            System.out.println("Exception : " + exc.getMessage());
        }finally {
            System.out.println("Releasing resources");
        }


    }
}
