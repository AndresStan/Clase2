import 'package:flutter/material.dart';
import 'package:practica4/provider/acceso_provider.dart';
import 'package:provider/provider.dart';


class LoginScreen extends StatelessWidget {

  GlobalKey<FormState> _formKey = GlobalKey<FormState>();

  Map<String, String> _values = {
    "email":"",
    "password":""
  };

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("LOGIN", style: TextStyle(fontWeight: .w900),),
        backgroundColor: Colors.black,
        foregroundColor: Colors.white,
        leading: Icon(Icons.login),
        centerTitle: true,
      ),
      body: Padding(
        padding: .all(20),
        child: Form(
          key: _formKey,
          child: Column(
            crossAxisAlignment: .center,
            mainAxisAlignment: .center,
            spacing: 10,
            children: [
              Text("PRACTICA 4", style: TextStyle(fontSize: 30, fontStyle: .italic, fontWeight: .w900)),
              TextFormField(
                onChanged: (value) {
                  _values["email"]=value;
             
                },
                
                decoration: InputDecoration(
                  prefixIcon: Icon(Icons.email),
                  hintText: "Email",
                  border: OutlineInputBorder(
                    borderSide: BorderSide(
                      width: 5,
                      color: const Color.fromARGB(255, 51, 51, 51)
                      
                    )
                  ),
                  focusedBorder: OutlineInputBorder(
                    borderSide: BorderSide(
                      width: 5,
                      color: Colors.black
                    )
                  )
                ),
                
              ),
              TextFormField(
                onChanged: (value) {
                  _values["password"]=value;
                },
                
                decoration: InputDecoration(
                  prefixIcon: Icon(Icons.password),
                  hintText: "Password",
                  border: OutlineInputBorder(
                    borderSide: BorderSide(
                      width: 5,
                      color: const Color.fromARGB(255, 51, 51, 51)
                      
                    )
                  ),
                  focusedBorder: OutlineInputBorder(
                    borderSide: BorderSide(
                      width: 5,
                      color: Colors.black
                    )
                  )
                ),
                
              ),
              FloatingActionButton(
                onPressed: () {
                  print(_values);
                  context.read<AccesoProvider>().ponerEmail(_values["email"].toString());
                  context.read<AccesoProvider>().ponerPassword(_values["password"].toString());
                  Navigator.pushNamed(context, "home");
                },
                backgroundColor: Colors.black,
                foregroundColor: Colors.white,
                child: Text("Login"),
              )
            ],
          )
        ),
      )
   );
  }
}