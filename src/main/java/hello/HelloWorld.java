package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    //Greeter greeter = new Greeter();
    //System.out.println(greeter.sayHello());

    try {
      OkPost example = new OkPost();
      String json = example.bowlingJson2("Jesse", "Jake");
      //String response = example.post("http://www.roundsapp.com/post", json);
      String url = "https://gw.codein.net/echo";
      System.out.println("url: " + url + " method: POST body: " + json);
      String response = example.post(url, json);
      System.out.println("resp: " + response);

    } catch(Exception e) {
      System.out.println(e);
    }
    System.out.println("exiting ...");
  }
}
