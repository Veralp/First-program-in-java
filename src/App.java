//Para ler e escrever dados em java,na Dio mpadronizamos dqa seguinte forma;
// - new Scanner (System.in): cria cria um leitor de entradas com metodos úte3is com prefixo 'next";
// - System.out.println:-imprime  um txro de saída(Output) e pulando uma linha.

import java.util.Scanner;

public class Desafio{
    public static void main(String[] args)  {
        //le os valores de entradas;
        Scanner leitorDeentrada = new Scanner(System.in);
        float valorSalario = leitorDeentradas.nextfloat();
        float valorBeneficios = leitorDeentradas.nextfloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            //atributo a aliquota de 5% mediante o salario:
            valorImposto = 0.05f * valorSalario;
        
            
       // if(valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            //valorImposto = 0.10f * valorSalario; mudamoa para else para ver 
        } else if(valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
        }else {
            valorImposto = 0.15f * valorSalario;
        }
        //if(valorSalario >= 25000 && valorSalario <= 1100){
            //valorImposto = 0.15f * valorSalario;
        
            //TODO criar as demais condições paar as aliquotas de 10.00% e 15.00%.

            //Calcula e imprime a saída (com 2 casas decimais):
            float saída = valorSalario - valorImposto + valorBeneficios;
            System.out.println("Hello, World!");
    }
}
