package mundo;

public class Fibonacci {
    public int numeroIteraciones;
    private int resultado;
    private int num1;
    private int num2;

    public Fibonacci(int numeroIteraciones)
    {
        this.numeroIteraciones=numeroIteraciones;
    }

    public void SucesionFibonacci()
    {
        num1=0;
        num2=1;
        resultado = 0;
        for(int i = 0; i <= numeroIteraciones; i++)
        {
            System.out.println("el numero es: " + resultado);
            resultado = num2 + num1;
            num1 = num2;
            num2 = resultado;
            
        }
        
    }

}


