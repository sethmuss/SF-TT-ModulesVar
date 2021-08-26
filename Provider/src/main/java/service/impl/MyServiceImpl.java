package service.impl;

import service.intf.MyServiceIF;

public class MyServiceImpl implements MyServiceIF {
  @Override
  public String getMessage() {
    return "Message from a service";
  }
}
