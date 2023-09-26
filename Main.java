public class Main{
    public static void main(String[] args){
        // Первый пункт
        int[] c1 = new int[15];
        for(int i = 0; i<15; i++){
            c1[i] = i + 1;
        }
        //Второй пункт
        double[] x1 = new double[16];
        for(int i = 0; i < 16; i++){
            x1[i] = ((double)(Math.random() * 8.0) - 5.0);
        }
        // вспомогательные переменные для третьего пункта
        int[] mas = {1, 2, 6, 9, 10, 13, 14};
        boolean f = false;
        //Третий пункт
        double[][] c = new double[15][16];
        for(int i = 0; i < 15; i++){
            //Проверка на наличие элемента в массиве
            f = false;
            for(int k = 0; k < 7; k++){
                if(c1[i] == mas[k]){
                    f = true;
                    break;
                }
            }
            for(int j = 0; j < 16; j++){
                double x = x1[j];
                if(c1[i] == 3){
                    c[i][j] = Math.log(Math.pow((Math.PI / 2) + Math.sqrt(Math.abs(x)), 2));
                } else if(f){
                    c[i][j] = Math.asin(Math.pow(Math.exp((-Math.abs(x))), 2));
                } else{
                    c[i][j] = Math.log(Math.pow(Math.tan(Math.cbrt(Math.tan(Math.pow(x / Math.PI, x)))), 2));
                }

                }
            }
        //Вывод двумерного массива
        for(int j = 0; j < 16; j++){
            System.out.println("");
            for(int i = 0; i < 15; i++){
                System.out.printf(i + 1 + ") " + "%.5f" + " ", c[i][j]);
            }
        }
    }
}


