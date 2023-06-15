package proyecto154;
import java.util.Scanner;
// importantes
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// importantes


public class Pila {
    Scanner e = new Scanner(System.in);
    int max = 50;
    String A[] = new String[max];
    int cima = 0;

    // funciones primitivas

    boolean esVacia() {return cima==0;}
    boolean esLlena() {return cima== max;}

    void adicionar(String x) {
        if(!esLlena()) { cima++; A[cima] = x;}
        else System.out.println("Pila llena");
    }

    String eliminar() {
        String x = "";
        if(!esVacia()) {x = A[cima];cima--;}
        else System.out.println("Pila vacia");
        return x;
    }

    // FUNCIONES MEDIANTE METODOS

    void vaciar(Pila B) {
        while(!esVacia()) {adicionar(B.eliminar());}
    }

    void mostrar() {
        //System.out.println("\nMOSTRAR MENSAJE");
        String elem;
        if(esVacia()) {System.out.println("Pila vacia");}
        else {
            Pila aux = new Pila();
            while(!esVacia()) {
                elem= eliminar();
                aux.adicionar(elem);
                System.out.println(elem);
            }
            while(!aux.esVacia()) {
                adicionar(aux.eliminar());
            }
        }
    }
    public static int menu() {
        Scanner e =new Scanner(System.in);
        int opc = -1;
        do {
            System.out.printf("\n%s", "1.Escribe mensaje secreto:");
            System.out.printf("\n%s", "2.codificar mensaje:");
            System.out.printf("\n%s", "3.mostrar mensaje codificado:");
            System.out.printf("\n%s", "4.Decodificar mensaje (mostrar mensaje original):");
            System.out.printf("\n%s", "5.mostrar pila mensajes guardados (mensajes originales):");
            System.out.printf("\n%s", "6.mostrar pila mensajes guardados (mensajes en pigpeng):");
            System.out.printf("\n%s", "elija opcion");
            opc = e.nextInt();
        }while(opc <0 || opc >6);
        return opc;
    }

    public static void main(String[] args) throws IOException {
        Scanner e =new Scanner(System.in);
        Pila A= new Pila();

        Pila guardaMsjOrg = new Pila();
        Pila contraseñas = new Pila();
        Pila letrasPigpeng = new Pila();
        Pila msjCod = new Pila();
        int opc = -1;
        do {
            switch(menu()) {
                case 1: UNOMsjOrg(guardaMsjOrg,contraseñas);break;
                case 2: DOScodMens(letrasPigpeng,guardaMsjOrg, msjCod);break;
                case 3: TRESmostrarMsjCodificado(msjCod); break;
                case 4: CUATROdecodificar(contraseñas,msjCod,letrasPigpeng); break;
                case 5: guardaMsjOrg.mostrar();break;
                case 6: msjCod.mostrar();break;

            }
        }while(opc !=0);
    }


