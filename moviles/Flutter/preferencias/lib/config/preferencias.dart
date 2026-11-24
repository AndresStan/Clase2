
import 'package:shared_preferences/shared_preferences.dart';

class Preferencias {

   static late SharedPreferences _preferencias;

   // Paso 1 - Aqui creo las propiedades globales que quiero manejar en mi APP
   static bool _permisoUbicacion = false;
   static bool _permisoCamara = false;
   static bool _temaOscuro = false;
   static String _nombre = "";

   static Future init() async {
      _preferencias = await SharedPreferences.getInstance();
   }

   // Paso 2 - Me he de crear los metodos que me devuelvan los valores
   static get nombre => _preferencias.getString('nombre') ?? _nombre;
   static get permisoUbicacion => _preferencias.getBool('ubicacion') ?? _permisoUbicacion;
   static get permisoCamara => _preferencias.getBool('camara') ?? _permisoCamara;
   static get darkMode => _preferencias.getBool('dark') ?? _temaOscuro;

   // Paso 3 - Me he de crear los metodos para CAMBIAR y almacenar los valores en Memoria
   static set nombre(String nombre){
    _nombre = nombre;
    _preferencias.setString("nombre", nombre);
   }


   static set permisoUbicacion(bool ubicacion){
    _permisoUbicacion = ubicacion;
    _preferencias.setBool("ubicacion", ubicacion);
   }


   static set permisoCamara(bool camara){
    _permisoCamara = camara;
    _preferencias.setBool("camara", camara);
   }


   static set darkMode(bool dark){
    _temaOscuro = dark;
    _preferencias.setBool("dark", dark);
   }


    

}