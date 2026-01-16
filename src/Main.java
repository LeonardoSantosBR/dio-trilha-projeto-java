import poo.inheritanceAndEncapsulation.Documents;
import poo.classes.SmartTv;
import poo.polimorfism.Birds;
import poo.polimorfism.Tigers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


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

        // ===============================
        // 5. POO
        // ===============================
        Documents person = new Documents(
                1,
                "Lucas Queiroz",
                "lucasqueiroz123@gmail.com",
                "senha@123",
                Date.from(
                        LocalDate.of(1998, 5, 10) // ano, mês, dia
                                .atStartOfDay(ZoneId.systemDefault())
                                .toInstant()),
                "85896328222",
                "CPF",
                "416014652",
                "12345678910"
        );
        Birds bird = new Birds("canarinho", "Thraupidae", "Brazil");
        Tigers tiger = new Tigers("Asian Tiger", "Felidae", "Malaysia");

        bird.fly();
        tiger.hunt();
        System.out.println(person);
    }
}