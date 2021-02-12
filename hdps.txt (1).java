import java.util.*;
import java.util.Scanner;
import java.io.IOException;
class example
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to Heart Disease Prediction System");
System.out.println("Please enter your name");
String name = sc.next();
System.out.println("Please enter your age");
int age = sc.nextInt();
System.out.println("Thank you");
try
{
Thread.sleep(5000);
}
catch(Exception p)
{
System.out.println(p);
}

System.out.println();
System.out.println();

System.out.println("The term heart disease is often used interchangeably with the term cardiovascular disease.\n Cardiovascular disease generally refers to conditions that involve narrowed or blocked blood vessels that can lead to a heart attack, chest pain (angina) or stroke.");
System.out.println();
System.out.println();
System.out.println("Istructions\n\n\n");
System.out.println("In this Heart Disease Prediction System we will be giving you a few multiple choice questions.\n Depending upon your conditon please enter the correct option.\n It is requested from you to only enter one option and please enter only the avaliable option.");
String [] option = new String[50];
int i=0;
int c=0;

System.out.println("\n\nQ1)Have you ever experienced chest pain, chest pressure and chest discomfort?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch1 = sc.next();
option[i]=ch1;
i++;

System.out.println("\n\nQ2)Have you ever experienced shortness of breath?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch2 = sc.next();
option[i]= ch2;
i++;

System.out.println("\n\nQ3)Have you ever experienced pain, numbness, weakness or coldness in your legs or arms if the blood vessels in those parts of your body are narrowed?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch3 = sc.next();
option[i] = ch3;
i++;

System.out.println("\n\nQ4)Have you ever experienced pain in the neck, jaw, throat, upper abdomen or back?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch4 = sc.next();
option[i] = ch4;
i++;

String e = "a";
for(int j=0;j<4;j++)
{
if(option[j].equals(e))
{
c++;
}
}

if(c==1)
{
System.out.println("Problem of heart disease in your blood vessels is minimum");
}
if(c==2)
{
System.out.println("Problem of heart disease in your blood vessels is average");
}
if(c==3)
{
System.out.println("Problem of heart disease in your blood vessels is average");
}
if(c==4)
{
System.out.println("Problem of heart disease in your blood vessels is high");
}

try
{
Thread.sleep(5000);
}
catch(Exception d)
{
System.out.println(d);
}

System.out.println("\n\n\nQ1)Have you ever experienced fluttering in your chest?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch5 = sc.next();
option[i] = ch5;
i++;

System.out.println("Q2)Have you ever experience racing heartbeat (tachycardia)?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch6 = sc.next();
option[i] = ch6;
i++;
System.out.println("Q3Have you ever experienced low heartbeat (bradycardia)?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch7 = sc.next();
option[i] = ch7;
i++;
System.out.println("Q4)Have you ever experienced chest pain or discomfort?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch8 = sc.next();
option[i] = ch8;
i++;
System.out.println("Q5)Have you ever experienced shortness of breath?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch9 = sc.next();
option[i] = ch9;
i++;

System.out.println("Q6)Have you ever experienced dizziness?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch10 = sc.next();
option[i] = ch10;
i++;

c=0;
for(int j=4;j<10;j++)
{
if(option[j].equals(e))
{
c++;
}
}

if(c==0)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is minimum");
}
if(c==1)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is minimum");
}
if(c==2)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is minimum");
}
if(c==3)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is average");
}
if(c==4)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is average");
}
if(c==5)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is maximum");
}
if(c==6)
{
System.out.println("Problem of heart disease caused by abnormal heartbeats is maximum");
}

try
{
Thread.sleep(5000);
}
catch(Exception w)
{
System.out.println(w);
}
System.out.println("\n\n\nQ1)Have you ever experienced pale gray or blue skin color (cyanosis)?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch11 = sc.next();
option[i] = ch11;
i++;

System.out.println("\nQ2)Have you ever experienced swelling in the legs, abdomen or areas around the eyes?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch12 = sc.next();
option[i] = ch12;
i++;

c=0;
for(int j=10;j<12;j++)
{
if(option[j].equals(e))
{
c++;
}
}

if(c==0)
{
System.out.println("Problem of heart disease caused heart defects is minimum");
}
if(c==1)
{
System.out.println("Problem of heart disease caused by heart defects is minimum");
}
if(c==2)
{
System.out.println("Problem of heart disease caused by heart defects is minimum");
}
try
{
Thread.sleep(5000);
}
catch(Exception m)
{
System.out.println(m);
}

System.out.println("\n\n\nQ1)Have you ever experienced breathlessness with exertion or at rest?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch13 = sc.next();
option[i] = ch13;
i++;

System.out.println("\nQ2)Have you ever experienced swelling of the legs, ankles and feet ?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch14 = sc.next();
option[i] = ch14;
i++;

System.out.println("\nQ3)Have you ever experienced fatigue?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch15 = sc.next();
option[i] = ch15;
i++;

System.out.println("\nQ4)Have you ever experienced irregular heartbeats that feel rapid, pounding or fluttering?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch16 = sc.next();
option[i] = ch16;
i++;

System.out.println("\nQ5)Have you ever experienced dizziness, lightheadedness and fainting?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch17 = sc.next();
option[i] = ch17;
i++;

c=0;
for(int j=12;j<17;j++)
{
if(option[j].equals(e))
{
c++;
}
}

if(c==0)
{
System.out.println("Problem of heart disease caused by caused by weak heart muscle (dilated cardiomyopathy) is minimum");
}
if(c==1)
{
System.out.println("Problem of heart disease caused by caused by weak heart muscle (dilated cardiomyopathy) is minimum");
}
if(c==2)
{
System.out.println("Problem of heart disease caused by caused by weak heart muscle (dilated cardiomyopathy) is minimum");
}
if(c==3)
{
System.out.println("Problem of heart disease caused by caused by weak heart muscle (dilated cardiomyopathy) is average");
}
if(c==4)
{
System.out.println("Problem of heart disease caused by caused by weak heart muscle (dilated cardiomyopathy) is maximum");
}
if(c==5)
{
System.out.println("Problem of heart disease caused by caused by weak heart muscle (dilated cardiomyopathy) is maximum");
}
try
{
Thread.sleep(5000);
}
catch(Exception o)
{
System.out.println(o);
}
System.out.println("\n\n\nQ1)Have you ever experienced fever?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch18 = sc.next();
option[i] = ch18;
i++;

System.out.println("Q2)Have you ever experienced shortness of breath?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch19 = sc.next();
option[i] = ch19;
i++;

System.out.println("Q3)Have you ever experienced weakness or fatigue?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch20 = sc.next();
option[i] = ch20;
i++;

System.out.println("Q4)Have you ever experienced swelling in your legs and abdomen?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch21 = sc.next();
option[i] = ch21;
i++;

System.out.println("Q5)Have you ever experienced changes in your heart rhythm?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch22 = sc.next();
option[i] = ch22;
i++;

System.out.println("Q6)Have you ever experienced dry or persistent cough?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch23 = sc.next();
option[i] = ch23;
i++;

System.out.println("Q7)Have you ever experienced skin rashes or unusual spots?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch24 = sc.next();
option[i] = ch24;
i++;

c=0;
for(int j=12;j<24;j++)
{
if(option[j].equals(e))
{
c++;
}
}

if(c==0)
{
System.out.println("Problem of heart disease caused by caused by heart infection is minimum");
}
if(c==1)
{
System.out.println("Problem of heart disease caused by caused by heart infection is minimum");
}
if(c==2)
{
System.out.println("Problem of heart disease caused by caused by heart infection is minimum");
}
if(c==3)
{
System.out.println("Problem of heart disease caused by heart infection is minimum");
}
if(c==4)
{
System.out.println("Problem of heart disease caused by heart infection is average");
}
if(c==5)
{
System.out.println("Problem of heart disease caused by heart infection is maximum");
}
if(c==6)
{
System.out.println("Problem of heart disease caused by heart infection is maximum");
}
if(c==7)
{
System.out.println("Problem of heart disease caused by heart infection is maximum");
}

try
{
Thread.sleep(5000);
}
catch(Exception v)
{
System.out.println(v);
}
System.out.println("\n\n\nQ1)Have you ever experienced fever?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch25 = sc.next();
option[i] = ch25;
i++;

System.out.println("Q2)Have you ever experienced shortness of breath?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch26 = sc.next();
option[i] = ch26;
i++;

System.out.println("Q3)Have you ever experienced irregular heartbeat?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch27 = sc.next();
option[i] = ch27;
i++;

System.out.println("Q4)Have you ever experienced swellen feet or ankles?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch28 = sc.next();
option[i] = ch28;
i++;

System.out.println("Q5)Have you ever experienced chest pain?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch29 = sc.next();
option[i] = ch29;
i++;

System.out.println("Q6)Have you ever experienced fainting?");
System.out.println("a) Yes");
System.out.println("b) No");
String ch30 = sc.next();
option[i] =  ch30;

c=0;
for(int j=24;j<30;j++)
{
if(option[j].equals(e))
{
c++;
}
}

if(c==0)
{
System.out.println("Problem of heart disease caused by caused by valvular heart disease is minimum");
}
if(c==1)
{
System.out.println("Problem of heart disease caused by caused by valvular heart disease is minimum");
}
if(c==2)
{
System.out.println("Problem of heart disease caused by caused by valvular heart disease is minimum");
}
if(c==3)
{
System.out.println("Problem of heart disease caused by valvular heart disease is average");
}
if(c==4)
{
System.out.println("Problem of heart disease caused by valvular heart disease is average");
}
if(c==5)
{
System.out.println("Problem of heart disease caused by valvular heart disease is maximum");
}
if(c==6)
{
System.out.println("Problem of heart disease caused by valvular heart disease is maximum");
}


}
}
		




	

