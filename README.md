Sistema de gestión de torneos de eSports

Autor:
Cristina Sanz Alonso
CristinaSanzAlonso(GitHub)

Descripción del proyecto:
Este proyecto implementa un sistema de gestión de torneos de eSports utilizando UML para el modelado y Java para la implementación.
Enlace al repositorio: 

1.	Análisis del problema y requisitos del sistema

•¿Quiénes son los actores que interactúan con el sistema?
En este enunciado podemos identificar diferentes actores, principalmente se encuentra el gestor de torneos que es el que más acciones puede realizar. 
También se puede identificar un administrador o administración que es quien se encarga de todos los torneos a realizar.
La principal diferencia entre ambos actores sería que habría un gestor de torneos por cada torneo mientras que el/la administración se encarga de todos 
los torneos. 
También cabe resaltar un último actor que sería el usuario o jugador, ya que también tiene acceso a diferentes acciones.

•¿Cuáles son las acciones que cada actor puede realizar?
El administrador se encargaría de la gestión de equipos y jugadores.
Como acciones del administrador se podrían encontrar: 
  - registrar equipos
  - añadir jugadores
  - consultar las listas de jugadores
    
El gestor de torneos se encargaría de gestionar los torneos, las partidas y sus resultados, y también de los premios.
Como acciones del gestor de torneos se podrían encontrar:
  - generar el torneo
  - inscribir a los quipos al torneo
  - generar el emparejamiento de jugadores
  - registrar los resultados
  - actualizar la clasificación
  - asignar los premios a los ganadores
    
Por último, el usuario o jugador podrá llevar a cabo las siguientes acciones:
  - consultar las listas de quipos y jugadores
  - comprobar la clasificación de equipos

•¿Cómo se relacionan entre sí las entidades del sistema?
Siguiendo el diagrama de clases realizado, podemos ver que hay cinco entidades:
  - Partida
  - Torneo
  - Equipo
  - EquipoEnTorneo
  - Jugador
Torneo y Partida tienen una relación de 1 a muchos, es decir en un torneo puede hacer una o varias partidas, sin embargo una partida de un torneo solo tiene cabida en un torneo en concreto.
Torneo y Equipo tienen una relación de muchos a muchos por ello se ha creado un tabla intermedia que gestiones esa relación convirtiéndola en dos relaciones de 1 a muchos.
Equipo y Jugador tienen una relación de 1 a muchos, es decir en un equipo puede haber uno o varios jugadores, mientras que un jugador solo pertenece a un equipo.
