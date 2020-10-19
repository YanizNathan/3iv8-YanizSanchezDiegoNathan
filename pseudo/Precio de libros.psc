Algoritmo Librosprecio
	precio<- 0
	libros<-0
	precio1<-0
	
	
	escribir "inserte el numero de libros"
	leer libros
	Mientras libros>0 Hacer
		Escribir "inserte el coste del libro"
		leer precio
		libros=libros-1
		precio1=precio1+precio
		
	Fin Mientras
	Si precio1>1000 Entonces
		descuento<-precio1*.2
	SiNo
		
	Fin Si
	Escribir "su descuento es de:" descuento
	Escribir "el precio total es de " precio1-descuento
FinAlgoritmo
