import java.util.Scanner;
import java.util.*;
public class CNSPRE3 {

    private static Scanner HUI;

    public static void main(String[] args) {

        HUI = new Scanner(System.in);

        System.out.println("Enter Key:- ");
        String SD = HUI.nextLine();

        String AAA = SD;

        int count = 0;
        int i,j,A;
        char H,K;

        StringBuilder sb = new StringBuilder(AAA);
        A = sb.length();
        for (i=0; i<A; i++) {
            H = sb.charAt(i);
            for(j=i+1; j<A ;j++) {
                K = sb.charAt(j);
                if(H == K || H == K-32 && K-32 >= 65 || H == K+32 && K+32<= 121 ) {
                    if(H == ' ' && K == ' ') {
                        count += 1;
                    }
                    else {
                        sb.deleteCharAt(j);
                        j--;
                    }
                }A = sb.length();
            }
        }

        int DF = sb.length();

        String AA = sb.toString();

        char AQ ;

        StringBuilder UI = new StringBuilder(AA);

        for (i = 0; i<UI.length() ; i++) {
            AQ = UI.charAt(i);
            if(AQ == ' ') {
                UI.deleteCharAt(i);
                i--;
            }
        }

        String GYU = UI.toString();

        int[] ASP = new int[4];
        char[] PSA = {'I','i','J','j'};

        for (i= 0 ; i<ASP.length; i++) {
            char DODO = PSA[i];
            ASP[i] = GYU.indexOf(DODO);
        }

        int SOUT_OP = 0;
        Arrays.sort(ASP);
        StringBuilder AUS = new StringBuilder(GYU);

        for (i=0;i<ASP.length;i++) {
            if(ASP[i]>=0) {
                if(i == ASP.length-1) {
                    SOUT_OP = 1;
                    break;
                }
                else {
                    AUS.deleteCharAt(ASP[i + 1]);
                    SOUT_OP = 1;
                    break;
                }
            }
        }

        String TLU = AUS.toString();

        String XX;

        if(SOUT_OP == 1) {
            XX = "ABCDEFGHKLMNOPQRSTUVWXYZ";
        }
        else {
            XX = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        }
        char DD,FF;
        StringBuilder NZ = new StringBuilder(XX);
        for(i=0; i<TLU.length(); i++) {
            DD = TLU.charAt(i);
            for(j=0;j<NZ.length();j++) {
                FF =  NZ.charAt(j);
                if(DD == FF || DD == FF-32 && FF-32 >= 65 ||  DD == FF+32 && FF+32<= 121) {
                    NZ.deleteCharAt(j);
                }
            }
        }

        String AJ = NZ.toString();

        String SAMP = (TLU.concat(AJ));

        System.out.println(SAMP + "\n");

        int CAD = 0;


        char[][] AF = new char[5][5];
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                AF[i][j] = SAMP.charAt(CAD);
                CAD++;
            }
        }

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print("\t" + AF[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("Enter Plain Text:- ");
        String PLAY = HUI.nextLine();
/*
        char[] PSA = {'I','i','J','j'};*/
  char ODOD;
        int ASWE;
        for (i= 0 ; i<ASP.length; i++) {
            char DODO = PSA[i];

            if(ODOD == 'I')
            {
                ASWE = PLAY.indexOf(DODO);
                break;
            }

            if(ASWE != 0)
            {
                PLAY = PLAY.replace()
            }
        }

        int JONY = 1;
        for(i=0 ; i<PLAY.length(); i++) {
            char ASD = PLAY.charAt(i);
                if(ASD != 'X' && ASD != 'x' ) {
                    JONY = 0;
                }
                else {
                    JONY = 1;
                    break;
                }
        }

        char HJ;
        char JH;

        char ASD ;
        char DSA ;
        int KQ = PLAY.length();
        char US[] = new char[KQ * 2];
        int Q = 0;
        if(JONY == 0) {
            int LA = 1;

            for(i =0 ; i<PLAY.length(); i++) {
                int k = i;

                ASD = PLAY.charAt(k);
                int J = i+1;

                if(J >= PLAY.length()) {
                 if(LA == 1 ) {
                     DSA = 'X';
                 }else {
                     DSA = 'Z';
                     LA = 0;
                 }
                }
                else {
                 DSA = PLAY.charAt(J);
                }

                if(ASD != DSA) {
                        HJ = (char)((char)ASD) ;
                        JH = (char)((char)DSA);
                        i++;
                }
                else {
                        HJ = (char)((char)ASD);
                        JH = (char)((char)'X');
                }
                US[Q] = HJ;
                Q += 1;
                US[Q] = JH;
                Q++;

            }

        }
        else {
            for(i =0 ; i<PLAY.length(); i++) {
                int k = i;

                ASD = PLAY.charAt(k);
                int J = i+1;

                if(J >= PLAY.length()) {
                        DSA = 'Z';
                }
                else {
                    DSA = PLAY.charAt(J);
                }

                if(ASD != DSA) {
                        HJ = (char)((char)ASD );
                        JH = (char)((char)DSA);
                        i++;
                }
                else {
                        HJ = (char)((char)ASD );
                        JH = (char) ((char)'X');
                        i--;
                }
                US[Q] = HJ;
                Q += 1;
                US[Q] = JH;
                Q++;
            }

        }

        char AXZ = 0, POI = 0;
        int I = 0,J = 0,I_1 = 0,J_1 = 0;
        int BB = 0;
        int WS = 0;
        int LP = 0;


        for(int k = 0; k < US.length; k++) {

            if(US[k] == 0) {
                break;
            }

            for (i = 0; i < 5; i++) {
                for (j = 0; j < 5; j++) {

                    if( 'A'<= US[k] && 'Z'>= US[k] || 'a'<= US[k] && 'z'>= US[k]) {
                        AXZ =  US[k];

                        if(AXZ == 'i' || AXZ == 'I') {
                            LP = 1;
                        }
                        else if(AXZ == 'j' || AXZ == 'J') {
                            LP = 2;
                        }else{

                        }



                        if(AXZ >= 'A' && AXZ <='Z') {

                            if(LP == 1) {
                                POI = 'j';
                            }
                            else if(LP == 2){
                                POI = 'i';
                            }else {
                                POI = (char)((char)US[k] + (char)32);
                            }
                        }
                        else if(AXZ >= 'a' && AXZ <= 'z') {
                            if(LP == 1) {
                                POI = 'j';
                            }
                            else if(LP == 2){
                                POI = 'i';
                            }else {
                                POI = (char) ((char) US[k] - (char) 32);
                            }
                        }
                    }


                    if (AXZ == AF[i][j] || POI == AF[i][j]) {
                            I = i;
                            J = j;
                            WS = 1;
                        break;
                    }
                }
                if(WS == 1) {
                    WS =0;
                    break;
                }
            }

                 k = k+1;
            for (int i_1 = 0; i_1< 5; i_1++) {
                for (int j_1 = 0; j_1 < 5; j_1++) {

                    if( 'A'<= US[k] && 'Z'>= US[k] || 'a'<= US[k] && 'z'>= US[k]) {
                        AXZ =  US[k];

                        if(AXZ >= 'A' && AXZ <='Z') {
                            POI = (char)((char)US[k] + (char)32);
                        }
                        else if(AXZ >= 'a' && AXZ <= 'z') {
                            POI = (char)((char)US[k] - (char)32) ;
                        }
                    }


                    if (AXZ == AF[i_1][j_1] || POI == AF[i_1][j_1]) {
                        I_1 = i_1;
                        J_1 = j_1;
                        WS = 1;
                        break;
                    }
                }
                if(WS == 1) {
                    WS = 0;
                    break;
                }
            }


            if(I == I_1) {
                if(J < 4) {
                    J = J+1;
                }else {
                    J = 0;
                }

                if(J_1 < 4){
                    J_1 = J_1 + 1;
                }else {
                    J_1 = 0;
                }

                US[BB] = AF[I][J];
                BB = BB+1;
                US[BB] = AF[I_1][J_1];


            }
            else if(J == J_1) {
                if(I < 4) {
                    I = I+1;
                }else {
                    I = 0;
                }

                if(I_1 < 4){
                    I_1 = I_1 + 1;
                }else {
                    I_1 = 0;
                }

                US[BB] = AF[I][J];
                BB = BB+1;
                US[BB] = AF[I_1][J_1];
            }
            else {
                US[BB] = AF[I][J_1];
                BB = BB+1;
                US[BB] = AF[I_1][J];
            }

        BB++;

        }

        for(i=0; i<=Q; i++) {
            if(US[i] != 0) {
                System.out.print(US[i]);
            }
            else {
                break;
            }
        }

        System.out.print("\n");
    }
}