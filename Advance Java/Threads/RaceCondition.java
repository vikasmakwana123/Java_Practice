

class Count {
    int count;
    public synchronized void increment(){//This ensures that the increment method is used only by one thread at a time
        count++;
    }
}
public class RaceCondition {
    public static void main(String[] args) {
            Count c = new Count();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();

            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                 c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        
        System.out.println(c.count);//The main method does not wait for the t1 and t2 to get completed so that why it prints 0 as count value  
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
         System.out.println(c.count);
    }
}
