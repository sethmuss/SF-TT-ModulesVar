package runhere;

import service.intf.MyServiceIF;
import wasskindasecret.Attack;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class RunFromHere {
  public static void main(String[] args) throws Throwable {
    System.out.println(stuff.PublicStuff.message);
//    System.out.println(kindasecret.NotForYou.mySecret);
    System.out.println(Attack.myMessage);

//    System.out.println(otherstuff.);

    Class<?> cl = Class.forName("kindasecret.NotForYou");

    System.out.println(cl);
    Field f = cl.getDeclaredField("realSecret");
    f.setAccessible(true);
    System.out.println(f.get(null));

    ServiceLoader<MyServiceIF> loader = ServiceLoader.load(MyServiceIF.class);
    for (MyServiceIF serv : loader) {
      System.out.println("Found a service " + serv.getClass());
      System.out.println("Service message is " + serv.getMessage());
    }
    System.out.println("No more services found");
  }
}
