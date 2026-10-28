
package Hospital;
public class TesteHospital {
    public static void main(String[] args) {
        Medico medico = new Medico("122444-DF ", "Neurocirugiao", "078.125.154-35" , "Claudio" , 
                new Exame("10/11/2025",14 ,"Consulta de Rotina", 250.00),
                new Consulta ("15/11/2025" , "15:00" , 25 , "Consulta Especializada" ,1.750), 
        new Medicacao ( "Analgesicos pos cirugia" ,2,   25 , " Remocao De Tumores cerebrais e Espinhais" , 2.500, 
        new Medicamento("Sedativo" ,25)));
        System.out.println(medico);
       
        Paciente paciente = new Paciente("Aguas Claras Qs8" , "6199890-2895" ,"046.270.015-15", "Gilmar Neto" , 
                new Prontuario(1597 , 
                new Procedimento(1 ,"Neurocigia" , 2.5000)),
                new Exame("10/11/2025",14, "Consulta Esepcializada" , 2.5000), 
                new Consulta ("15/11/2025", "15:00" , 25 , "Consulta Especializada" ,2.700),
                new Medicacao( "Medicamento Pos-Cirugia" , 2 , 25, "Anagelsico" ,150 , 
                new Medicamento("Paracetamol" , 250)));
        System.out.println(paciente);
        
        Atendente atendente = new Atendente(250 , 2500.00 , "014.254.454-35" ,"Jessica" , 
        new Consulta("10/11/2025" , "15:00" ,25 ,"COnsulta Marcada para paciente Gilmar" ,2500.00));
        System.out.println(atendente);
         
        PlanoDeSaude planodesaude = new PlanoDeSaude( "7193000" ,"Saude-Saudavel","61 98744-2648" ,
        new Paciente ("Aguas Claras Qs8" , "61 99890-2895" ,"046.270.015-15" , "Gilmar Neto" ,
                new Prontuario (1597 , 
                new Procedimento(25 , "Neurocirugia" , 2500.00)),
                new Exame ("10/11/2025", 14 , "Exame para Cirugia" ,2500.00), 
                new Consulta("15/11/2025" ,"15:00" ,25 ," Consulta antes da Cirugia" , 2500.00),
                new Medicacao("Medicamento pos-cirugia", 2,   250 , "Paracetamol" , 250 , 
                new Medicamento("Paracetamol", 2 ))));
        System.out.println(planodesaude);
    
    }
    
}
