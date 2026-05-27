public class sistemainte{
    public static void main(String[]args){
        String[] nombresCuadrillas ={"Los halcones", "Cuadrilla Norte","Fuerza verde"};
        int[][]cosechaSemana = {
            {120,135,110,140,150},//halcones
            {90,105,100,115,120},//Cuadrilla Norte
            {150, 160, 155, 170,165}//Fuerza verde
        };
        generarReporteGeneral(nombresCuadrillas,cosechaSemana);
        public static int cts(int[] rc){
            int suma = 0;
            for (int i = 0; i<rc.length; i++){
                suma = suma + rc[i];
            }
            return suma;
        }
public static void generarReporteGeneral(String[]nombres, int [][]cosechas){
            System.out.println("Reporte semanal cosecha de aguacate");
            System.out.printl();
            System.out.printl(Analizando rendimiento de Cuadrillas);
            int mc = 0;
            String Ganador = "";
            for (int i = 0; i< nombres.lenght; i++){
                int totalcuadrilla = calculartotalsemana(cosechas[i]);
                System.out.printl("Cuadrilla" + nombres[i]+ "total de cajas recolectadas" + totalcuadrilla);
                if (totalcuadrilla > mc){
                    mc = totalcuadrilla;
                    Ganador = nombres[i];
                }

            }

        }


    }
}