/*
       dP                dP       dP                                                          dP          
       88                88       88                                                          88          
       88d888b. .d8888b. 88d888b. 88d888b. .d8888b. .d8888b. .d8888b. .d8888b. .d8888b. .d888b88 .d8888b. 
       88'  `88 88'  `88 88'  `88 88'  `88 88ooood8 Y8ooooo. 88'  `"" 88'  `"" 88'  `88 88'  `88 88ooood8 
       88    88 88.  .88 88.  .88 88.  .88 88.  ...       88 88.  ... 88.  ... 88.  .88 88.  .88 88.  ... 
       dP    dP `88888P' 88Y8888' 88Y8888' `88888P' `88888P' `88888P' `88888P' `88888P' `88888P8 `88888P' 
                                                                                                    
                                                                                             
                                   i8@@8Li.                t@8000                                   
                                 .GitL:::GGGC;             G8ifGt80LtL11,.                          
                                  C,Li;i8i;Ci:ti  i11i:;i::i00ii;;ifffi;;f@8                        
                                  ,L;0L88iCf;L01f.   ,;  ifG0101f0t:;:;;;1GC                        
                                    t@80CL0LfC,    ,1i :;ii CGti1;G8fi::fCiL:                       
                                      L0C11tGf;      ,1;   L .;:.         Lii                       
                                      ,i0fLGt;f1.    t:                    1.                       
                                    ;0C8Li;t88L;:,,i  :t,          :1 .,  .t                        
                                  18i;i;1fC8tL,      .             ,  1. :L                         
                                1C:;G8Gf;f;             ::::      ;LG0t. iLG0CCi                    
            ..t0fC0tGt,       iC:ifCGCt:             ;,    ;L  i G1G0C11CLCL1C88CGti                
          ,Li;G01f01C::GC.   C8G1;:;:;              t           ii8@@@@@C  ;G81iGfitCtt1tf:         
        .CiGtL,      :0:;8: Gi:i08@8.           ..                .ifft,       iL:.       .1        
       .0CLfi          Ct;;08Cffti1.          .,                                f.  i   it:         
       t1i:L            0GLf:::;;;i          ;.                                 i  :.  ;   ::       
       0@@@;            ,iGt:::;:1          f                                    ;; ,i  i1ti        
       C@@@.             18888@@8C         .f     :t11:                               t. i          
       .8@0               G;:::;C8f      :;.L   ,i   , f                                            
                          ff:C8L;;;: t81,:8::f..f    @1 1                                           
                          G0i:::i8L10@8,,ff,f0L0. t@,.f.1                                           
                           C1:18L:i8;88,:Lf8t:f:   : Lt:.                                           
                           ,80C:::8t:L8f:G@G,:L   ,@8  i   ;i.                                      
                            ,8:::t8i::C8C1@8CfG   f@G i ;;    ;1                                    
                              tC:t8f::,;C8C1L0f     .G1f..1 G@,1                                    
                                i0t01::::::f01,f1,iG0;1  Gf    1                                    
                                   :tC00Lt:.      ;G,       8L1.           
                          .LG:;                    f.  f@@1  t.            
                      ,;.0ttC::::                   L   :t: ,:             
                 i;ftttttttt8:::;                    .L.  :1.              
             .:Gtttttfttttttttf;::;                                        
         i8tttttft::Cttttttttt;::::                                        
         tttC,.;;:::::fttttttttt::::;                                      
       ,::1Lt8;:::::::tttttttttt;:::f                                      
     8:0tttttttG;::::::;tttttttttt:::;                                     
   CtfttttttttttG::::::::tttttttttt:::i                                    
   ttttttttttttttt:::::::;tttttttttC:::                                    
    Gtttttttttttttt:::::::Gtttttttttf::t                                   
    .ttttttttttttttt:L.Cii;tttttttttL;f1                                   
     Lttttttttttttttfift,8ttttttttff            
      Gttttttttttttt0fttttttttt,                
       tttttttt1GGttCtLtG8G                     
        .1ft.i,.  t18i           GGGf;;;:::::;::i;:;C  
                t          .ifi:::;:;1fft11if;L11LLf1itC8fi   
                   ;  C8LttttCCLttttttttG1ft1f        
                   :         t                             
                  ;         ;                 Template-name-->    	TeXtal		 
                 L        t                 
               C       t                      	    Author--->	 Lucas_C/llucbrell/hobbescode         
                 8    C                       
                 ;Ct                          	    License-->    	GNU-license        
  
  
*/




