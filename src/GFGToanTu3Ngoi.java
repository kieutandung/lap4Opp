class GFGToanTu3Ngoi {
    public static void main (String[] args) {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);

        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0, 5);
        System.out.println(message);
    }
}
//int a = 5;
//int b = 10;
//int max = (a > b) ? a : b; // max sẽ nhận giá trị 10

