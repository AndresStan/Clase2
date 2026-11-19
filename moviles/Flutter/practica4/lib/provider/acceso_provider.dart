import 'package:flutter/material.dart';


class AccesoProvider extends ChangeNotifier {

  String email = "";
  String password = "";

  String get cogerEmail => email;
  String get cogerPassword => password;

  void ponerEmail(String v){
    email = v;
    notifyListeners();
  }

   void ponerPassword(String v){
    password = v;
    notifyListeners();
  }


}