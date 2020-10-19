Algoritmo comprasotso
	descuento<-0.2
	compra<-0
	total<-0
	Escribir "Escriba el costo de compra: "
	leer compra
	Si compra>500 Entonces
		descuento=compra*descuento
		total=compra-descuento
		Escribir "Su descuento es de: " descuento
		Escribir "El total de su compra es de " total
	SiNo
		total=compra
		Escribir "El total de su compra es de " total
		
	Fin Si
	
	
FinAlgoritmo
