 class Iphones implements Smartphonesys, OperatingSystem {

  @Override
  public void call(String number) {
      System.out.println("Calling " + number);
  }

  @Override
  public void sms(String number, String message) {
      System.out.println("Sending SMS to " + number + ": " + message);
  }

  @Override
  public void internet() {
     System.out.println("Browsing the internet");
  }

  public String getOSName(){
      return "iOS";
  }

  }



