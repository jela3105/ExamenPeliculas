# ExamenPeliculas
Se tiene un conjunto de peliculas, las cuales se prentendo organizarlas, para lo cual tiene el siguiente diagrama de clases

<img src='https://user-images.githubusercontent.com/46289656/100534039-a9672580-31d0-11eb-9202-e002d7eb4c49.png'>

En la clase MPelicula, desarrollar un menú iterativo con las opciones de: 
- 1 altas, 
- 2 bajas, 
- 3 cambios, 
- 4 consultas 
- 5 fin.
<br>

Además de generar un objeto que de acceso a los métodos de la clase ALpelicula, observa que en la clase ALpelicula, hay como variable de instancia un Arralist y su contenido son objetos de la clase Pelicula.

En la clase ALpelicula desarrolla los métodos siguientes:

1.- El método para dar de alta objetos y almacenarlos en el arraylist, este método debe ser iterativo, debe preguntar si se desea dar de alta otro objeto, después de agregar alguno, en caso afimativo, pedir datos de un nuevo objeto, en caso negativo, regresar al menu principal.
<br>
2.- El método para dar de baja, el objeto debe ser buscado por medio de la clave, la cual es tecleada por el usuario, si es localizada en algún objeto del arraylist, debe ser desplegado el contenido de las variables de instancia título y costo, preguntar si desea eliminar el objeto, en el caso de responder afirmativamente, se elimina el objeto, en caso contrario, no se elimina, considerar también que si la clave no existe en el arraylist, mandar el mensaje de que no existe el objeto con esa clave.
<br>
3.- El método de cambios se debe localizar la clave, la cual es tecleada por el usuario, si la clave tecleada es localizada en un objeto del arraylist, presentar el contenido de las variables de instancia en un menú con las opciones: 1 Título y 2 costo, pidiendo cual es la variable a modificar si es tecleado 1, pedir el nuevo título, si es tecleada la opción 2, pedir el nuevo costo, además de preguntar si se desean hacer más cambios a alguna de las variables de instancia, en caso afirmativo, desplegar el menú nuevamente, en caso contrario hacer los cambios correspondientes en el ibjeto del arraylist, en caso de no existir la clave tecleada, mandar un mensaje de que la clave no existe.
<br>
4.- Desplegar todos los objetos del Arraylist.
