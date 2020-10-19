Algoritmo calificaciones
	califi <- 0
	Escribir 'Escriba la Calificacion Numerica: '
	Leer califi
	Mientras califi<1 Hacer
		Escribir 'Error, Su calificacion debe de ser máyor o igual a 1'
		Escribir 'Escriba la Calificacion Numerica: '
		Leer califi
	FinMientras
	Mientras califi>20 Hacer
		Escribir 'Error, Su calificacion debe de ser menor o igual a 20'
		Escribir 'Escriba la Calificacion Numerica: '
		Leer califi
	FinMientras
	Si califi=1 Entonces
		Escribir 'su Calificacion es F'
	SiNo
		Si califi<=10 Entonces
			Escribir 'Su calificacion es E'
		SiNo
			Si califi<=12 Entonces
				Escribir 'Su calificacion es D'
			SiNo
				Si califi<=15 Entonces
					Escribir 'su calificaciones C'
				SiNo
					Si califi<=18 Entonces
						Escribir 'su Calificacion es B'
					SiNo
						Escribir 'su calificacion es A'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
