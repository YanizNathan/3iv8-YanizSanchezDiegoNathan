Algoritmo PRIMOonoprimo
	Definir x,n,contador Como Entero
	Escribir 'Escribe el numero: '
	Leer n
	x <- 1
	contador <- 0
	Mientras x<=n Hacer
		Si n MOD x==0 Entonces
			contador <- contador+1
		FinSi
		x <- x+1
	FinMientras
	Si contador==2 Entonces
		Escribir 'El numero ',n,' es primo'
	SiNo
		Escribir 'El numero ',n,' no es primo'
	FinSi
FinAlgoritmo
