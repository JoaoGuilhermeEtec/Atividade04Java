
public class Herança {

    public static void main(String[] args) {

        Cliente C = new Cliente();

        C.setNome("João Guilherme");
        C.setCPF("476.822.548-46");
        C.setTelefone("(11)8199-8492");
        C.setEmail("guilhermealmeida@gamil.com");
        C.setDataNascimento("05/02/2000");
        C.setClienteDesde("08/01/2020");

        C.setclienteDesde("17 de Julho de 2019");

        System.out.println("Nome: " + C.getNome()
                + "\nCPF: " + C.getCPF()
                + "\nTelefone: " + C.getTelefone()
                + "\nEmail: " + C.getEmail()
                + "\nData de Nascimento: " + C.getDataNascimento()
                + "\nCliente desde: " + C.getClienteDesde()
                + "\nCliente desde: " + C.getclienteDesde());

        Funcionario F = new Funcionario();

        F.setNome("Marcelo Augusto");
        F.setCPF("678.914.855-33");
        F.setTelefone("(11)4955-9812");
        F.setEmail("Marceloaugusto12@gmail.com");
        F.setDataNascimento("15/02/1992");
        F.setClienteDesde("05/03/2019");

        F.setRegistro("21785");
        F.setCarteiraTrabalho("Auxiliar administrativo");
        F.setPis("542.17719.44-2");

        System.out.println("\n\nNome: " + F.getNome()
                + "\nCPF: " + F.getCPF()
                + "\nTelefone: " + F.getTelefone()
                + "\nEmail: " + F.getEmail()
                + "\nData de Nascimento: " + F.getDataNascimento()
                + "\nCliente desde: " + F.getClienteDesde()
                + "\nRegistro: " + F.getRegistro()
                + "\nCarteira de Trabalho: " + F.getCarteiraTrabalho()
                + "\nPis: " + F.getPis());

    }

}