    public static void UNOMsjOrg(Pila guardaMsjOrg, Pila GuardaPass)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mensaje, password;
        System.out.println("...Leer mensaje:");mensaje = br.readLine();
        guardaMsjOrg.adicionar(mensaje);
        System.out.println("...Leer contraseña:");password = br.readLine();
        GuardaPass.adicionar(password);
    }


    //pila<
    public static void DOScodMens(Pila GuardaLetrasP,Pila guardaMsjOrg, Pila msjCod) {
        if(!guardaMsjOrg.esVacia()) {
            String elem = guardaMsjOrg.eliminar();
            guardaMsjOrg.adicionar(elem);
            for(int i =0; i<elem.length();i++) {
                if(elem.charAt(i)=='A' || elem.charAt(i)=='a') {GuardaLetrasP.adicionar("┘");}
                else if(elem.charAt(i)=='B' || elem.charAt(i)=='b') {GuardaLetrasP.adicionar("U");}
                else if(elem.charAt(i)=='C' || elem.charAt(i)=='c') {GuardaLetrasP.adicionar("L");}
                else if(elem.charAt(i)=='D' || elem.charAt(i)=='d') {GuardaLetrasP.adicionar("]");}
                else if(elem.charAt(i)=='E' || elem.charAt(i)=='e') {GuardaLetrasP.adicionar("O");}
                else if(elem.charAt(i)=='F' || elem.charAt(i)=='f') {GuardaLetrasP.adicionar("[");}
                else if(elem.charAt(i)=='G' || elem.charAt(i)=='g') {GuardaLetrasP.adicionar("┐");}
                else if(elem.charAt(i)=='H' || elem.charAt(i)=='h') {GuardaLetrasP.adicionar("┴");}
                else if(elem.charAt(i)=='I' || elem.charAt(i)=='i') {GuardaLetrasP.adicionar("┌");}
                else if(elem.charAt(i)=='J' || elem.charAt(i)=='j') {GuardaLetrasP.adicionar("╝");} //188
                else if(elem.charAt(i)=='K' || elem.charAt(i)=='k') {GuardaLetrasP.adicionar("Ü");}
                else if(elem.charAt(i)=='L' || elem.charAt(i)=='l') {GuardaLetrasP.adicionar("╚");}
                else if(elem.charAt(i)=='M' || elem.charAt(i)=='m') {GuardaLetrasP.adicionar("╣");}
                else if(elem.charAt(i)=='N' || elem.charAt(i)=='n') {GuardaLetrasP.adicionar("Ö");}
                else if(elem.charAt(i)=='O' || elem.charAt(i)=='o') {GuardaLetrasP.adicionar("╠");}
                else if(elem.charAt(i)=='P' || elem.charAt(i)=='p') {GuardaLetrasP.adicionar("╗");}
                else if(elem.charAt(i)=='Q' || elem.charAt(i)=='q') {GuardaLetrasP.adicionar("╦");}
                else if(elem.charAt(i)=='R' || elem.charAt(i)=='r') {GuardaLetrasP.adicionar("╔");}
                else if(elem.charAt(i)=='S' || elem.charAt(i)=='s') {GuardaLetrasP.adicionar("V");}
                else if(elem.charAt(i)=='T' || elem.charAt(i)=='t') {GuardaLetrasP.adicionar(">");}
                else if(elem.charAt(i)=='U' || elem.charAt(i)=='u') {GuardaLetrasP.adicionar("<");}
                else if(elem.charAt(i)=='V' || elem.charAt(i)=='v') {GuardaLetrasP.adicionar("^");}
                else if(elem.charAt(i)=='W' || elem.charAt(i)=='w') {GuardaLetrasP.adicionar("Æ");}
                else if(elem.charAt(i)=='X' || elem.charAt(i)=='x') {GuardaLetrasP.adicionar("»");}
                else if(elem.charAt(i)=='Y' || elem.charAt(i)=='y') {GuardaLetrasP.adicionar("«");}
                else if(elem.charAt(i)=='Z' || elem.charAt(i)=='z') {GuardaLetrasP.adicionar("Ä");}
                else if(elem.charAt(i)=='_' || elem.charAt(i)==' ') {GuardaLetrasP.adicionar("■");}
                else if(elem.charAt(i)=='Ñ' || elem.charAt(i)=='ñ') {GuardaLetrasP.adicionar("Ñ");}

                else if(elem.charAt(i)=='1') {GuardaLetrasP.adicionar("1");}
                else if(elem.charAt(i)=='2') {GuardaLetrasP.adicionar("2");}
                else if(elem.charAt(i)=='3') {GuardaLetrasP.adicionar("3");}
                else if(elem.charAt(i)=='4') {GuardaLetrasP.adicionar("4");}
                else if(elem.charAt(i)=='5') {GuardaLetrasP.adicionar("5");}
                else if(elem.charAt(i)=='6') {GuardaLetrasP.adicionar("6");}
                else if(elem.charAt(i)=='7') {GuardaLetrasP.adicionar("7");}
                else if(elem.charAt(i)=='8') {GuardaLetrasP.adicionar("8");}
                else if(elem.charAt(i)=='9') {GuardaLetrasP.adicionar("9");}
                else if(elem.charAt(i)=='0') {GuardaLetrasP.adicionar("0");}
            }
            codMensPosicion(GuardaLetrasP,msjCod);
        }
    }

    public static void codMensPosicion(Pila GuardaLetrasP, Pila msjCod) {
        String guardaMensaje ="";
        while(!GuardaLetrasP.esVacia()) {
            String elem = GuardaLetrasP.eliminar();
            guardaMensaje += elem;
        }msjCod.adicionar(guardaMensaje);
        System.out.println("\n===MENSAJE CODIFICADO===");
    }

    // >pila

    public static void TRESmostrarMsjCodificado(Pila msjCod) {
        if(!msjCod.esVacia()) {
            String elem = msjCod.eliminar();
            System.out.println("\n"+elem);
            msjCod.adicionar(elem);
        }
    }

    public static void CUATROdecodificar(Pila contraseñas,Pila msjCod, Pila GuardaLetrasP) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("***INGRESE MENSAJE PIGPEN***");
        String mensajePigpen = br.readLine();
        System.out.println("***INGRESE CONTRASEÑA***");
        String password = br.readLine();

        Pila auxContraseñ = new Pila();
        int pos=0;
        boolean banderita=false;
        if(!contraseñas.esVacia()) {
            String passX = contraseñas.eliminar();

            if(passX.equals(password)) {
                pos++;
                banderita = true;
                System.out.println("\n+++ CONTRASEÑA CORRECTA +++");

                buscaPosicion(mensajePigpen,msjCod,GuardaLetrasP);
            }contraseñas.adicionar(passX);
        }
        //contraseñas.vaciar(auxContraseñ);
        if(!banderita) {
            System.out.println("\nxxX CONTRASEÑA INCORRECTA Xxx");
        }
    }
    public static void buscaPosicion(String mensajePigpen,Pila msjCod,Pila GuardaLetrasP) {
        Pila AuxMsjCod = new Pila();
        while(!msjCod.esVacia()) {
            String elem = msjCod.eliminar();
            AuxMsjCod.adicionar(elem);
            if(elem.equals(mensajePigpen)) {
                for(int i =0; i<mensajePigpen.length();i++) {
                    if(mensajePigpen.charAt(i)=='┘') {GuardaLetrasP.adicionar("A");}
                    else if(mensajePigpen.charAt(i)=='U') {GuardaLetrasP.adicionar("B");}
                    else if(mensajePigpen.charAt(i)=='L') {GuardaLetrasP.adicionar("C");}
                    else if(mensajePigpen.charAt(i)==']') {GuardaLetrasP.adicionar("D");}
                    else if(mensajePigpen.charAt(i)=='O') {GuardaLetrasP.adicionar("E");}
                    else if(mensajePigpen.charAt(i)=='[') {GuardaLetrasP.adicionar("F");}
                    else if(mensajePigpen.charAt(i)=='┐') {GuardaLetrasP.adicionar("G");}
                    else if(mensajePigpen.charAt(i)=='┴') {GuardaLetrasP.adicionar("H");}
                    else if(mensajePigpen.charAt(i)=='┌') {GuardaLetrasP.adicionar("I");}
                    else if(mensajePigpen.charAt(i)=='╝') {GuardaLetrasP.adicionar("J");} //188
                    else if(mensajePigpen.charAt(i)=='Ü') {GuardaLetrasP.adicionar("K");}
                    else if(mensajePigpen.charAt(i)=='╚') {GuardaLetrasP.adicionar("L");}
                    else if(mensajePigpen.charAt(i)=='╣') {GuardaLetrasP.adicionar("M");}
                    else if(mensajePigpen.charAt(i)=='Ö') {GuardaLetrasP.adicionar("N");}
                    else if(mensajePigpen.charAt(i)=='╠') {GuardaLetrasP.adicionar("O");}
                    else if(mensajePigpen.charAt(i)=='╗') {GuardaLetrasP.adicionar("P");}
                    else if(mensajePigpen.charAt(i)=='╦') {GuardaLetrasP.adicionar("Q");}
                    else if(mensajePigpen.charAt(i)=='╔') {GuardaLetrasP.adicionar("R");}
                    else if(mensajePigpen.charAt(i)=='V') {GuardaLetrasP.adicionar("S");}
                    else if(mensajePigpen.charAt(i)=='>') {GuardaLetrasP.adicionar("T");}
                    else if(mensajePigpen.charAt(i)=='<') {GuardaLetrasP.adicionar("U");}
                    else if(mensajePigpen.charAt(i)=='^') {GuardaLetrasP.adicionar("V");}
                    else if(mensajePigpen.charAt(i)=='Æ') {GuardaLetrasP.adicionar("W");}
                    else if(mensajePigpen.charAt(i)=='»') {GuardaLetrasP.adicionar("X");}
                    else if(mensajePigpen.charAt(i)=='«') {GuardaLetrasP.adicionar("Y");}
                    else if(mensajePigpen.charAt(i)=='Ä') {GuardaLetrasP.adicionar("Z");}
                    else if(mensajePigpen.charAt(i)=='■') {GuardaLetrasP.adicionar(" ");}

                    else if(mensajePigpen.charAt(i)=='Ñ') {GuardaLetrasP.adicionar("Ñ");}

                    else if(mensajePigpen.charAt(i)=='1') {GuardaLetrasP.adicionar("1");}
                    else if(mensajePigpen.charAt(i)=='2') {GuardaLetrasP.adicionar("2");}
                    else if(mensajePigpen.charAt(i)=='3') {GuardaLetrasP.adicionar("3");}
                    else if(mensajePigpen.charAt(i)=='4') {GuardaLetrasP.adicionar("4");}
                    else if(mensajePigpen.charAt(i)=='5') {GuardaLetrasP.adicionar("5");}
                    else if(mensajePigpen.charAt(i)=='6') {GuardaLetrasP.adicionar("6");}
                    else if(mensajePigpen.charAt(i)=='7') {GuardaLetrasP.adicionar("7");}
                    else if(mensajePigpen.charAt(i)=='8') {GuardaLetrasP.adicionar("8");}
                    else if(mensajePigpen.charAt(i)=='9') {GuardaLetrasP.adicionar("9");}
                    else if(mensajePigpen.charAt(i)=='0') {GuardaLetrasP.adicionar("0");}
                }

                DECODMensPosicion(GuardaLetrasP);
            }
        }msjCod.vaciar(AuxMsjCod);
    }
    public static void DECODMensPosicion(Pila GuardaLetrasP) {
        Pila aux = new Pila();
        String guardaMensaje ="";
        while(!GuardaLetrasP.esVacia()) {
            String elem = GuardaLetrasP.eliminar();
            guardaMensaje += elem;
        }aux.adicionar(guardaMensaje);

        System.out.println("\n===*MENSAJE DECODIFICADO*===");
        aux.mostrar();
    }
}
