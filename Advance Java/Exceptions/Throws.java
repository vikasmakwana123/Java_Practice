class Exceptions {
    public void show() throws ClassNotFoundException{//the exception that can occur in this class would not be handled by this class it would transfer it to other class and the other class would handle it 
        Class.forName("Throws");
    };
}




public class Throws {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        Exceptions obj = new Exceptions();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
