import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // lista 1
        // exercicio - Faça um programa que leia um número inteiro e o imprima;

       /*
       int x = 5;
        System.out.println(x);
       */
        // exercicio - Faça um programa que leia um número real e o imprima;

       /*
        double x = 12.45;
        System.out.println(x);
       */

        // exercicio - Peça ao usuário para digitar três valores inteiros e imprima a soma deles;

     /*
     Scanner grava = new Scanner(System.in);
     int num1,num2,num3,soma;

     System.out.println("Insira o primeiro número");
     num1 = grava.nextInt();

     System.out.println("insira o segundo número");
     num2 = grava.nextInt();

     System.out.println("Insira o terceiro número");
     num3 = grava.nextInt();

     soma = num1+num2+num3;

     System.out.println("A soma dos números " + num1 + ", " + num2 + " e " + num3 + " é " + soma );
     */

        // exercicio - Peça ao usuário inserir a temperatura em °C e imprima a temperatura em °F

     /*
        Scanner grava = new Scanner(System.in);
        double c, f;

        System.out.println("Insira a temperatura em graus que você deseja converter");
        c= grava.nextDouble();

        f = c * (9.0 / 5.0) + 32;

        System.out.println("O resultado em fahrenheit da temperatura é " + f + " F°");
     */

        // exercicio - Faça para converter a velocidade de km/h para m/s.

     /*
        Scanner grava = new Scanner(System.in);

         double kmh,ms;

        System.out.println("Digite a velocidade em km/h: ");

        kmh = grava.nextDouble();

        ms = kmh / 3.6;

        System.out.printf("Velocidade em m/s: %.2f\n", ms);

      */

        // exercicio - Peça ao usuário inserir um número inteiro e imprima o seu antecessor;

      /*
       Scanner grava = new Scanner(System.in);

       int x;

       System.out.println("Insira um numero inteiro para que eu te mostre seu antecessor");
       x = grava.nextInt();
       x = x - 1;

       System.out.println("O antecessor do número digitado é " + x);

       */

        // exercicio - Peça ao usuário inserir seu ano de nascimento e imprima sua idade;

        /*
        Scanner grava = new Scanner(System.in);
        int idade, ano;
        System.out.println("Insira o ano de seu nascimento");
        ano = grava.nextInt();
        idade = 2025 - ano;
        System.out.println("Você tem ou vai fazer " + idade + " anos");
         */

        // exercicio - Faça um programa que calcula a área de uma circunferência com precisão de 2 casas decimais.

      /*
        Scanner grava = new Scanner(System.in);
        double raio, area;

        System.out.println("Insira o raio da circuferencia");
        raio = grava.nextDouble();

        raio = Math.pow(raio,raio); //Math.pow é usado pra fazer contas com numeros ao quadrado
        area = Math.PI * raio;

        DecimalFormat DF = new DecimalFormat("#.00");

         System.out.println("A circuferancia é " + (DF.format(area)));

       */

        //exercicio - Construa um algoritmo, em Java, em que o usuário digita as coordenadas X e Y de dois
        //pontos do plano cartesiano e o programa retorna a distância entre eles.

        Scanner grava = new Scanner(System.in);
        double x1, x2, y1, y2, d;
        double x,y,raiz;


        System.out.println("Insira o valor de x1  ");
        x1 = grava.nextDouble();

        System.out.println("Insira o valor de x2  ");
        x2 = grava.nextDouble();

        System.out.println("Insira o valor de y1");
        y1 = grava.nextDouble();

        System.out.println("Insira o valor de y2");
        y2 = grava.nextDouble();

        x = x2 - x1;
        x = Math.pow(x,2);

        y = y2 -y1;
        y = Math.pow(y,2);

        d = x + y;

        raiz = Math.sqrt(d);

        System.out.println("A codernada dos pontos digitados é " + raiz);











    }
}

