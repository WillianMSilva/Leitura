public class Livro implements Publicacao {

   private String titulo;
   private String autor;
   private int totpag;
   private int pagatual;
   private boolean aberto;
   private Pessoa leitor;
 
   

public String detalhes() {
    return "Livro [titulo = " + titulo + "\n, autor = " + autor + "\n, totpag = " + totpag + "\n, pagatual = " + pagatual
            + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() + "\n, idade = " + leitor.getIdade() + "\n, sexo = " + leitor.getSexo();
}


public Livro(String titulo, String autor, int totpag, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totpag = totpag;
    this.leitor = leitor;
    this.aberto = false;
    this.pagatual = 0;
}




public Pessoa getLeitor() {
    return leitor;
}public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
}

public boolean getAberto() {
    return aberto;
}
public void setAberto(boolean aberto) {
    this.aberto = aberto;
        
}

public String getAutor() {
    return autor;
}public void setAutor(String autor) {
    this.autor = autor;
}

public String getTitulo() {
    return titulo;
}public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public int getTotpag() {
    return totpag;
}public void setTotpag(int totpag) {
    this.totpag = totpag;
}

public int getPagatual() {
    return pagatual;
}public void setPagatual(int pagatual) {
    this.pagatual = pagatual;
}



@Override
public void abrir() {
    this.aberto = true;

}


@Override
public void avançarpag() {
    this.pagatual++;    
}


@Override
public void fechar() {
    this.aberto = false;
}


@Override
public void folhear(int p) {
    this.pagatual = p;
}


@Override
public void voltarpag() {
    this.pagatual--;
}
}