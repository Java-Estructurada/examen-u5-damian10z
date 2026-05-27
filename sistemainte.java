public class sistemainte{
    public static void main(String[]args){
        String[] nombresCuadrillas ={" Los halcones ", " Cuadrilla Norte "," Fuerza verde "};
        int[][]cosechaSemana = {
            {120,135,110,140,150},//halcones
            {90,105,100,115,120},//Cuadrilla Norte
            {150, 160, 155, 170,165}//Fuerza verde
        };
        generarReporteGeneral(nombresCuadrillas,cosechaSemana);
        }
        public static int calculartotalsemana (int[] rendimiento) { //m1
            int suma = 0;
            for (int i = 0; i<rendimiento.length; i++){
                suma = suma + rendimiento[i];
            }
            return suma;
        }
public static void generarReporteGeneral (String[] nombres, int[][] cosechaSemana){ //m2

            System.out.println("Reporte semanal cosecha de aguacate");
            System.out.println();
            System.out.println("Analizando rendimiento de Cuadrillas");
            int mc = 0;
            String Ganador = "";
            for (int i = 0; i< nombres.length; i++){
                int[] rendimiento = (cosechaSemana[i]);
                int totalcuadrilla = calculartotalsemana(rendimiento);
                System.out.println("Cuadrilla" + nombres[i]+ "total de cajas recolectadas " + totalcuadrilla);
                if (totalcuadrilla > mc){
                    mc = totalcuadrilla;
                    Ganador = nombres[i];
                }

            }
            System.out.println("Cuadrilla campeona: " + Ganador + " con un record de " + mc + " cajas");
        }


    }
