import

java.util.Scanner;

public

class Quiz {

public static void main(String[] args){

double m,monto;

Scanner

sc = new Scanner (System.in);

System.

out.println("Colocar el monto de la compra");

m=sc.nextFloat();

if(m>=500){

monto = m-(m*0.3);

System.

out.println(monto);

}

else{

if(m<500 && m>=200){

monto = m-(m*0.2);

System.

out.println(monto);

}

else{

if(m-200 >=100){

monto = m-(m*0.1);

System.

out.println(monto);

}

}

}

}

}


