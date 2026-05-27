public class sistemainte{
    public static void main(String[]args){
        String[] nombresCuadrillas ={"Los halcones", "Cuadrilla Norte","Fuerza verde"};
        int[][]cosechaSemana = {
            {120,135,110,140,150},
            {90,105,100,115,120},
            {150, 160, 155, 170, 165}
        };
        generarReporteGeneral(nombresCuadrillas,cosechaSemana);
        public static int cts(int[] rc){
            int suma = 0;
            for (int i = 0; i<rc.length; i++){
                suma = suma + rc[i];
            }
            return suma;
        }


    }
}