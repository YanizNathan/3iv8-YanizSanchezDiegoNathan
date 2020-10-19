Algoritmo aparcamiento
	he <- 0
	hs <- 0
	pago <- 0
	Escribir 'Escriba la hora de entrada'
	Leer he
	Escribir 'esciba su hora de salida'
	Leer hs
	Horaestadia <- hs-he
	Si Horaestadia>=1 Entonces
		horarestante <- Horaestadia-1
		pago <- 10+(horarestante*60)
	SiNo
		pago <- 10
	FinSi
	Escribir 'El monto a pagar es: ',pago
FinAlgoritmo
