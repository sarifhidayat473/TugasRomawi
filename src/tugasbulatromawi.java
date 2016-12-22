import java.io.*;
import java.util.Scanner;
public class tugasbulatromawi {
        public static void main(String []args){
            Scanner input=new Scanner(System.in);
            int bil;
            String hasil="";
// String[] lambang={“M”,”CM”,”D”,”ID”,””};
            System.out.print("Masukkan bilangan yang akan di konversi (1-5000) :");
            bil=input.nextInt();

//while(bil>0);
            do
//for(int i=1;i<=(bil+1);i++)
            {
                if (bil>=1000)
                {
                    hasil+="M";
                    bil=bil-1000;}
                else if (bil>=900)
                {
                    hasil+="CM";
                    bil=bil-900;}
                else if (bil>=500)
                {
                    hasil+="D";
                    bil=bil-500;}
                else if (bil>=400)
                {
                    hasil+="CD";
                    bil=bil-400;}
                else if (bil>=100)
                {
                    hasil+="C";
                    bil=bil-100;}
                else if (bil>=90)
                {
                    hasil+="XC";
                    bil=bil-90;}
                else if (bil>=50)
                {
                    hasil+="L";
                    bil=bil-50;}
                else if (bil>=40)
                {
                    hasil+="XL";
                    bil=bil-40;}

                else if (bil>=10)
                {
                    hasil+="X";
                    bil=bil-10;}
                else if (bil>=9)
                {
                    hasil+="IX";
                    bil=bil-9;}
                else if (bil>=5)
                {
                    hasil+="V";
                    bil=bil-5;}
                else if (bil>=4)
                {
                    hasil+="IV";
                    bil=bil-4;}
                else if (bil>=1)
                {
                    hasil+="I";
                    bil=bil-1;

                }

            }while(bil>0);
            hasil+="";
            System.out.println("bilangan romawinya :"+hasil);
        }
    }
