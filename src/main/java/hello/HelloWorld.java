package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  static byte[] encodeId(long id) {
    byte[] msg = new byte[8];
    msg[0] = (byte)((id>>56)&0xffl);
    msg[1] = (byte)((id>>48)&0xffl);
    msg[2] = (byte)((id>>40)&0xffl);
    msg[3] = (byte)((id>>32)&0xffl);
    msg[4] = (byte)((id>>24)&0xffl);
    msg[5] = (byte)((id>>16)&0xffl);
    msg[6] = (byte)((id>>8)&0xffl);
    msg[7] = (byte)((id)&0xffl);
    return msg;
  }

  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());


    byte[] msg = encodeId(1234567890123456789L);
    long new_id =
      ((long)(char)msg[0])<<56
      | ((long)(char)msg[1])<<48
      | ((long)(char)msg[2])<<40
      | ((long)(char)msg[3])<<32
      | ((long)(char)msg[4])<<24
      | ((long)(char)msg[5])<<16
      | ((long)(char)msg[6])<<8
      | (long)(char)msg[7];

    System.out.println("id: " + new_id);
    try {
      OkPost.ok_main(args);
    } catch(Exception e) {
      System.out.println(e);
    }
  }
}
