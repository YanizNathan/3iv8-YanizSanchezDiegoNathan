Algoritmo ABC
	a <- 0
	b <- 0
	c <- 0
	Escribir 'ingrese el numero a '
	Leer a
	Escribir 'ingrese el numero b '
	Leer b
	Escribir 'ingrese el numero c '
	Leer c
	Mientras a=b Hacer
		Si a=c Entonces
			escribir "todos los digitos son iguales, favor de escribir cantidades distintas"
			Escribir 'ingrese el numero a '
			Leer a
			Escribir 'ingrese el numero b '
			Leer b
			Escribir 'ingrese el numero c '
			Leer c
			
		SiNo
			Escribir 'El valor a y b son los mismos, favor de poner cantidades distintas'
			Escribir 'ingrese el numero a: '
			Leer a
			Escribir 'ingrese el numero b '
			Leer b
		Fin Si
		
	FinMientras
	Mientras a=c Hacer
		Escribir 'El valor a y c son los mismos, favor de poner cantidades distintas'
		Escribir 'ingrese el numero a: '
		Leer a
		Escribir 'ingrese el numero c '
		Leer c
	FinMientras
	Mientras b=c Hacer
		Escribir 'El valor b y c son los mismos, favor de poner cantidades distintas'
		Escribir 'ingrese el numero b: '
		Leer b
		Escribir 'ingrese el numero c '
		Leer c
	FinMientras
	Si a>b Entonces
		Si a>c Entonces
			Si b>c Entonces
				Escribir 'El numero mayor es a: ',a,' y el numero menor es c: ',c
			SiNo
				Escribir 'El numero mayor es a: ',a,' y el numero menor es b: ',b
			FinSi
		SiNo
			Escribir 'EL numero mayor es c: ',c,' y el numero menor es b: ',b
		FinSi
	SiNo
		Si b>c Entonces
			Si a>c Entonces
				Escribir 'El numero mayor es b: ',b,' y el numero menor es c: ',c
			SiNo
				Escribir 'El numero mayor es b: ',b,' y el numero menor es a: ',a
			FinSi
		SiNo
			Escribir 'EL numero mayor es c: ',c,' y el numero menor es a: ',a
		FinSi
	FinSi
FinAlgoritmo
