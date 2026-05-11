package Enum;

enum Status{
    Running , Failed , Pending , Success;
}

public class EnumIfandSwitch {
    public static void main(String[] args) {
        Status s = Status.Pending;

        switch(s){
            case Running:
                 System.out.println("All good");
                 break;
            case Pending:
                 System.out.println("Status Pending");
                 break;
            case Success:
                 System.out.println("Status successful");
                 break;
            case Failed:
                 System.out.println("Try again");
                 break;
        }

        if (s == Status.Running){
            System.out.println("All good");
        }
        else if ( s == Status.Pending){
            System.out.println("Status Pending");
        }
        else if( s == Status.Failed){
            System.out.println("Try again");
        }
        else{
            System.out.println("Status successful");
        }
    }
}
