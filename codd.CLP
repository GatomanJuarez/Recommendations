(defglobal ?*global-var* = "") 
(defglobal ?*global-var1* = "") 
(defglobal ?*global-var2* = "") 
(defglobal ?*global-var3* = "") 
(defglobal ?*global-var4* = "") 
(defglobal ?*global-var5* = "") 
(defglobal ?*global-var6* = "") 
(defglobal ?*global-var7* = "") 
(defglobal ?*global-var8* = "") 
(defglobal ?*global-var9* = "") 
(defglobal ?*global-var10* = "") 
(defglobal ?*global-var11* = "") 

;DEFTEMPLATE
(deftemplate peliculas
(slot nombre  (type SYMBOL) )
(multislot generos (type SYMBOL) )
(slot clasificacion (type SYMBOL) )
(slot director (type SYMBOL) )
(slot estudio (type SYMBOL) )
(slot pais (type SYMBOL))
(slot fecha  (type INTEGER)  )
(multislot idiomas (type SYMBOL))
(multislot atributos (type SYMBOL) )
(slot edad_usuario   (type INTEGER)  )
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
                     (bind ?*global-var6* "Deberias ver Blue Valentine") 
)))))
else
(printout t "No tienes edad para ver la pelicula Blue Valentine" crlf)
(bind ?*global-var* "No tienes edad para ver la pelicula Blue Valentine") 
)

(if (>= ?edad 12)then
(if (or(eq ?generos drama) (eq ?generos2 comedia)) then
         (if (eq ?clasificacion b) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos romantica)(eq ?atributos2 tragedia)  )then
                    (if (or(eq ?atributos4 neutro)(eq ?atributos3 rupturas)) then
                     (printout t "Deberias ver 500 dias con ella" crlf)
                     (bind ?*global-var7* "Deberias ver 500 dias con ella")
)))))
else
(printout t "No tienes edad para ver la pelicula 500 dias con ella" crlf)
(bind ?*global-var1* "No tienes edad para ver la pelicula 50 dias con ella") 
)

(if (>= ?edad 1)then
(if (or(eq ?generos animacion) (eq ?generos2 fantasia)) then
         (if (eq ?clasificacion aa) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos familia)(eq ?atributos2 tragedia) )then
                    (if (or(eq ?atributos3 animada)(eq ?atributos4 neutro)) then
                     (printout t "Deberias ver Coco" crlf)
                    (bind ?*global-var8* "Deberias ver Coco")
)))))
else
(printout t "No tienes edad para ver la pelicula Coco" crlf)
(bind ?*global-var2* "No tienes edad para ver la pelicula Coco") 
)

(if (>= ?edad 1) then
(if (or(eq ?generos drama) (eq ?generos2 musical)) then
         (if (eq ?clasificacion aa) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos romantica)(eq ?atributos2 musical) )then
                    (if (or(eq ?atributos4 feliz)(eq ?atributos3 familia) ) then
                     (printout t "Deberias ver The Greastest Showman" crlf)
                     (bind ?*global-var9* "Deberias ver The Greastest Showman")
)))))
else
(printout t "No tienes edad para ver la pelicula The Greastest Showman" crlf)
(bind ?*global-var3* "No tienes edad para ver la pelicula The Greastest Showman") 
)

(if (>= ?edad 12) then
(if (eq ?generos drama) then
         (if (eq ?clasificacion b) then
            (if (eq ?idiomas espanol)then
               (if (or(eq ?atributos comedia)(eq ?atributos2 tragedia) )then
                    (if (or(eq ?atributos4 triste)(eq ?atributos3 dramatica)) then
                     (printout t "Deberias ver La lengua de las mariposas" crlf)
                     (bind ?*global-var10* "Deberias ver La lengua de las mariposas")
)))))
else
(printout t "No tienes edad para ver la pelicula La lengua de las mariposas" crlf)
(bind ?*global-var4* "No tienes edad para ver la pelicula La lengua de las mariposas") 
)

(if (>= ?edad 1) then
(if (eq ?generos drama) then
         (if (eq ?clasificacion a) then
            (if (or(eq ?idiomas espanol) (eq ?idiomas2 ingles))then
               (if (or(eq ?atributos familia)(eq ?atributos2 dramatica) )then
                    (if (or(eq ?atributos4 feliz)(eq ?atributos3 comedia)) then
                     (printout t "Deberias ver En busca de la felicidad" crlf)
                     (bind ?*global-var11* "Deberias ver En busca de la felicidad")
)))))
else
(printout t "No tienes edad para ver la pelicula En busca de la felicidad" crlf)
(bind ?*global-var5* "No tienes edad para ver la pelicula En busca de la felicidad") 
)
)

