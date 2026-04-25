package Java_basics.Java9Video;

class Computer{

    public void playMusic(){
        System.out.println("Playing the Music .......");
    }

    public String getMeAPen(int cost){
        if(cost>=10){
            return "here is your pen";
        }
        return "Sorry, you don't have enough money";
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.playMusic();
        String Str =c1.getMeAPen(30);
        System.out.println(Str);

        String Str1 =c1.getMeAPen(2);
        System.out.println(Str1);
    }
    
}
