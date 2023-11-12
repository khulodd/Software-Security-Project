/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;

/**
 *
 * @author HONOR
 */
public class IDandPassword {

  private String ID;
  private String password;

  public IDandPassword(String ID, String password) {
    this.ID = ID;
    this.password = password;
  }

  IDandPassword() {
    this.ID = "user123";
    this.password = "1234#";
  }

  public boolean checkID(String inputID) {
    return inputID.equals(ID);
  }

  public boolean checkPassword(String inputPassword) {
    return inputPassword.equals(password);
  }

  HashMap<String, String> getLoginInfo(String un, String pass) {
    HashMap<String, String> linfo = new HashMap<String, String>();
    linfo.put(un, pass);
    return linfo;
  }
}
