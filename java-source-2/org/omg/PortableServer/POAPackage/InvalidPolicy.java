package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/InvalidPolicy.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-macosx-x86_64/jdk8u20/1074/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, July 30, 2014 1:39:25 PM PDT
*/

public final class InvalidPolicy extends org.omg.CORBA.UserException
{
  public short index = (short)0;

  public InvalidPolicy ()
  {
    super(InvalidPolicyHelper.id());
  } // ctor

  public InvalidPolicy (short _index)
  {
    super(InvalidPolicyHelper.id());
    index = _index;
  } // ctor


  public InvalidPolicy (String $reason, short _index)
  {
    super(InvalidPolicyHelper.id() + "  " + $reason);
    index = _index;
  } // ctor

} // class InvalidPolicy
