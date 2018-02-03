;DEFTEMPLATE
(deftemplate peliculas
(slot nombre)
(multislot generos)
(slot clasificacion)
(slot director)
(slot estudio)
(slot pais)
(slot fecha)
(multislot idiomas)
(multislot atributos)
(slot edad_usuario)
)



;DEFRULES
(defrule recomendar
?x <- (peliculas (nombre ?nombre)
      (generos ?generos ?generos2)
      (clasificacion ?clasificacion)
       (director ?director)
      (estudio ?estudio)
      (pais ?pais)
        (fecha ?fecha)
      (idiomas ?idiomas ?idiomas2)
      (atributos ?atributos ?atributos2 ?atributos3 ?atributos4)
	  (edad_usuario ?edad))

=>
  (if (>= ?edad 12)then
     (if (or(eq ?generos drama) (eq ?generos2 romance)) then
         (if (eq ?clasificacion b) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos romantica)(eq ?atributos2 tragedia) )then
                    (if (or(eq ?atributos4 triste)(eq ?atributos3 rupturas)) then
                     (printout t "Deberias ver Blue Valentine" crlf)
)))))
else
(printout t "No tienes edad para ver la pelicula Blue Valentine" crlf)
)

(if (>= ?edad 12)then
(if (or(eq ?generos drama) (eq ?generos2 comedia)) then
         (if (eq ?clasificacion b) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos romantica)(eq ?atributos2 tragedia)  )then
                    (if (or(eq ?atributos4 neutro)(eq ?atributos3 rupturas)) then
                     (printout t "Deberias ver 500 dias con ella" crlf)
)))))
else
(printout t "No tienes edad para ver la pelicula 500 dias con ella" crlf)
)

(if (>= ?edad 1)then
(if (or(eq ?generos animacion) (eq ?generos2 fantasia)) then
         (if (eq ?clasificacion aa) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos familia)(eq ?atributos2 tragedia) )then
                    (if (or(eq ?atributos3 animada)(eq ?atributos4 neutro)) then
                     (printout t "Deberias ver Coco" crlf)
)))))
else
(printout t "No tienes edad para ver la pelicula Coco" crlf)
)

(if (>= ?edad 1) then
(if (or(eq ?generos drama) (eq ?generos2 musical)) then
         (if (eq ?clasificacion aa) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos romantica)(eq ?atributos2 musical) )then
                    (if (or(eq ?atributos4 feliz)(eq ?atributos3 familia) ) then
                     (printout t "Deberias ver The Greastest Showman" crlf)
)))))
else
(printout t "No tienes edad para ver la pelicula The Greastest Showman" crlf)
)

(if (>= ?edad 12) then
(if (eq ?generos drama) then
         (if (eq ?clasificacion b) then
            (if (eq ?idiomas espanol)then
               (if (or(eq ?atributos comedia)(eq ?atributos2 tragedia) )then
                    (if (or(eq ?atributos4 triste)(eq ?atributos3 dramatica)) then
                     (printout t "Deberias ver La lengua de las mariposas" crlf)
)))))
else
(printout t "No tienes edad para ver la pelicula La lengua de las mariposas" crlf)
)

(if (>= ?edad 1) then
(if (eq ?generos drama) then
         (if (eq ?clasificacion a) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos familia)(eq ?atributos2 dramatica) )then
                    (if (or(eq ?atributos4 feliz)(eq ?atributos3 comedia)) then
                     (printout t "Deberias ver En busca de la felicidad" crlf)
)))))
else
(printout t "No tienes edad para ver la pelicula En busca de la felicidad" crlf)
)
)

