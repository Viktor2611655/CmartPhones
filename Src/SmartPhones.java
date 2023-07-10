public abstract class SmartPhones {
    public static void main(String[] args) {
       Smartphonesys androidPhone =  new Androids();
       Smartphonesys Iphones =  new Iphones();
       
       
       androidPhone.call("23424242");
       androidPhone.sms("2424225","Шо ты? ");
       androidPhone.internet();
        System.out.println("Operating System: " + ((OperatingSystem) androidPhone).getOSName());


        Iphones.call("252525");
        Iphones.sms("35363636", "Привіт, що робіш?");
        Iphones.internet();
        System.out.println("Operating System: " + ((OperatingSystem) Iphones).getOSName());


    }
}
