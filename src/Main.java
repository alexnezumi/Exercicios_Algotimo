import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // lista 1
        // exercicio - Faça um programa que leia um número inteiro e o imprima;

       /*
       Scanner grava = new Scanner(System.in);
       int x ;
       System.out.println("Insira um número do tipo inteiro");
       x = grava.nextInt();
        System.out.println("Você digitou " + x);
       */

        // exercicio - Faça um programa que leia um número real e o imprima;

       /*
        Scanner grava = new Scanner(System.in);
        double x ;
        System.out.println("Insira um número do tipo real");
        System.out.println("Você digitou " + y);
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

        DecimalFormat DF = new DecimalFormat("#0.00");

         System.out.println("A circuferancia é " + (DF.format(area)));

       */

        //exercicio - Construa um algoritmo, em Java, em que o usuário digita as coordenadas X e Y de dois
        // pontos do plano cartesiano e o programa retorna a distância entre eles.

        /*

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

         */

        //exercicio - O custo ao consumidor de um carro novo é a soma do custo de fabricação adicionando
        //os impostos e a porcentagem de ganho do distribuidor. Supondo que a porcentagem do
        //distribuidor seja 15%, os impostos sejam de 30%, escreva um programa que leia o custo
        //de fabricação de um carro e retorna o custo ao consumidor.

        /*
        Scanner grava = new Scanner(System.in);
        double cf,pd, imposto, valor ;
        System.out.println("Insira o CF(Custo de fabricação)");
        cf = grava.nextDouble();

        pd = cf * 0.15;
        imposto = cf * 0.30;

        valor = cf + pd + imposto;

        System.out.println("O consumidor paga no final é " + valor);
        */

        // exercicio - Faça um programa que calcula a área de um triângulo retângulo a partir da entrada da
        //base e da altura.

        /*
        Scanner grava = new Scanner(System.in);
        double base,alt,area;

        System.out.println("Insira o valor da base");
        base = grava.nextDouble();

        System.out.println("Insira a altura");
        alt = grava.nextDouble();

        area = (base * alt)/2;

        System.out.println("A área do triângulo retânculo é " + area);
        */

        //exercicio - Sabendo que a distância entre as cidades de Rio de Janeiro e São Paulo é de 400km,
        //elabore um programa que calcule a quantidade de dias que levaria para realizar esta
        //viagem de bicicleta. O usuário digitará a velocidade média ao longo da viagem.

        Scanner grava = new Scanner(System.in);

        double vel,hora,dias;
        int dist = 400;

        System.out.println("A qual velocidade você vai? digite apenas os numeros");
        vel = grava.nextDouble();

        hora = dist/vel;
        dias = hora/24;

        DecimalFormat DF = new DecimalFormat("#0.0");

        System.out.println("Você vai levar cerca de " + (DF.format(dias)) + " dias");




























    }
}

