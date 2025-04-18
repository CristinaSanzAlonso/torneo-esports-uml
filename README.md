Sistema de gestión de torneos de eSports

Autor:
Cristina Sanz Alonso
CristinaSanzAlonso(GitHub)

Descripción del proyecto:
Este proyecto implementa un sistema de gestión de torneos de eSports utilizando UML para el modelado y Java para la implementación.
Actualmente está organizado el proyecto con los directorios y las clases pero no están implementado ni probado.
Enlace al repositorio: https://github.com/CristinaSanzAlonso/torneo-esports-uml.git

Análisis del problema y requisitos del sistema, identificación de los casos de uso y elaboración del diagrama (los diagramas están en la carpeta diagrams):

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
Siguiendo el diagrama de clases realizado, podemos ver que hay cinco clases:
  - Partida
  - Torneo
  - Equipo
  - EquipoEnTorneo
  - Jugador
Torneo y Partida tienen una relación de 1 a muchos, es decir en un torneo puede hacer una o varias partidas, sin embargo una partida de un torneo solo tiene cabida en un torneo en concreto.
Torneo y Equipo tienen una relación de muchos a muchos por ello se ha creado un tabla intermedia que gestiones esa relación convirtiéndola en dos relaciones de 1 a muchos.
Equipo y Jugador tienen una relación de 1 a muchos, es decir en un equipo puede haber uno o varios jugadores, mientras que un jugador solo pertenece a un equipo.
Análisis del tipo de relación que hay entre las clases:
Las relaciones entre clases en un diagrama pueden dar de tres formas diferentes: asociación (asociación normal, agregación o composición), herencia o dependencia. En el caso de las clases Partida,
Torneo, Equipo, EquipoEnTorneo y Jugador, existen diferentes tipos de relaciones:
  - Torneo y Partida: la relación es de composición porque no puede haber una partida si no hay un torneo.
  - Equipo y Jugador: la relación es de agregación ya que jugador es una parte del equipo (siendo el equipo el todo) y además pueden existir de manera independiente.
  - Torneo, EquipoEnTorneo y Equipo: tiene una relación de asociación sencilla, es decir clases que se relacionan entre sí sin depender entre ellas. 

Identificación de clases y relaciones: el diagrama de clases también se encuentra dentro de la carpeta diagrams. 

CONCLUSIONES: 
Esta actividad ha sido muy útil para entender cómo se modela un proyecto con UML y como en función de las relaciones que existen entre las clases se implementa de diferente manera.