Estos archivos forman parte de una plantilla latex para formatear automáticamente el texto y general el pdf de la memoria del proyecto de fin de módulo. 
Para usarla sólo tienes que conocer un poco de TEX, tener un editor de texto y conocer cómo están estructurados los archivos.


Es necesario también tener instalados los programas pdflatex y bibtex


------------------------
|Estructura de archivos|
------------------------

Directorio	Archivo		Utilidad
----------	-----------	--------

capitulos	book-srt	Orden secuencial de los capítulos a incluir

capitulos	cap?.tex	Texto del capítulo a incluir, aquí es dónde se puede incluir comandos TEX

capitulos	con.tex		Capítulo de conclusiones, colocado el último en book-str 

capitulos	capej.tex	Capítulo con ejemplos de dieversos comandos y cómo puedes usarlos.

capitulos	part?.tex	Nombre y subtítulo de las partes o secciones del proyecto. Cambialo para hacerlo a tu gusto o añade más.

utiles		apn?.tex	Texto del apéndice a introducir.

utiles		apn-str.tex	Orden secuencial de los apéndices a incluir.

utiles		portada.pdf	Portada del proyecto, sustituir por la propia. Debe ser un archivo pdf.
				Si te vale con la página de título y no quieres tener portada borra el archivo ./codigo-fuente/formatos/portada.tex

utiles		libreria.bib	Base de datos de libros,webs,etc., puedes incluir cualquier libro siguiendo editando este fichero siguiendo la estructura de los ya presentes.
				El programa bibtex se encarga de añadirlos al índice y de insertar las diferentes formas de referenciar los libros.

utiles		datos-proyecto	Datos básicos del proyecto, nombre tutor, autor, nombre proyecto. Cámbialos por los tuyos.

imagenes	*.[png,jpg]	Imágenes a incluir, este directorio está establecido por defecto. Coloca ahí tus imágenes y utiliza el comando includegraphix para añadirlas a tu texto.

varios		agr.tex		Agradecimientos, recuerda añadir también o descomentar el archivo dentro de boo-str.

varios		int.tex		Introducción, delante del índice. Activada por defecto.

varios		lft.tex		Licencias, delante del índice. Activada por defecto.

varios		varios-str	Orden secuencial de los capítulos a introducir antes del índice. Descomentar lo que se quiera añadir.

codigo-fuente	main.tex	Archivo a compilar.

codigo-fuente	main.aux	Archivo a compilar.

codigo-fuente	main.pdf	Pdf que surge como resultado de la compilación de los anteriores.

codigo-fuente	formatos/	Directorio en que se encarga de dar formato. texto.tex para el texto, cab-foot.tex para la cabecera etc., *

archivos-ejer			Directorio en el que colocar el código para ser incluido a través de los comandos listings.


----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


* Para el formato se siguieron las siguientes normas propuestas por el Instituto en el archivo 17-18 Instrucciones para el desarrollo de proyectos. IES Abastos (DAM - alumnos) que se resume al final de este archivo. 






Para instalar los paquetes si es  que te faltan con apt-get. Esto último te lo dice el mismo compilador cuando lo ejecutas.

Para compilar el archivo, sólo tienes que acceder al directorio código-fuente y ejecutar los comandos siguientes. Importante usar pdflatex en vez de sólo latex.

pdflatex main.tex
bibtex main.aux
pdflatex main.tex

Después abre main.pdf para comprobar si está todo correcto. 


Otra opción para utilizar esta plantilla es a través de un editor de texto especializado en LATEX. Busca en tu buscador favorito, duckduckgo, google, cualquiera suele valer.



--------------------
|Ejemplo a realizar|
--------------------

