Algoritmo Salariodeobrero
	horas<-0
	salario<-16
	extras<-20
	Total<-0
	toex<-0
	Escribir "Escriba la cantidad de horas trabajadas en la semana: "
	Leer horas
	mientras horas>72 Hacer
		Escribir "error, inserte una cantidad de horas aceptada"
		Escribir "Escriba la cantidad de horas trabajadas en la semana: "
		Leer horas
		
	FinMientras
	
		Si horas<=40 Entonces
		Total=salario*horas
		Escribir "su salario es de: " Total
		
	SiNo
		
		Total=(40*salario)+((horas-40)*20)
		toex=((horas-40)*20)
		Escribir "su salario de 40 horas es: " 16*40
		Escribir "su salario de horas extras es: " toex
		Escribir "Su salario es de: " Total
	Fin Si
	
	
FinAlgoritmo
