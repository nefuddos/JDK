package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotFoundReasonHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, June 21, 2013 12:58:27 PM PDT
*/


/**
         * Indicates the reason for not able to resolve.
         */
public final class NotFoundReasonHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.NotFoundReason value = null;

  public NotFoundReasonHolder ()
  {
  }

  public NotFoundReasonHolder (org.omg.CosNaming.NamingContextPackage.NotFoundReason initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.NotFoundReasonHelper.type ();
  }

}