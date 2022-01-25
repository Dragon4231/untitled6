import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char[] brokenWorld;
        String matrix, world;
        Scanner scanner = new Scanner(System.in);
        matrix = scanner.nextLine();
        world = scanner.nextLine();
        brokenWorld = world.toCharArray();
        int positionOnMatrix = 0;
        char[][] brokenMatrix = new char[(int)Math.sqrt(matrix.length())][(int)Math.sqrt(matrix.length())];
        for(int i = 0; i < Math.sqrt(matrix.length()); i++){
            for(int j = 0; j < Math.sqrt(matrix.length()); j++){
                brokenMatrix[i][j] = matrix.charAt(positionOnMatrix);
                positionOnMatrix++;
            }
        }
       for(int i = 0; i < world.length(); i++){
            for(int l = 0; l < Math.sqrt(matrix.length()); l++){
                for(int j = 0; j < Math.sqrt(matrix.length()); j++){
                    if(brokenMatrix[l][j] == brokenWorld[i]){
                        System.out.print("["+l+","+j+"]");
                        brokenWorld[i] = ' ';
                        if(i < (world.length() - 1)) System.out.print("->");
                        continue;
                    }
                }
            }
        }
    }
}
