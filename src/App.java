public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];


        p[0] = new Pessoa("Pedro ", 22, "M");
        p[1] = new Pessoa("Maria ", 25, "F");

        l[0] =  new Livro("Planejamento estratégico", "Jeff", 300, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);

        System.out.println(l[0].detalhes());
        









    }
}
