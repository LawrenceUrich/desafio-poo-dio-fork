package br.com.dio.desafio.dominio;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.inscreverDev(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Nenhum conteúdo para progredir. Inscreva-se em um bootcamp primeiro.");
        }
    }

    // Progride N conteúdos (se tiver)
    public void progredir(int quantidade) {
        if (quantidade <= 0) {
            System.err.println("Quantidade inválida para progredir: " + quantidade);
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            if (conteudosInscritos.isEmpty()) break;
            progredir();
        }
    }

    // Progride tudo que estiver inscrito
    public void progredirTudo() {
        while (!conteudosInscritos.isEmpty()) {
            progredir();
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return Collections.unmodifiableSet(conteudosInscritos);
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return Collections.unmodifiableSet(conteudosConcluidos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Dev{" +
            "nome='" + nome + '\'' +
            ", inscritos=" + conteudosInscritos.size() +
            ", concluidos=" + conteudosConcluidos.size() +
            ", xpTotal=" + calcularTotalXp() +
            '}';
    }
}
