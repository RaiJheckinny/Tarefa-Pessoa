public class Programa {
    public static void main(String args[]){
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        //Pessoa Fisica
        pessoaFisica.setNome("Marcos");
        pessoaFisica.setIdade(Integer.valueOf(18));
        pessoaFisica.setCPF("000.000.000-00");

        //Pessoa Juridica
        pessoaJuridica.setNome("Pedro");
        pessoaJuridica.setIdade(Integer.valueOf(40));
        pessoaJuridica.setCNPJ("00.000.000/0000-00");

        //Imprimir
        System.out.println(pessoaFisica.getNome());
        System.out.println(pessoaFisica.getIdade());
        System.out.println(pessoaFisica.getCPF());

        System.out.println(pessoaJuridica.getNome());
        System.out.println(pessoaJuridica.getIdade());
        System.out.println(pessoaJuridica.getCNPJ());
    }
}