Ves al directorio utiles y edita el fichero datos-proyecto con tus datos. No cambies más que los datos que hay entre los corchetes "{}".
Entra en el directorio de capitulos, utiliza un editor de texto para editar el archivo cap2.tex. Escribe y borra lo que quieras. Luego edita el archivo book-str.tex y comprueba que está cap2.
Ahora copia y pega esa línea de código, y colócala en la línea anterior. Cambia la palabra cap2 por capej. Guarda los cambios y desde la consola, o desde tu editor de texto LATEX compila Main.tex.
Finalmente entrando en Main.pdf podrás ver que tienes el capítulo de ejemplos que puedes usar como guía para hacer corta y pegas de comandos LATEX (desde el archivo capej.tex) así como para aprender 
un poco su uso. Antes que el capítulo que editaste. Además, en el capítulo que editaste, se reflejan los cambios.
Puedes ver también que se ha añadido el capítulo ejemplo al índice. 



------------------------------
|Gracias y feliz presentación|
------------------------------

Espero que esta plantilla te sirva de ayuda para la realización de tu proyecto. Un saludo.


-----------------
|Resumen Formato|
-----------------------------------------------------------------------------------------------------------------------------------------------------------

○ En la portada aparecerá, además del título del proyecto, abajo a la derecha el texto siguiente (la fecha es la fecha de exposición pública del proyecto):
Nombre del alumno
Ciclo Administración ... / Desarrollo ...
Memoria del Proyecto de DAM
IES Abastos. Curso 20XX/XX. Grupo 7X. XX de XXXX de 20XX
Tutor individual:: Nombre del profesor
○ Los nombres de los documentos digitales seguirán el siguiente patrón:
IES Abastos. 20XX-XX. Proyecto DAM. 7X. Nombre alumno.pdf
○ Además la copia digital del proyecto si procede se entregará en un fichero zip o carpeta
nombrada siguiendo la nomenclatura del fichero pdf.
○ En el encabezado de página aparecerá: el título de proyecto.
○ En el pie de página: nombre del alumno y número de página.
○ Tipo de fuente: Arial.
○ Tamaño: 11 puntos.
○ Alineación: justificado.
○ Interlineado: 1,2 líneas..
○ Espaciado entre párrafos: 6 puntos.
○ Título:
■ Los epígrafes de capítulos, apartados y subapartados tienen que aparecer
● 4 jerarquizados por la tipografía y con números arábicos subdivididos por puntos, por ejemplo:
		2. CAPÍTULO
			2.1. Apartado
				2.1.1. Sub-apartado
■ Tamaño título nivel 1: 16 puntos.
■ Tamaño título nivel 2: 14 puntos.
■ Tamaño título nivel 3: 12 puntos.
○ Márgenes:
■ Superior (incluye cabecera) e izquierdo: 3 cm.
■ Inferior y derecho: 2 cm.
○ Si se incluyen anexos, estos se identificarán por letras mayúsculas consecutivas.
Ejemplo: Anexo A, Anexo B...
La memoria del proyecto contendrá al menos los siguientes apartados:
○ Índice con el título de todos los apartados y las subdivisiones por orden de aparición en el
texto con la indicación de la página donde comienzan.
○ Introducción, justificación y objetivos del proyecto.
○ Planificación del proyecto.
○ Desarrollo del proyecto.
○ Evaluación y conclusiones finales.
○ Referencias (bibliografía, revistas, webs, etc).
○ Si el alumno lo considera necesario, se podrá incluir una dedicatoria o agradecimiento.

---------------------------------------------------------------------------------------------------------------


Las reglas se cumplieron en todos los casos, con la salvedad de lo descrito a continución. 

*El tipo de letra pues se escogió es Helvetica, por razones de facilidad de uso en sistemas operativos Unix, la inclusión por defecto en el sistema Latex además de ser la fuente madre de la exigida. 
Para muchos, Arial resulta ser una tipografía plagiada de la Helvetica, que una de las referéncias del llamado estilo tipográfico internacional.

*Tampoco se cumplió completamente con la exigencia del tamaño de letra en los Capítulos. Se optó, por dar el tamaño de 16pt a la etiqueta de Capítulo + num. Pero ser rechazó hacer lo mismo con el título del mismo.
Hacer esto último, priva al documento de variedad, además de privar de la importáncia necesaria al título del capítulo.

