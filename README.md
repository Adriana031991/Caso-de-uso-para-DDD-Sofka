# [Problema]

#Caso de Estudio Kata DDD

Sistema para la gestión y manejo de préstamos de equipos y recursos multimedia.
Actualmente se cuenta con un inventario de: equipos portátiles, tabletas
electrónicas, computadores de escritorio, libros, revistas, comics, videobeans,
pantallas auxiliares, y entre otros artículos similares.

Estos equipos presentan las siguientes condiciones de uso:
1. Todos los equipos de cómputo deben permanecer en las instalaciones de la
   compañía y una vez terminada la jornada laboral deben ser devueltos al
   centro de préstamos.
2. Los elementos impresos pueden ser prestados por tiempos no mayores a una
   semana y pueden salir de las instalaciones de la compañía.
3. Los equipos de video y proyección se presta por periodos máximos de 4
   horas, deben permanecer en las instalaciones de la compañía y ser devueltos
   al centro de préstamos al finalizar la jornada laboral.
4. El solicitante del recurso debe establecer fecha y hora de retiro del recurso.
5. Un recurso puede ser reservado con 2 semanas de anticipación y cancelada
   su reserva 8 horas antes de la fecha prevista de uso.

Se ha establecido una política de prioridades según el número de recursos
solicitados, a más recursos solicitados acumulados en un mes menor el nivel de
prioridad. Adicionalmente un solicitante no puede reservar más de 2 elementos por
categoría, con excepción de los elementos impresos.
En caso de no retirar los elementos reservados, no devolver los elementos
prestados a tiempo o de evidenciarse mal uso de los mismos el solicitante puede ser
sancionado cancelando sus reservas posteriores y bloquearse del sistema de
reservas por un periodo definido por el administrador del centro de préstamos.
El control de retiro y reintegro de elementos se realiza mediante un dispositivo lector
al código de barras instalado en el equipo principal del centro de préstamos.
