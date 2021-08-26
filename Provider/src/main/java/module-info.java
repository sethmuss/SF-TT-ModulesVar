// OUCH!!! should be (stylistically) all lower case, with dots.
/*open */module Provider {
  // exports can export to nonexistent module for extension later
  exports stuff to Client, NonExistent;
//  requires java.base;
  opens kindasecret to Client, NonExistent;
  exports service.intf;

  provides service.intf.MyServiceIF with service.impl.MyServiceImpl;
}