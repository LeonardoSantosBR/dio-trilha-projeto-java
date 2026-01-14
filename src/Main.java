public class Main {
    public static void main(String[] args) throws Exception {

        // ===============================
        // 1. ENTRADA E SAIDA
        // ===============================
        EntryExit.typesEntryExit();

        // ===============================
        // 2. CHAMADA DE FUNCOES
        // ===============================
        Variables.typesVariable();
        Operators.typesOperators();

        // ===============================
        // 3. INSTANCIANDO CLASSE SIMULANDO SMARTTV
        // ===============================
        SmartTv smartTv;
        smartTv = new SmartTv(true, 1, 10, "LG");
        smartTv.changeChannelTo(12);
        smartTv.incrementOrDecrementVolume("INCREMENT");
        System.out.println(smartTv);

        // ===============================
        // 4. EXCEPTIONS e RUNTIMEEXCPETIONS
        // ===============================
        Exceptions.execptions();
        HierarchyExceptions.hierarchyExceptions();
    }
}