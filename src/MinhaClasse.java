

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("oi, fui execultado");
        // pra execultar a class no terminal separado: > java MinhaClasse
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        System.out.println("ola me chamo "+nome+ " "+sobrenome);
        System.out.println("Tenho "+idade+" anos de idade");
        System.out.println("minha autura é "+altura+ "cm");
        //passando os args no terminal fora da IDE:
       
        // java MinhaClasse Polly rocha 21 1.60//
        // oi, fui execultado
        // ola me chamo Polly rocha
        // Tenho 21 anos de idade
        // minha autura é 1.6cm
        // por conta do Launch, o args foram declarados dentro dele
        // agora ele ta sendo execultado aqui na IDE
    }
}
