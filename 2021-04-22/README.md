# Enunciado: Algo Mail

## Requerimientos funcionales:

  

La facultad está implementando el mecanismo de inicio de sesión de un cliente. Este mail tiene varios mecanismos de autenticación, a saber:

1.  Simple: Solo se pide password y usuario.
    
2.  Multi-factor:
  -  Se pide usuario y un código de seguridad (un texto).
  -  Se pide usuario y una imagen (un QR).
  -  Se pide usuario y password, si son válidos, se pide un código de seguridad (tal como en el punto 2.a).
    

Nota 1:

No es necesario modelar la configuración del mecanismo de autorización que el usuario tenga configurado en su cuenta. 

  

Nota 2: 

Si algo no está especificado en el enunciado, agregue los supuestos en el diagrama de clases como notas.

  
Pedimos

1.  Escribir el código necesario para:
    

1.  Un usuario con una configuración de cuenta equivalente a 1, intenta iniciarse sesión de manera satisfactoria.
    
2.  Un usuario con una configuración de cuenta equivalente a 2.b, intenta iniciarse sesión de manera satisfactoria.
    
3.  Un usuario con una configuración de cuenta equivalente a 2.c, intenta iniciar sesión y falla al ingresar el código de seguridad.
    

3.  Diagrama de secuencias para los escenarios antes descritos.
    
4.  Diagrama de clases (completo) que corresponden a los diagramas de secuencia.

## Posibles soluciones

- [alternativa I](alternativa_I)
- [alternativa II](alternativa_II)
