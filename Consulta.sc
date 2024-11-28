/*
-----------------------------------------
Trabajo de Investigacion Funcion Simpson
-----------------------------------------
*/
//Se define primera mente cada una de las funciones con sus respectivos valores
def f1(x: Double): Double = -math.pow(x, 2)+8*x-12
def f2(x: Double): Double = 3*math.pow(x, 2)
def f3(x: Double): Double = (x + 2*math.pow(x, 2)-math.pow(x, 3)+5*math.pow(x, 4))
def f4(x: Double): Double =(2*x+1)/(math.pow(x, 2)+x)
def f5(x: Double): Double = math.exp(x)
def f6(x: Double): Double = 1/ math.sqrt(x - 1)
def f7(x: Double): Double = 1/(1+ math.pow(x, 2))
//Se Define la funcion base de referencia para poder hacer el proceso de los ejercicios anteriores
def metodoIntegracion(funcion: Double=> Double, a: Double, b: Double): Double ={
  val x = (a + b) / 2
  (b - a) * ((funcion(a) + 4 * funcion(x) + funcion(b)) / 6)
}
//Se ejecuta para sacar resultados
metodoIntegracion(f1, 3, 5)
metodoIntegracion(f2, 0, 2)
metodoIntegracion(f3, -1, 1)
metodoIntegracion(f4, 1, 2)
metodoIntegracion(f5, 0, 1)
metodoIntegracion(f6, 2, 3)
metodoIntegracion(f7, 0, 1)

//Se crea una funcion para calcular el rango de Error que tiene
def calcuError(esp: Double, obt: Double): Double= math.abs(esp-obt)

calcuError(7.33, metodoIntegracion(f1, 3, 5))
calcuError(8.0, metodoIntegracion(f2, 0, 2))
calcuError(3.333, metodoIntegracion(f3, -1, 1))
calcuError(1.09861, metodoIntegracion(f4, 1, 2))
calcuError(1.71828, metodoIntegracion(f5, 0, 1))
calcuError(0.828427, metodoIntegracion(f6, 2, 3))
calcuError(0.785398, metodoIntegracion(f7, 0, 1))


