package com.company;

public class Seguridad_password {

        public enum  Niveldeseguridad {
            DEBIL, MEDIO, FUERTE
        }

        public static Niveldeseguridad accesoPassword(String password){

            if(password.length()<8){//SI LA CONTRASEÑA CONTIENE MENOS DE 8 CARACTERES ES DEBIL
                return Niveldeseguridad.DEBIL;
            }
            if(password.matches("[a-z A-z]+")){//MATCHES IDENTIFICA QUE LOS SI TIENE SOLO LETRAS DE LA A - Z ES CONSIDERADO DEBIL
                return Niveldeseguridad.DEBIL;
            }

            if(password.matches("[a-z A-z 0-9]+")){ //MATCHES IDENTIFICAS QUE SI LOS CARACTERES INCLUYEN TANTO LETRAS Y NUMEROS LA
                //CONTRASEÑA ES CONSIDERADA ENTONCES COMO DE NIVEL MEDIO
                return Niveldeseguridad.MEDIO;
            }
            return Niveldeseguridad.FUERTE;//EN CASO DE QUE NO SE CUMPLA NINGUNA DE LAS ANT SE CONSIDERA UNA CONSTRASELÑA FUERTE
        }

}
