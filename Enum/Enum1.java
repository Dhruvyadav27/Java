package Enum;

public class Enum1 {
    public static void main(String[] args) {
        paymentStatus status = paymentStatus.Pending;
        System.out.println(status.name());
        
    }
    
}
enum paymentStatus {
    Success,
    Failed,
    Pending;
}
//pre defined constants

