//Essa parte importa as classes que vamos precisar no algoritmo
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//Alunos: Vitor Coutinho, Bruno Santos Costa

//Classe Principal
public class Main{
    //Metodo main
    public static void main(String[] args) throws IOException{
        //Cria as matrizes de adjacência
        AdjMatrix m1 = new AdjMatrix("Graphs/Graphs1.txt", 5);
        AdjMatrix m2 = new AdjMatrix("Graphs/Graphs2.txt", 10);
        AdjMatrix m3 = new AdjMatrix("Graphs/Graphs3.txt", 20);
        AdjMatrix m4 = new AdjMatrix("Graphs/Graphs4.txt", 30);
        AdjMatrix m5 = new AdjMatrix("Graphs/Graphs5.txt", 40);
        AdjMatrix m6 = new AdjMatrix("Graphs/Graphs6.txt", 50);
        AdjMatrix m7 = new AdjMatrix("Graphs/Graphs7.txt", 100);
        //Objetos para o algoritmo de Prim
        PrimMST g1 = new PrimMST("Graphs/Graphs1.txt", "Resposta/Resposta1.txt");
        PrimMST g2 = new PrimMST("Graphs/Graphs2.txt", "Resposta/Resposta2.txt");
        PrimMST g3 = new PrimMST("Graphs/Graphs3.txt", "Resposta/Resposta3.txt");
        PrimMST g4 = new PrimMST("Graphs/Graphs4.txt", "Resposta/Resposta4.txt");
        PrimMST g5 = new PrimMST("Graphs/Graphs5.txt", "Resposta/Resposta5.txt");
        PrimMST g6 = new PrimMST("Graphs/Graphs6.txt", "Resposta/Resposta6.txt");
        PrimMST g7 = new PrimMST("Graphs/Graphs7.txt", "Resposta/Resposta7.txt");
        //Vetores para calcular o tempo de execução
        long[] timeExecutionStart = new long[7];
        long[] timeExecutionFinal = new long[7];
        
        //Primeiro
        timeExecutionStart[0] = System.nanoTime();
        g1.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[0] = System.nanoTime();

        //Segundo
        timeExecutionStart[1] = System.nanoTime();
        g2.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[1] = System.nanoTime();

        //Terceiro
        timeExecutionStart[2] = System.nanoTime();
        g3.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[2] = System.nanoTime();

        //Quarto
        timeExecutionStart[3] = System.nanoTime();
        g4.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[3] = System.nanoTime();

        //Quinto
        timeExecutionStart[4] = System.nanoTime();
        g5.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[4] = System.nanoTime();

        //Sexto
        timeExecutionStart[5] = System.nanoTime();
        g6.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[5] = System.nanoTime();

        //Setimo
        timeExecutionStart[6] = System.nanoTime();
        g7.constructMST(); //Cria a Árvore geradora minima
        timeExecutionFinal[6] = System.nanoTime();
        
        g1.printMTS(); //Imprime a árvore
        g2.printMTS(); //Imprime a árvore
        g3.printMTS(); //Imprime a árvore
        g4.printMTS(); //Imprime a árvore
        g5.printMTS(); //Imprime a árvore
        g6.printMTS(); //Imprime a árvore
        g7.printMTS(); //Imprime a árvore
        //Imprime os tempos de execução
        try{
            PrintWriter fileout = new PrintWriter(new FileWriter("Resposta/TimeExecution.txt"));

            fileout.print("Time Execution Graph1: "  +  (timeExecutionFinal[0] - timeExecutionStart[0]) + "\n");
            fileout.print("Time Execution Graph2: "  +  (timeExecutionFinal[1] - timeExecutionStart[1]) + "\n");
            fileout.print("Time Execution Graph3: "  +  (timeExecutionFinal[2] - timeExecutionStart[2]) + "\n");
            fileout.print("Time Execution Graph4: "  +  (timeExecutionFinal[3] - timeExecutionStart[3]) + "\n");
            fileout.print("Time Execution Graph5: "  +  (timeExecutionFinal[4] - timeExecutionStart[4]) + "\n");
            fileout.print("Time Execution Graph6: "  +  (timeExecutionFinal[5] - timeExecutionStart[5]) + "\n");
            fileout.print("Time Execution Graph7: "  +  (timeExecutionFinal[6] - timeExecutionStart[6]) + "\n");

            fileout.close();
            System.out.println("success...");
        }catch(Exception e){
            System.out.println(e);
        }
    }//Fim main
}//Fim main